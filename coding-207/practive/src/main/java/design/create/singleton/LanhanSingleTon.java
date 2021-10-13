package design.create.singleton;

/**
 * 懒汉单例
 */
public class LanhanSingleTon {


    private static  LanhanSingleTon lanhanSingleTon;
    public LanhanSingleTon getObject(){
        if (lanhanSingleTon == null){
            lanhanSingleTon = new LanhanSingleTon();
        }
        return new LanhanSingleTon();
    }
}
