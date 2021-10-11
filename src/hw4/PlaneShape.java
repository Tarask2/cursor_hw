package hw4;

public abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {


    public double distanceVertex2D(Vertex2Dor3D x, Vertex2Dor3D y) {
        return Math.sqrt(Math.pow(x.getX() - y.getX(), 2) + Math.pow(x.getY() - y.getY(), 2));

    }
}

