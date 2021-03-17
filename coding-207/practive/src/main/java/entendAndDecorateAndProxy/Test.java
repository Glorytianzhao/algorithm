package entendAndDecorateAndProxy;

import java.lang.reflect.Proxy;

/**
 * Description:
 * date: 2020/11/4 3:04 下午
 *
 * @author vic.yang
 */
public class Test {

    public static void main(String[] args) {
        QICar qiCar = new QICar();
        BenChiQiCar benChiQiCar = new BenChiQiCar(qiCar);
        benChiQiCar.run();

        System.out.println("------------------");

        ProxyQiCar proxyQiCar = new ProxyQiCar();
        proxyQiCar.run();

        System.out.println("-------------------");
        DynamicProxyQiCar dynamicProxyQiCar = new DynamicProxyQiCar(qiCar);
        Car car = (Car) Proxy.newProxyInstance(qiCar.getClass().getClassLoader(), qiCar.getClass().getInterfaces(), dynamicProxyQiCar);
        car.run();
    }
}
