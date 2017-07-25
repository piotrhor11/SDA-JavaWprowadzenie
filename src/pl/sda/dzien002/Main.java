package pl.sda.dzien002;

import java.util.logging.Logger;

public class Main {
    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        Exams exams1 = new Exams();

        log.info(exams1.toString());
        exams1.setChemistry(2);
        exams1.setMath(5);
        exams1.setPhysics(4.5f);                     //f oznacza, że to będzie float
        exams1.setPolish((float) 4.5);                //Rzutujemy double na float, unikać takiego podejścia
        log.info(exams1.toString());

        Exams exams2;
        exams2 = new Exams(5, 5.0f, 4.5f, 5);       //2-etapowe tworzenie objektu: kreacja i inicjalizacja

        log.info(exams2.toString());

        System.out.println("Ocena z chemii pierwszego: " + exams1.getChemistry());
        System.out.println("Ocena z chemii drugiego: " + exams2.getChemistry());

        System.out.println(String.format("Srednia pierwszego gagatka: %.2f", exams1.getAverage()));         //Formatujemy sobie średnią
        System.out.println("Srednia drugiego gagatka: " + exams2.getAverage());

        System.out.println(exams1.checkPass());
        log.info("Czy drugi zaliczyl examiny: " + exams2.checkPass());      // Musimy zrobic konkatenacje, zeby zamienic typ z boolean na string

        int numOfExams = 4;
        Exams list[] = new Exams[numOfExams];
        list[0] = new Exams(3, 4, 2, 2);
        list[1] = new Exams(4.5f, 4.5f, 5, 4.5f);
        list[2] = new Exams(2, 4, 4.5f, 3);
        list[3] = new Exams(5.5f, 5, 5, 4);

        log.info("Passed:");
        for (Exams ex : list) {
            if (ex.checkPass()) {
                log.info(ex.toString());
            }
        }

        log.info("Failed:");
        for (int i = 0; i < list.length; i++) {
            if (!list[i].checkPass()) {
                log.info(list[i].toString());
                list[i].retestAll();
                if (list[i].checkPass()) {
                    log.info("Udalo sie!!!");
                    log.info(list[i].toString());
                }
            }
        }
    }
}
