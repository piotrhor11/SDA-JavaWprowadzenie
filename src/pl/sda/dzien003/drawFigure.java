package pl.sda.dzien003;

public class drawFigure {
    private char pixel = '*';
    private int n;

    public drawFigure(int n) {
        this.n = n;
    }

    public void drawRactangle() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n; j++) {
                System.out.print(pixel);
            }
            System.out.print("\n");
        }
    }

    public void drawTrangle() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pixel);
            }
            System.out.print("\n");
        }
    }

    public void drawTree() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {           //n-i
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {           //j<2*i-1
                System.out.print(pixel);
            }
            System.out.print("\n");
        }
    }

}
