package design.structure.flyweight;

/**
 * 连接状态 非享元信息
 */
public class ConnectState {

    private String table;

    public ConnectState(String table) {
        this.table = table;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    @Override
    public String toString() {
        return "ConnectState{" +
                "table='" + table + '\'' +
                '}';
    }
}
