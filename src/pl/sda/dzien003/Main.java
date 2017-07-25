package pl.sda.dzien003;

import java.util.logging.Logger;

public class Main {

    static Logger log = Logger.getLogger(pl.sda.dzien002.Main.class.getName());

    public static void main(String[] args) {

        //Zad2
        Temperature t1 = Temperature.fromCelcius(24);
        Temperature t2 = Temperature.fromFahreinheit(10);
        Temperature t3 = Temperature.fromKelvin(56);

        System.out.println(String.format("Temperatura (w Celcjuszach) t1 = %.0f, t2 = %.0f, t3 = %.0f", t1.getCelcius(), t2.getCelcius(), t3.getCelcius()));
        System.out.println(String.format("Temperatura (w Kelvinach) t1 = %.0f, t2 = %.0f, t3 = %.0f", t1.toKelvin(), t2.toKelvin(), t3.toKelvin()));
        System.out.println(String.format("Temperatura (w Fahreinheita) t1 = %.0f, t2 = %.0f, t3 = %.0f", t1.toFahrenheit(), t2.toFahrenheit(), t3.toFahrenheit()));


        //Zad3
        drawFigure figura = new drawFigure(5);
        figura.drawRactangle();

        //Zad4
        drawLetters a = new drawLetters(45);
        a.drawLetterTree();
        
        //Zad5
        figura.drawTrangle();
        figura.drawTree();

    }
}
