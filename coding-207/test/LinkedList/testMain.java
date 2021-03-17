import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Description: 链表反转
 * date: 2020/10/17 4:05 下午
 *
 * @author vic.yang
 */
public class testMain {

    private static final ExecutorService threadPool = new ThreadPoolExecutor(3,3,0L, TimeUnit.MILLISECONDS,new LinkedBlockingDeque<>());

//    public static void main(String[] args) {
//        List<Integer> testList = new ArrayList<>();
//        testList.add(1);
//        testList.add(2);
//        testList.add(3);
//        testList.add(4);
//        testList.add(5);
//        for (Integer integer : testList) {
//            threadPool.submit(new Runnable() {
//                @Override
//                public void run() {
//                    try {
//                        System.out.println(Thread.currentThread().getName());
//                        Thread.sleep(3000l);
//
//                        for (Integer integer1 : testList) {
//                            threadPool.submit(new Runnable() {
//                                @Override
//                                public void run() {
//                                    System.out.println("inner thread pool" + Thread.currentThread().getName());
//                                }
//                            });
//                        }
//
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            });
//        }
//
//    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int a = 30;
        for (int i = 0; i < 1000000000; i++) {
            a = a + 1;
        }
        System.out.println(System.currentTimeMillis() - startTime);
        System.out.println(a);
    }

//    class Solution {
//        public int maxSubArray(int[] nums) {
//            //
//            int max = nums[0];
//            int sum = 0;
//
//            for(int i = 0;i<nums.length;i++){
//                sum += nums[i];//
//                max = Math.max(max, sum);
//
//                if (sum < 0) sum =0 ; //为啥
//            }
//            return max;
//        }
//    }

    class Solution {
        public int singleNumber(int[] nums) {
            //找出其他元素都出现两次,这个只出现了1次的元素
            int a = 0;
            for(int i= 0;i < nums.length;i++){
                a = nums[i] ^ a;
            }
            return a;
        }
    }




}
