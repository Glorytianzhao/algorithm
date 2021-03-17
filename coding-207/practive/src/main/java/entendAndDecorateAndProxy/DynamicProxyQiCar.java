package entendAndDecorateAndProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Description:
 * date: 2020/11/4 3:27 下午
 *
 * @author vic.yang
 */
public class DynamicProxyQiCar implements InvocationHandler{

    private QICar qiCar;

    public DynamicProxyQiCar(QICar qiCar) {
        this.qiCar = qiCar;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("汽车加油");
        Object invoke = method.invoke(qiCar, args);
        System.out.println("汽车放汽");
        return invoke;
    }
}
