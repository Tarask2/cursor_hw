package hw4;


public class Rectangle extends PlaneShape {
    private Vertex2Dor3D vertex;
    private double length;
    private double breadth;

    public Rectangle(Vertex2Dor3D vertex, double length, double breadth) {
        this.vertex = vertex;
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double getArea() {
        return length * breadth;
    }


    @Override

    public double getPerimeter() {
        return 2 * (length + breadth);
    }

    @Override
    public String toString() {
        return "Rectangle: " +
                "\nArea: " + getArea() +
                "\nPerimeter: " + getPerimeter();
    }
}
