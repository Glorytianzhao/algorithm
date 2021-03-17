package basic;

/**
 * Description: 验证join
 * date: 2020/12/22 6:59 下午
 *
 * @author vic.yang
 */
public class TestJoin {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("主线程开始执行");
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("线程1执行");
            }
        });
        thread1.start();
        thread1.join();
        System.out.println("主线程执行结束");
    }
}
