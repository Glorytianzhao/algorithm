package design.create.prototype;

/**
 * 猴子原型类
 */
public class Monkey implements Cloneable{

    Monkey(){
        System.out.println("具体原型类创建成功");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
