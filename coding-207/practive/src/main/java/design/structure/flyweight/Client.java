package design.structure.flyweight;

public class Client {

    public static void main(String[] args) {

        Pool pool = new Pool();
        ConnectInterface xiaoming = pool.getConnect("xiaoming");
        ConnectInterface xiaoming2 = pool.getConnect("xiaoming");
        ConnectInterface xiaoming3 = pool.getConnect("xiaoming");

        ConnectInterface lizi = pool.getConnect("lizi");
        ConnectInterface lizi2 = pool.getConnect("lizi");

        xiaoming.operate(new ConnectState("table1"));
        xiaoming2.operate(new ConnectState("table2"));
        xiaoming3.operate(new ConnectState("table3"));

        lizi.operate(new ConnectState("tableA"));
        lizi2.operate(new ConnectState("tableB"));
    }
}
