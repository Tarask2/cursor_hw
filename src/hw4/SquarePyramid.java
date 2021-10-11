package hw4;


public class SquarePyramid extends SpaceShape {
    private double baseLength;
    private double pyramidHeight;
    private final Vertex2Dor3D baseCenter;

    public SquarePyramid(Vertex2Dor3D baseCenter, double baseLength, double pyramidHeight) {
        this.baseLength = baseLength;
        this.pyramidHeight = pyramidHeight;
        this.baseCenter = baseCenter;
        vertex2Dor3DList.add(baseCenter);
    }

    @Override
    public double getArea() {
        return baseLength * (baseLength + Math.sqrt(baseLength * baseLength + 4 * pyramidHeight * pyramidHeight));
    }

    @Override
    public double getVolume() {
        return baseLength * baseLength * pyramidHeight / 3.0;
    }

    @Override
    public String toString() {
        return "Squere Pyramid: " +
                "\nArea: " + getArea() +
                "\nVolume: " + getVolume();
    }


}
