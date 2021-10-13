package design.structure.bridge;

public class BrigerClient {

    public static void main(String[] args) {

//        BlackColorClass blackColorClass = new BlackColorClass();
//        RoundClass roundClass = new RoundClass();
//        roundClass.setColorInterface(blackColorClass);
//        roundClass.draw();

        //ColorAndBlackFactory.getColorAndBlackProcesser("Circle","Whrite").draw();

        AbstractShapeClass circle = ShapeFactory.getColorAndBlackProcesser("Circle");
        circle.setColorInterface(ColorFactory.getColorAndBlackProcesser("Whrite"));
        circle.draw();

    }
}
