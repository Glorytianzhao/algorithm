package design.structure.bridge;

public class RoundClass extends AbstractShapeClass {
    @Override
    public void draw() {
        colorInterface.printColor("圆形");
    }
}
