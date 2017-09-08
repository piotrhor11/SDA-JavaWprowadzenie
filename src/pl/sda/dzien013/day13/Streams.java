package pl.sda.dzien013.day13;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sp0rk on 12/07/17.
 */
public class Streams {
    public static void main(String[] args) {
        try {
            readCharsFromConsole();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readCharsFromConsole() throws IOException {
        InputStreamReader inputReader = null;
        try {
            inputReader = new InputStreamReader(System.in);
            System.out.println("Enter characters, 's' to stop.");
            char c;
            do {
                c = (char) inputReader.read();
                System.out.println(c);
            } while (c != 's');
        } finally {
            if (inputReader != null) {
                inputReader.close();
            }
        }
    }
}
