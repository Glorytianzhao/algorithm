package design.structure.bridge.Impl;

import design.structure.bridge.ColorInterface;

public class BlackColorClass implements ColorInterface {
    @Override
    public void printColor(String shape) {
        System.out.println("黑色的:" + shape);
    }
}
