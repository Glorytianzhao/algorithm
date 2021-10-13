package design.structure.bridge.Impl;

import design.structure.bridge.ColorInterface;

public class WhiteColorClass implements ColorInterface {
    @Override
    public void printColor(String shape) {
        System.out.println("白色的:" + shape);
    }
}
