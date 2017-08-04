package pl.sda.dzien007.Primes;

public class Sieve extends Prime {

    private boolean[] sieve;

    public Sieve(int n) {
        super(n);
        generateSieve();
        generatePrimes();
    }

    private void generatePrimes() {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (sieve[i]) {
                for (int j = 2 * i; j <= n; j = j + i) {
                    sieve[j] = false;
                }
                sieve[i] = false;
            }
        }
    }

    private void generateSieve() {
        this.sieve = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            sieve[i] = true;
        }
    }

    @Override
    public void printPrimes() {
        for (int i = 2; i <= n; i++) {
            if (sieve[i]) {
                System.out.println(i);
            }
        }

    }
}
