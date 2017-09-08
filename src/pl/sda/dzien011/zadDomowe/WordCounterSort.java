package pl.sda.dzien011.zadDomowe;


import java.util.Comparator;
import java.util.Map;
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
                int occurrences = counter.get(word);
                counter.put(word, occurrences + 1);
            } else {
                counter.put(word, 1);
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        String text = " diwan.!!!sabaka\n,--kj???kj-group?? [Piotr]-diwan_kj(pppp)";
        TreeMap<String, Integer> words = countWorlds(text);
        System.out.println("\nSorted by Key:");
        System.out.println(words);                                       //Sorted by Keys - a standard feature of TreeMAp
        System.out.println("Sorted by Values:");
        Map sortedByOccurrence = sortByValues(words);                     //Sorted by Values - feature was implemented in sortByValues() method
        System.out.println(sortedByOccurrence);
    }

    private static <K, V extends Comparable<V>> Map<K, V> sortByValues(final Map<K, V> map) {

        Comparator<K> valueComparator = (k1, k2) -> {
            int compare = map.get(k1).compareTo(map.get(k2));
            if (compare == 0) {
                return 1;
            } else {
                return compare;
            }
        };

        Map<K, V> sortedByValuesDescOrder = new TreeMap<>(valueComparator.reversed());           //.reversed() allows to change from Ascending order to Descending order
        sortedByValuesDescOrder.putAll(map);
        return sortedByValuesDescOrder;
    }
}
