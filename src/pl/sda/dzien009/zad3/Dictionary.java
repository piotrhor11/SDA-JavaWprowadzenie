package pl.sda.dzien009.zad3;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {

    private HashMap<String, String> dictionary = new HashMap<>();

    public void addWorld(String pl, String ang) {
        dictionary.putIfAbsent(pl.toLowerCase(), ang.toLowerCase());                //Nie nadpisuje w przeciwienstwie do .put()
    }

    public void printDictionary() {
        System.out.println(dictionary);
    }

    public void removeWorld(String polish) {
        dictionary.remove(polish.toLowerCase());
    }

    public void replace(String polish, String english) {
        if (dictionary.containsKey(polish.toLowerCase())) {
            dictionary.put(polish.toLowerCase(), english.toLowerCase());
        }
    }

    public void removeTranslation(String english) {
        String toRemove = "";
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            if (entry.getValue().equals(english.toLowerCase())) {
                toRemove = entry.getKey();
                break;                      //Bez breaka przeszukalibysmy calos i usunelibysmy ostatni znaleziony
            }
        }
        removeWorld(toRemove);              //Usuwamy za petla, bo nie da sie usuwac z kolekcji, ktora przegladamy
    }

}
