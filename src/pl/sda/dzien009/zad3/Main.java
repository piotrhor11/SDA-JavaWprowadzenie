package pl.sda.dzien009.zad3;

public class Main {

    public static void main(String[] args) {

        Dictionary dic = new Dictionary();
        dic.printDictionary();

        dic.addWorld("chleb", "bread");
        dic.addWorld("pomidor", "tomato");
        dic.addWorld("pies", "dog");
        dic.printDictionary();

        dic.removeWorld("pies");
        dic.printDictionary();

        dic.replace("pomidor", "RotenTomato");
        dic.printDictionary();

        dic.removeTranslation("bread");
        dic.printDictionary();

        DictionaryBetter dicBetter = new DictionaryBetter();
        dicBetter.addWorld("masło", "butter");
        dicBetter.addWorld("masło", "shit");
        dicBetter.addWorld("drzewo", "tree");
        dicBetter.printDictionary();

    }
}
