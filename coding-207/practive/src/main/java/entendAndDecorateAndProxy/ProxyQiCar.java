package entendAndDecorateAndProxy;

/**
 * Description:
 * date: 2020/11/4 3:24 下午
 *
 * @author vic.yang
 */
public class ProxyQiCar implements Car{

    private QICar qiCar;

    public ProxyQiCar(){
        qiCar  = this.qiCar = new QICar();
    }

    public void run() {
        System.out.println("汽车左引擎");
        qiCar.run();
        System.out.println("汽车右引擎");
    }
}
