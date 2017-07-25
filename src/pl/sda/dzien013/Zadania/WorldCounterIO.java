package pl.sda.dzien013.Zadania;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class WorldCounterIO {

    public static String readFile(String name) throws IOException {
        Scanner input = null;
        String content = "";
        try {
            Path path = Paths.get(name);
            input = new Scanner(path);
            long start = System.currentTimeMillis();
            while (input.hasNextLine()) {
                content = content + input.nextLine();
            }
            long stop = System.currentTimeMillis();
            System.out.println("Reading file " + (stop - start));
        } finally {
            if (input != null) {
                input.close();
            }
        }
        return content;
    }

    public static HashMap<String, Integer> countWorlds(String text) {
        HashMap<String, Integer> counter = new HashMap<>();

        String noWhiteSpace = text.trim();
//        System.out.println(noWhiteSpace);
        String noSpecialChars = noWhiteSpace.replaceAll("[\\n.\\[\\],()_\\-;?!\\\\]", " ");    // W Regex "\\" jest escapem w Javie, "\\\\" to do usunięcia samego "\"
//        System.out.println(noSpecialChars);
        String noDoubleSpaces = noSpecialChars.replaceAll("\\s+", " ");             // "\\s" jest "\s" w regexie
//        System.out.println(noDoubleSpaces);
        String lowerCase = noDoubleSpaces.toLowerCase();
//        System.out.println(lowerCase);

        String[] words = lowerCase.split(" ");

//        System.out.println(Arrays.toString(words));
        long start = System.currentTimeMillis();
        for (String word : words) {
            if (counter.containsKey(word)) {
                int occurrances = counter.get(word);
                counter.put(word, occurrances + 1);
            } else {
                counter.put(word, 1);
            }
        }
        long stop = System.currentTimeMillis();
        System.out.println("Reading file " + (stop - start));

        return counter;
    }

    private static void writeMapToFile(HashMap wordMap, String name) throws IOException {


        File file = new File(name);
        if (!file.exists()) {
            file.createNewFile();
        }

//        PrintWriter output = new PrintWriter(file);           //POPRAWIC!!!
//        for (Map.Entry entry : wordMap.entrySet()) {
//            output.printf("The word \"%s\" occurs %d times.\n", entry.getKey(), entry.getValue());
//        }
//        output.close();
    }

    //Zadanie 3 z dnia 16
    private static void printSorted(TreeMap<String, Integer> map) {         //Zamienić na hashMapę!!!
        map.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))         //Sortujemy po malejąco, wiec odwracamy e1 i e2
                .forEach(e -> System.out.printf("%s: %d\n", e.getKey(), e.getValue()));
    }

    public static void main(String[] args) {
        String text = null;
        try {
            text = readFile("text.txt");
            HashMap wordMap = countWorlds(text);
//            System.out.println(wordMap);
            writeMapToFile(wordMap, "dic.txt");
            //metoda z zadania z dnia 016
//            printSorted(wordMap);
        } catch (IOException e) {
            System.out.println("File handling error! :(");
        }
    }
}
