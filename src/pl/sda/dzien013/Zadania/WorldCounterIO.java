package pl.sda.dzien013.Zadania;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
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
            System.out.println("Reading from file " + (stop - start) + " ms");
        } finally {
            if (input != null) {
                input.close();
            }
        }
        return content;
    }

    private static HashMap<String, Integer> countWords(String text) {
        HashMap<String, Integer> counter = new HashMap<>();

        long start1 = System.currentTimeMillis();

        String noWhiteSpace = text.trim();
        //W Regex "\\" jest escapem w Javie, "\\\\" to do usunięcia samego "\"
        String noSpecialChars = noWhiteSpace.replaceAll("[\\n.\\[\\],()_\\-;?!\\\\]", " ");
        // "\\s" jest "\s" w regexie
        String noDoubleSpaces = noSpecialChars.replaceAll("\\s+", " ");
        String lowerCase = noDoubleSpaces.toLowerCase();
        String[] words = lowerCase.split(" ");
//        System.out.println(Arrays.toString(words));

        long stop1 = System.currentTimeMillis();
        System.out.println("Preparing text for counting (trimming, stripping off white signs and surplus spaces, converting all to lower case and then splicing: " + (stop1 - start1) + " ms");

        long start2 = System.currentTimeMillis();

        for (String word : words) {
            if (counter.containsKey(word)) {
                int occurrances = counter.get(word);
                counter.put(word, occurrances + 1);
            } else {
                counter.put(word, 1);
            }
        }

        long stop2 = System.currentTimeMillis();
        System.out.println("Counting words " + (stop2 - start2) + " ms");

        return counter;
    }

    private static void writeMapToFile(HashMap wordMap, String name) throws IOException {

        long start = System.currentTimeMillis();

        File file = new File(name);
        if (!file.exists()) {
            file.createNewFile();
        }
        PrintWriter output = new PrintWriter(file);
        wordMap.forEach((key, value) -> output.printf("The word \"%s\" occurs %d times.\n", key, value));
        output.close();

        long stop = System.currentTimeMillis();
        System.out.println("Writing to file has taken  " + (stop - start) + " ms");
    }

    //Zadanie 3 z dnia 16
    private static void printSorted(TreeMap<String, Integer> map) {         //ToDo Zamienić na hashMapę!!!
        map.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))         //Sortujemy po malejąco, wiec odwracamy e1 i e2
                .forEach(e -> System.out.printf("%s: %d\n", e.getKey(), e.getValue()));
    }

    public static void main(String[] args) {
        String text = null;
        try {
            text = readFile("text.txt");
            HashMap wordMap = countWords(text);
            writeMapToFile(wordMap, "dic.txt");
            //metoda z zadania z dnia 16
//            printSorted(wordMap);
        } catch (IOException e) {
            System.out.println("File handling error! :(");
        }
    }
}
