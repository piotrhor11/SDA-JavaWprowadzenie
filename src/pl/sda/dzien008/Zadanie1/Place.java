package pl.sda.dzien008.Zadanie1;

class Place {
    private String name;
    private int duration;

    Place(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    String getName() {
        return name;
    }

    int getDuration() {
        return duration;
    }

    void setName(String name) {
        this.name = name;
    }

    void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return name + " takes " + duration + " hours to visit";
    }

//    @Override
//    public boolean equals(Object o) {
//        return (Place) o;
//    }
}
