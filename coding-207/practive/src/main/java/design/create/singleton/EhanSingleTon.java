package design.create.singleton;

/**
 * 恶汉单例
 * 其他形式也有可能会类装载,可能会浪费内存
 */
public class EhanSingleTon {

    private static final EhanSingleTon ehanSingleTon = new EhanSingleTon();

    public EhanSingleTon(){}

    public EhanSingleTon getObject(){
        return ehanSingleTon;
    }
}
