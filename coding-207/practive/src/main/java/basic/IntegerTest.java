package basic;

import java.util.HashMap;

/**
 * Description:
 * date: 2020/12/1 5:16 下午
 *
 * @author vic.yang
 */
public class IntegerTest {

    //
    public static void main(String[] args) {

        Integer integer = Integer.valueOf(100);
        Integer integer1 = Integer.valueOf(100);

        Integer integer2 = Integer.valueOf(1000000);
        Integer integer3 = Integer.valueOf(1000000);

        System.out.println(integer == integer1);
        System.out.println(integer2 == integer3);


        Integer integer4 = new Integer(100);
        Integer integer5 = new Integer(100);

        Integer integer6 = new Integer(1000000);
        Integer integer7 = new Integer(1000000);

        System.out.println(integer4 == integer5);
        System.out.println(integer6 == integer7);

        HashMap<Object, Object> objectObjectHashMap = new HashMap<Object, Object>();


    }
}
