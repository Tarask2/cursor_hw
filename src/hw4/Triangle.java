package hw4;


public class Triangle extends PlaneShape {
    private final Vertex2Dor3D a;
    private final Vertex2Dor3D b;
    private final Vertex2Dor3D c;
    private final double sideAB;
    private final double sideAC;
    private final double sideBC;

    public Triangle(Vertex2Dor3D a, Vertex2Dor3D b, Vertex2Dor3D c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.sideAB = distanceVertex2D(a, b);
        this.sideAC = distanceVertex2D(a, c);
        this.sideBC = distanceVertex2D(b, c);
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - sideAC) * (p - sideAB) * (p - sideBC));
    }


    @Override
    public double getPerimeter() {
        return sideAB + sideAC + sideBC;
    }

    @Override
    public String toString() {
        return "Triangle: " +
                "\nArea: " + getArea() +
                "\nPerimeter: " + getPerimeter();
    }
}
