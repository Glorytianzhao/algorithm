package design.structure.bridge;

import java.util.HashMap;

public class ShapeFactory {

    public static HashMap<String, AbstractShapeClass> shapeMap = new HashMap();


    static {
        shapeMap.put("Round", new RoundClass());
        shapeMap.put("Circle", new CircleClass());


    }
    //
    public static AbstractShapeClass getColorAndBlackProcesser(String shape) {
        AbstractShapeClass abstractShapeClass = shapeMap.get(shape);
        return abstractShapeClass;
    }


}
