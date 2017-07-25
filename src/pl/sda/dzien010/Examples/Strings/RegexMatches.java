package day10.Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by sp0rk on 09/07/17.
 */
public class RegexMatches {

    public static void main(String args[]) {

        String line = "julian.jurec@gmail.co.uk";
        String pattern = "((\\w+\\.)*\\w+)@\\w+(\\.\\w{2,3}){1,2}";

        Pattern r = Pattern.compile(pattern);

        Matcher m = r.matcher(line);
        if (m.find()) {
            for (int i = 0; i <= m.groupCount(); i++) {        // <=, a nie =, bo zwraca o 1 za mało, liczone sa całosć i wszystkie grupy
                System.out.println("Found value: " + m.group(i));
            }
        } else {
            System.out.println("NO MATCH");
        }
    }
}