package design.structure.proxy.statics;

import design.structure.proxy.Car;
import design.structure.proxy.QiCar;

/**
 * 静态代理类
 */
public class ProxyCar implements Car {

    private Car car;

    public ProxyCar() {
        this.car = new QiCar() ;
    }

    @Override
    public void run() {
        System.out.println("汽车加油");
        car.run();
    }
}
