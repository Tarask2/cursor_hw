package hw4;


public class Circle extends PlaneShape {
    private double radius;
    private Vertex2Dor3D vertex;

    public Circle(Vertex2Dor3D vertex, double radius) {
        this.radius = radius;
        this.vertex = vertex;
        vertex2Dor3DList.add(vertex);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle: " +
                "\nArea: " + getArea() +
                "\nPerimeter: " + getPerimeter();
    }
}