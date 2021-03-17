package aqs;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * Description: 互斥锁
 * date: 2020/11/17 6:39 下午
 *
 * @author vic.yang
 */
public class MyMutexLock implements Lock, Serializable {


    //自定义一个同步器
    private static class Sync extends AbstractQueuedSynchronizer{
        //尝试获取资源 成功返回true 失败返回false
        @Override
        protected boolean tryAcquire(int acquire) {
            assert acquire == 1 ;//这里只能限定为1个量
            if(compareAndSetState(0,1)){
                setExclusiveOwnerThread(Thread.currentThread());//设置当前前程独占资源
                return true;
            }
            return false;
        }

        /**
         * 尝试释放资源
         * @param acquire
         * @return
         */
        @Override
        protected boolean tryRelease(int acquire) {
            assert acquire == 1;
            setExclusiveOwnerThread(null);
            setState(0);//释放资源,放弃独占状态
            return true;
        }
        //
        @Override
        protected boolean isHeldExclusively() {
            //判断是否是锁定状态
            return getState() ==  1;
        }
        //

    }

    //同步类的实现都依赖于继承aqs的自定义同步器
    private final Sync sync = new Sync();


    public void lock() {
        sync.tryAcquire(1);
    }

    public void lockInterruptibly() throws InterruptedException {

    }

    public boolean tryLock() {
        return sync.tryAcquire(1);
    }

    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }

    public void unlock() {
        sync.release(1);
    }

    public Condition newCondition() {
        return null;
    }
}
