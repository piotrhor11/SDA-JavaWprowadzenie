package pl.sda.dzien001;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Main {

    private static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

//        Prostokat f1 = new Prostokat(7, 14);
//        f1.powiedzCos();
//        System.out.println(f1.obliczObwod());
//        System.out.println(f1.obliczPole());

        List<Uczestnik> lista = new ArrayList<>();
        lista.add(new Uczestnik("Piotr", 35));
        lista.add(new Uczestnik("Piotr2", 28));
        lista.add(new Uczestnik("Piot3", 31));

        lista.get(1).ustawObecnosc();

//        for (Uczestnik u : lista) {
//           log.info(u.toString());
//       }

        for (int i = 0; i < lista.size(); i++) {
            log.info(lista.get(i).toString());
        }
    }
}
