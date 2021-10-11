package hw4;


public class Sphere extends SpaceShape {
    private double radius;
    private Vertex2Dor3D vertex;

    public Sphere(Vertex2Dor3D vertex, double radius) {
        this.radius = radius;
        this.vertex = vertex;
        vertex2Dor3DList.add(vertex);
    }


    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getVolume() {
        return 4.0 * Math.PI * Math.pow(radius, 3) / 3.0;
    }

    @Override
    public String toString() {
        return "Sphere: " +
                "\nArea: " + getArea() +
                "\nVolume: " + getVolume();
    }

}
