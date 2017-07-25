package pl.sda.dzien004;

public class Palindrome {

    private String text;
    private String textPrepared;

    public Palindrome(String text) {
        this.text = text;
        prepareString();
    }

    private void prepareString() {
        String tmp = "";
        int len = text.length();
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) != ' ') {
                tmp = tmp + text.charAt(i);
            }
        }
        this.textPrepared = tmp.toLowerCase();
    }

    public boolean check() {
        int len = textPrepared.length();
        int len2 = len / 2;
        for (int i = 0; i < len2; i++) {
            if (textPrepared.charAt(i) != textPrepared.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public boolean checkFaster() {
        String trimmed = text.replaceAll(" ", "").toLowerCase();
        String reversed = new StringBuilder(trimmed).reverse().toString();
        return trimmed.equals(reversed);                        // Broń Boże porównywać obiekty operatorem porównania "==", to tylko dla typów prostych!
    }

    @Override
    public String toString() {
        return text;
    }

}
