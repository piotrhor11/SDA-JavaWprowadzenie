package pl.sda.dzien003;

public class drawLetters {

    private char[] literki = {'A', 'B', 'R', 'A', 'K', 'A', 'D', 'A', 'B', 'R', 'A'};
    private int n;

    public drawLetters(int n) {
        this.n = n;
    }


    public void drawLetterTree() {
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            //           for (int j = 0; (j < i + 1) && (j < literki.length); j++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(literki[k++ % literki.length] + " ");
            }
            System.out.print("\n");
        }
    }

}



