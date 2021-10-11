package hw4;


public class Cuboid extends SpaceShape {
    private final Vertex2Dor3D vertA;
    private double width;
    private double height;
    private double depth;


    public Cuboid(Vertex2Dor3D vertA, double width, double height, double depth) {
        this.vertA = vertA;
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public double getArea() {
        return width * height * 4 + width * depth * 2;
    }

    @Override
    public double getVolume() {
        return width * height * depth;
    }

    @Override
    public String toString() {
        return "Cuboid: " +
                "\nArea: " + getArea() +
                "\nVolume: " + getVolume();
    }


}
