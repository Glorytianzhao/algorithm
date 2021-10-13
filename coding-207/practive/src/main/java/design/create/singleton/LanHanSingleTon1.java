package design.create.singleton;

/**
 * 懒汉单例
 * 非双重锁定,效率不高
 */
public class LanHanSingleTon1 {

    private  static LanHanSingleTon1 lanhanSingleTon1;

    public LanHanSingleTon1(){}

    public static synchronized LanHanSingleTon1 getObject(){
        if (lanhanSingleTon1 == null){
            return new LanHanSingleTon1();
        }
        return lanhanSingleTon1;
    }
}
