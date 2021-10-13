package design.structure.flyweight;

/**
 * 连接 享元信息
 */
public class Connect implements ConnectInterface{

    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Connect(String userName) {
        this.userName = userName;
        System.out.println("享元信息=" + userName + "被创建");
    }

    @Override
    public void operate(ConnectState connectState) {
        System.out.println("享元信息=" + userName + "被调用");
        System.out.println("非享元信息=" + connectState.getTable() + "被调用");
    }
}
