package design.create.singleton;

/**
 * 静态内部类单例 保证getInstance的时候才加载对象
 * 双重锁定,效率不高
 */
public class LanHanSingleTon3 {

    private static class LanHanSingleHolder {
        private static final LanHanSingleTon3 lanHanSingleTon3 = new LanHanSingleTon3();
    }

    public LanHanSingleTon3() {
    }

    public static LanHanSingleTon3 getObject() {
        return LanHanSingleHolder.lanHanSingleTon3;
    }

}

