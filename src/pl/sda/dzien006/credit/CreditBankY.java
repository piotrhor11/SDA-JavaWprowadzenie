package pl.sda.dzien006.credit;

public class CreditBankY implements Credit {

    private int minTime = 3;
    private int maxTime = 100;
    private int minValue = 10_000;
    private double rate = 1.04;

    @Override
    public double calculate(int value, int months) {
        if (months < minTime || months > maxTime) {
            return 0;
        }
        if (value < minValue) {
            return 0;
        }
        double years = months / 12;
        double overallRate = Math.pow(rate, years);
        double sum = value * overallRate;

        return Math.round(sum / months);
    }
}
