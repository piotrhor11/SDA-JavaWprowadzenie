package pl.sda.dzien006.geometry;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Figure> list = new ArrayList<>();

        list.add(new Circle(4));
        list.add(new Parallelogram(3, 4, 2));
        list.add(new Ractangle(3, 4));
        list.add(new Trapeze(2, 4, 1));

        for (Figure f : list) {
            System.out.println(f + "area:" + f.getArea() + "per:" + f.getPerimeter());
        }
    }

}
