package pl.sda.dzien016.Examples;

import java.util.*;

/**
 * Created by sp0rk on 17/07/17.
 */
public class Main {
    public static void main(String[] args) {
//        lambdaRunnable();
//        parametrizedLambdas();
//        lambdasCollections();
        optionals();
    }

    private static void lambdaRunnable() {
        Runnable a = new Runnable() {
            @Override
            public void run() {
                System.out.println("A");
            }
        };

        Runnable b = () -> System.out.println("B");

        a.run();
        b.run();
    }

    interface ArithmeticOperator {

        double invoke(double a, double b);

    }

    interface UnaryOperator {

        double invoke(double a);
    }

    private static void parametrizedLambdas() {
        ArithmeticOperator plus = (double x, double y) -> {
            return x + y;
        };
        ArithmeticOperator minus = (double x, double y) -> x - y;
        ArithmeticOperator times = (x, y) -> x * y;
        UnaryOperator square = x -> x * x;

        System.out.println(plus.invoke(4, 8));
        System.out.println(minus.invoke(4, 8));
        System.out.println(times.invoke(4, 8));
        System.out.println(square.invoke(4));
    }

    private static void lambdasCollections() {
        List<Integer> list = new ArrayList<>();     //Możemy napisać tylko List, bo ArrayList dziedziczy po List
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);       //Używamy utilsa - metody addAll() z paczki Collections

        list.forEach(i -> System.out.println(i));       //Wrzucamy do For Each lambdę
//        list.forEach(System.out::println);        TO SAMO CO WYŻEJ        //Podajemy paczkę (System.out) oraz metodę (println) oddzielone "::".

        System.out.println("----");
        HashMap<String, Integer> score = new HashMap<>();
        score.put("Julian", 3);
        score.put("Karol", 9);
        score.put("Piotrek", 4);
        score.put("Radek", 6);
        score.put("Przemek", 8);
        score.put("Magda", 2);
        score.forEach((k, v) -> System.out.printf("Key: %s|Value: %d\n", k, v));

        System.out.println("----");
        list.stream()
                .filter(i -> i % 3 == 0)            //Zwraca nam obrobiony Stream
                .forEach(i -> System.out.println(i + " jest podzielna przez 3"));

        System.out.println("----");
        list.stream()
                .filter(i -> i % 5 == 0)
                .map(i -> i * i)
                .forEach(System.out::println);

        System.out.println("----");
        System.out.println(list.stream()
                .filter(i -> i < 5)
                .reduce((a, b) -> a + b)
                .get());     //reduce zwraca 1 element

        System.out.println("----");
        list.stream()
                .limit(10)
                .sorted(Comparator.reverseOrder())
                .forEach(i -> System.out.print(i + " "));

        System.out.println("\n----");
        list.stream()
                .sorted(Comparator.reverseOrder())
                .limit(10)
                .forEach(i -> System.out.print(i + " "));

        System.out.println("\n----");
        score.entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))     //sorted() spodziewa się 1,0,-1 co powie jej o relacji pomiędzy dwoma elementami
                .forEach(e -> System.out.printf("K:%s|V:%d\n", e.getKey(), e.getValue()));

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(1);
        integers.add(-2);
//        integers.stream().sorted((a,b)->a.compareTo(b));
        System.out.println(integers.stream().sorted((a, b) -> a - b));           //To samo co wyżej
    }

    private static void optionals() {
        Optional<String> citizenship = Optional.of("Polish");
        String answer1 = "English";
        String answer2 = null;

        System.out.println("notempty :" + citizenship);
        System.out.println("notempty : " + citizenship.get());
        System.out.println("empty : " + Optional.empty());

        System.out.println("ofNullable @ notempty : " + Optional.ofNullable(answer1));
        System.out.println("ofNullable @ empty : " + Optional.ofNullable(answer2));

//        System.out.println("of @ empty: " + Optional.of(answer2)); // NullPointerException

        System.out.println("----");

        Optional<Integer> toSquare = Optional.of(8);
        toSquare.ifPresent(o -> System.out.println(o * o));
        toSquare = Optional.empty();
        toSquare.ifPresent(o -> System.out.println(o * o));
    }
}
