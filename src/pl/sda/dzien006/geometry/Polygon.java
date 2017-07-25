package pl.sda.dzien006.geometry;

public abstract class Polygon extends Figure {
    private int numOfVertices;

    protected Polygon(int numOfVertices) {
        this.numOfVertices = numOfVertices;
    }

    public int getNumOfVertices() {
        return numOfVertices;
    }

}
