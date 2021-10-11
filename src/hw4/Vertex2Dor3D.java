package hw4;

public class Vertex2Dor3D {
    private final double x;
    private final double y;
    private final double z;


    public Vertex2Dor3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vertex2Dor3D(double x, double y) {
        this.x = x;
        this.y = y;
        z = 0;
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public double distanceVertex2D(Vertex2Dor3D distance) {
        return Math.sqrt(
                (this.x - distance.x) * (this.x - distance.x) +
                        (this.y - distance.y) * (this.y - distance.y));
    }

    public double distanceVertex3D(Vertex2Dor3D distance) {
        return Math.sqrt(Math.pow(this.getX() - distance.getX(), 2) +
                Math.pow(this.getY() - distance.getX(), 2) +
                Math.pow(this.getZ() - distance.getZ(), 2));


    }

}
