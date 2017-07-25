package pl.sda.dzien006.credit;

public class CreditOld {

    private int minValue = 1_000;           // "_" to tylko specjalny sposob formatowani dla wygody ulomnego programisty
    private int maxValue = 200_000;
    private int minTime = 6;
    private int maxTime = 48;

    private double rate1 = 1.025;
    private double rate2 = 1.05;
    private double rate3 = 1.1;
    private int rate1MaxRange = 12;
    private int rate2MaxRange = 24;

    public double calculate(int value, int months) {
        if (value > maxValue || value < minValue) {
            return 0;
        }
        if (months > maxTime || months < +minTime) {
            return 0;
        }

        double sum;
        if (months <= rate1MaxRange) {
            sum = value * rate1;
        } else if (months <= rate2MaxRange) {
            sum = value * rate2;
        } else {
            sum = value * rate3;
        }
        return Math.round(sum / months);
    }

    public static void main(String[] args) {
        CreditOld credit = new CreditOld();
        System.out.println(credit.calculate(10100, 9));
        System.out.println(credit.calculate(100000, 20));
    }

}
