package hw4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> listShape = new ArrayList<>();
        listShape.add(new Triangle(new Vertex2Dor3D(1, 1), new Vertex2Dor3D(3, 4), new Vertex2Dor3D(4, 4)));
        listShape.add(new Circle(new Vertex2Dor3D(1, 1), 5));
        listShape.add(new Rectangle(new Vertex2Dor3D(3, 2), 10, 2));
        listShape.add(new Sphere(new Vertex2Dor3D(1, 1, 1), 5));
        listShape.add(new Cuboid(new Vertex2Dor3D(1, 1, 1), 5, 5, 5));
        listShape.add(new SquarePyramid(new Vertex2Dor3D(2, 2, 2), 5, 10));

        for (Shape a : listShape) {
            System.out.println(a + "\n");
        }
    }
}


