package design.create.factory.simple;

import java.util.HashMap;
import java.util.Map;

public class TargetFactory {

    public ColorInterface getTarget(String type){
        if (type.equals("White")){
            return new WhiteImpl();
        } else {
            return new BlackImpl();
        }
    }

    public static void main(String[] args) {
        //
        HashMap<String,String> hashMap = new HashMap();
        hashMap.put("aaa","test");
        Map tmp = hashMap;
        test(tmp);
    }

    private static void test(Map<String,Object> tmp) {
        System.out.println(tmp);
    }


}
