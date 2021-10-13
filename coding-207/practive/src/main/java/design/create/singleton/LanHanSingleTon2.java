package design.create.singleton;

/**
 * 懒汉单例
 * 双重锁定,效率不高
 */
public class LanHanSingleTon2 {

    private volatile static LanHanSingleTon2 lanHanSingleTon2;

    public LanHanSingleTon2() {
    }

    public static synchronized LanHanSingleTon2 getObject() {
        if (lanHanSingleTon2 == null){
            synchronized (EhanSingleTon.class){
                if (lanHanSingleTon2 == null){
                    lanHanSingleTon2 =  new LanHanSingleTon2();
                }
            }
        }
        return lanHanSingleTon2;
    }
}
