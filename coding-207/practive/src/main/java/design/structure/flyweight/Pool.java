package design.structure.flyweight;

import java.util.HashMap;

public class Pool {

    private HashMap<String,ConnectInterface> pool = new HashMap<String, ConnectInterface>();

    public ConnectInterface getConnect(String userName){
        ConnectInterface connectInterface = pool.get(userName);
        if (connectInterface != null){
            System.out.println("享元" + userName + "已经存在并被获取");
        } else {
            connectInterface = new Connect(userName);
            pool.put(userName, connectInterface);
        }
        return connectInterface;
    }


}
