package pl.sda.dzien011.zadDomowe;

import java.util.HashMap;

public class WordCounter {

    public static HashMap<String, Integer> countWorlds(String text) {
        HashMap<String, Integer> counter = new HashMap<>();

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
        System.out.println(countWorlds(" diwan.!!!sabaka\n,--kj???kj-group?? [Piotr]-diwan_kj(pppp)"));

    }
}
