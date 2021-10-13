package design.structure.decorator;

import design.structure.proxy.Car;

/**
 * Description: 装饰器模式
 * 1 持有的对象是被注入的
 *
 * date: 2020/11/4 3:02 下午
 *
 * @author vic.yang
 */
public class BenChiQiCar implements Car {

    private Car car;

    public BenChiQiCar(Car car) {
        this.car = car;
    }

    public void run() {
        System.out.println("加上一个助推器");
        car.run();
    }
}
