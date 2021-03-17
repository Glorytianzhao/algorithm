package algorithm.array.init;

/**
 * Description: 构造一个可以动态扩容的数组列表
 * date: 2020/11/2 7:11 下午
 *
 * @author vic.yang
 */
public class MyArray<E> {
    /**
     * 元素
     */
    private E[] e;

    /**
     * 集合数量
     */
    private int size;

    /**
     * 集合构造
     */
    public MyArray(E[] e, int size) {
        this.e = e;
        this.size = size;
    }

    public MyArray(int capacity) {
        this.e = (E[]) new Object[capacity];
        this.size = capacity;
    }

    /**
     * 无参构造
     */
    public MyArray() {
        this(10);
    }

    /**
     * 增
     * 1 集合的size + 1
     * 2 根据索引节点新增
     */
    public void add(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("size is error");
        }
        if (index == size) {
            //进行扩容
            resize(size * 2);
            //遍历下标加1
            for (int i = size - 1; i >= index; i--) {
                e[i + 1] = e[i];
            }
            //
            size++;
        }
    }


    /**
     * 删
     * 1 集合的size - 1
     * 2
     */

    /**
     * 改
     */

    /**
     * 查
     */

    /**
     * 扩容(或者缩容)
     *
     * @param newResize
     */
    private void resize(int newResize) {
        //构造一个新的数组
        E[] newData = (E[]) new Object[newResize];
        //从旧的数组中取出放入新的数组
        for (int i = 0; i < size; i++) {
            newData[i] = e[i];
        }
        e = newData;
        size = newResize;
    }

}
