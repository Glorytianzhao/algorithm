package design.structure.bridge;

public abstract class AbstractShapeClass {

    public ColorInterface colorInterface;

    public void setColorInterface(ColorInterface colorInterface) {
        this.colorInterface = colorInterface;
    }


    public abstract void draw();
}
