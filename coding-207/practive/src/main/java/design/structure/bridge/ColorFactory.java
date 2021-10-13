package design.structure.bridge;

import design.structure.bridge.Impl.BlackColorClass;
import design.structure.bridge.Impl.WhiteColorClass;

import java.util.HashMap;

public class ColorFactory {

    public static HashMap<String, ColorInterface> colorMap = new HashMap();


    static {

        colorMap.put("Black", new BlackColorClass());
        colorMap.put("Whrite", new WhiteColorClass());
    }
    //
    public static ColorInterface getColorAndBlackProcesser(String color) {
        ColorInterface abstractShapeClass = colorMap.get(color);
        return abstractShapeClass;
    }


}
