package algorithm.link.init;

import com.sun.org.apache.regexp.internal.RE;

/**
 * Description:
 * date: 2020/11/3 4:03 下午
 *
 * @author vic.yang
 */
public class MyLinkList<E>{

    private class Node{
        public E e;
        public Node next;

        public E getE() {
            return e;
        }

        public void setE(E e) {
            this.e = e;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }
    //头节点
    private Node head;
    private int size;

    //返回链表中的个数
    public int getSize(){
        return this.size;
    }

    //返回链表是否为空
    public boolean isEmpty(){
        return this.size == 0;
    }

    //在某个索引处新增1个元素 练习用
    public void addNode(int index){
        //
        
    }



}
