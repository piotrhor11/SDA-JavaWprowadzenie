package pl.sda.dzien008.Zadanie1;

import java.util.ArrayList;

public class Trip {

    private ArrayList<Place> route = new ArrayList<>();

    public void addPlace(Place place) {
        this.route.add(place);
    }

    public void removePlace(Place place) {
        route.remove(place);
    }

    public void printRoute() {
        for (Place place : route) {
            System.out.println(place);              // automatycznie wywolywana jest metoda toString()
        }
    }

    public int calculateDuration() {
        int sum = 0;
        for (Place place : route) {
            sum += place.getDuration();
        }
        return sum;
    }

    public void setPlace(int index, Place place) {
        if (index >= route.size()) {
            addPlace(place);
        } else {
            route.set(index, place);
        }
    }

}
