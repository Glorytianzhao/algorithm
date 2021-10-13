package design.structure.proxy.dynamic;

import design.structure.proxy.Car;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicQiCar implements InvocationHandler {

    private Car car;

    public DynamicQiCar(Car car){
        this.car = car;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("汽车加油");
        Object invoke = method.invoke(car, args);
        System.out.println("汽车放汽");
        return invoke;
    }
}
