package algorithm.dump;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Description:
 * date: 2020/11/24 6:36 下午
 *
 * @author vic.yang
 */
public class ProQuene {

    public static void main(String[] args) {

        int[] array = {9,8,7,6,5,4,3,2,1};
        System.out.println(topKey(array,4));
    }

    public static List<Integer> topKey(int[] arr, int k){
        List<Integer> result = new ArrayList<Integer>();
        //
        int length = arr.length;
        

        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        for (int i = 0; i < length; i++) {
            //
            if (maxHeap.size()!=k){
                //不够满入队
                maxHeap.offer(arr[i]);
            }

            if (arr[i] < maxHeap.peek()) {
                maxHeap.poll();
                maxHeap.offer(arr[i]);
            }
        }

        for (Integer integer : maxHeap) {
            result.add(integer);
        }

        return result;

    }

}
