package design.structure.proxy;

import design.structure.proxy.Car;

public class QiCar implements Car {
    @Override
    public void run() {
        System.out.println("汽车在跑");
    }
}
