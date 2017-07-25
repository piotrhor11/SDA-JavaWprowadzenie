package day9;

/**
 * Created by sp0rk on 06/07/17.
 */
class Place {

    private String name;
    private int duration;

    Place(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    String getName(){
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getDuration() {
        return duration;
    }

    void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return name + " takes " + duration + " hours to visit";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Place place = (Place) o;

        return name != null ? name.equals(place.name) : place.name == null;
    }

    @Override
    public int hashCode() {
        if (name != null) {
            return name.hashCode();
        }
        else {
            return 0;
        }
    }
}
