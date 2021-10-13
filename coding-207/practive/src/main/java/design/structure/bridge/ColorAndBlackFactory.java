package design.structure.bridge;

import design.structure.bridge.Impl.BlackColorClass;
import design.structure.bridge.Impl.WhiteColorClass;

import java.util.HashMap;

public class ColorAndBlackFactory {

    public static HashMap<String, AbstractShapeClass> shapeMap = new HashMap();

    public static HashMap<String, ColorInterface> colorMap = new HashMap();


    static {
        shapeMap.put("Round", new RoundClass());
        shapeMap.put("Circle", new CircleClass());

        colorMap.put("Black", new BlackColorClass());
        colorMap.put("Whrite", new WhiteColorClass());
    }
    //
    public static AbstractShapeClass getColorAndBlackProcesser(String shape, String color) {
        AbstractShapeClass abstractShapeClass = shapeMap.get(shape);
        abstractShapeClass.setColorInterface(colorMap.get(color));
        return abstractShapeClass;
    }


}
