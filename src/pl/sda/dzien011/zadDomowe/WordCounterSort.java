package pl.sda.dzien011.zadDomowe;


import java.util.TreeMap;

public class WordCounterSort {

    public static TreeMap<String, Integer> countWorlds(String text) {
        TreeMap<String, Integer> counter = new TreeMap<>();

        String noWhiteSpace = text.trim();
        System.out.println(noWhiteSpace);
        String noSpecialChars = noWhiteSpace.replaceAll("[.\\[\\],()_\\-;?!\\\\]", " ");    // W Regex "\\" jest escapem w Javie, "\\\\" to do usunięcia samego "\"
        System.out.println(noSpecialChars);
        String noDoubleSpaces = noSpecialChars.replaceAll("\\s+", " ");             // "\\s" jest "\s" w regexie
        System.out.println(noDoubleSpaces);
        String lowerCase = noDoubleSpaces.toLowerCase();
        System.out.println(lowerCase);

        String[] words = lowerCase.split(" ");

//        System.out.println(Arrays.toString(words));

        for (String word : words) {
            if (counter.containsKey(word)) {
                int occurrances = counter.get(word);
                counter.put(word, occurrances + 1);
            } else {
                counter.put(word, 1);
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        printSorted(countWorlds(" diwan.!!!sabaka\n,--kj???kj-group?? [Piotr]-diwan_kj(pppp)"));

    }

    private static void printSorted(TreeMap<String, Integer> map) {
        System.out.println(map.entrySet());
    }
}
