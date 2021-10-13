package design.structure.proxy;

import design.structure.proxy.dynamic.DynamicQiCar;

import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) {

        QiCar qiCar = new QiCar();
        DynamicQiCar dynamicProxyQiCar = new DynamicQiCar(qiCar);

        Car car = (Car)Proxy.newProxyInstance(qiCar.getClass().getClassLoader(), qiCar.getClass().getInterfaces(),dynamicProxyQiCar);
        car.run();
    }
}
