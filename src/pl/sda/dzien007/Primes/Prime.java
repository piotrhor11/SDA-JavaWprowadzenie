package pl.sda.dzien007.Primes;

public abstract class Prime {
    protected int n;

    public Prime(int n) {
        this.n = n;
    }

    public abstract void printPrimes();
}
