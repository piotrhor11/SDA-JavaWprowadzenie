package pl.sda.dzien014.Zadania;


public class Task1 {

    public static class Pair<T> {
        protected final T first;
        protected final T second;

        public Pair(T first, T second) {
            this.first = first;
            this.second = second;
        }

        public T getFirst() {
            return first;
        }

        public T getSecond() {
            return second;
        }
    }

    public static class Triple<T> extends Pair<T> {
        private final T third;

        public Triple(T first, T second, T third) {
            super(first, second);
            this.third = third;
        }

        public T getThird() {
            return third;
        }
    }

    public static class HeterogeneusPair<T, W> {
        private final T first;
        private final W second;

        HeterogeneusPair(T first, W second) {
            this.first = first;
            this.second = second;
        }

        public T getFirst() {
            return first;
        }

        public W getSecond() {
            return second;
        }
    }


    public static void main(String[] args) {
        Pair<String> name = new Pair<>("Piotr", "Horbatowski");
        Pair<Double> gpsCoords = new Pair<>(51.345, 16.567);

        System.out.println(name.getFirst() + " " + name.getSecond());
        System.out.println(gpsCoords.getFirst() + " " + gpsCoords.getSecond());
        System.out.printf("A tu są dane GPS: %.2f i %.2f", gpsCoords.first, gpsCoords.second);
        System.out.println();

        Triple<Integer> dimensions = new Triple<>(5, 6, 7);
        System.out.printf("A tu jest suma wymiarów: %d", dimensions.getFirst() + dimensions.getSecond() + dimensions.getThird());
        System.out.println();

        HeterogeneusPair<Integer, String> wpis = new HeterogeneusPair<>(15011982, "Piotr H.");
        System.out.printf("A tu mamy %s %d", wpis.getSecond(), wpis.getFirst());

    }
}
