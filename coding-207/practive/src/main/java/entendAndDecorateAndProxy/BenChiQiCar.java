package entendAndDecorateAndProxy;

/**
 * Description: 装饰器模式
 * 1 持有的对象是被注入的
 *
 * date: 2020/11/4 3:02 下午
 *
 * @author vic.yang
 */
public class BenChiQiCar implements Car{

    public BenChiQiCar(QICar qiCar) {
        this.qiCar = qiCar;
    }
    private QICar qiCar;

    public void run() {
        System.out.println("加上一个助推器");
        qiCar.run();
    }
}
