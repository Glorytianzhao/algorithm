package design.structure.bridge;

public class CircleClass extends AbstractShapeClass{
    @Override
    public void draw() {
        colorInterface.printColor("正方形");
    }
}
