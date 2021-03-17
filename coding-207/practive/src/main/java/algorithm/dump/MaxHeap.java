package algorithm.dump;

import java.util.Scanner;

/**
 * Description:
 * date: 2020/11/24 2:15 下午
 *
 * @author vic.yang
 */
public class MaxHeap {

    /**
     * 保存堆元素的数组
     */
    private int[] elements;

    /**
     * 堆的大小
     */
    private int size;

    /**
     * 堆的容量
     */
    private int capacity;

    public MaxHeap() {
        this.size = 0;
        this.capacity = 0;
    }

    /**
     * 建堆并调整堆
     */
    public void createMaxHeap() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入堆的最大容量：");
        this.capacity = scanner.nextInt();
        this.size = 0;

        // 数组长度为容量加1，0号元素为哨兵元素
        this.elements = new int[this.capacity + 1];
        this.elements[0] = Integer.MAX_VALUE;

        System.out.print("请输入元素个数：");
        this.size = scanner.nextInt();

        if (this.size > this.capacity) {
            throw new RuntimeException("元素个数不能超过最大容量！");
        }

        System.out.print("请输入" + this.size + "个元素：");
        for (int i = 1; i <= this.size; i++) {
            elements[i] = scanner.nextInt();
        }

        buildHeap();
        System.out.println("已经完成堆的建立和调整");
    }

    /**
     * 建立最大堆<br>
     * 两种方案<br>
     * 方案一：建立空堆，N个数，N次插入，时间复杂度O(N*logN)，舍弃！<br>
     * 方案二：先顺序输入，满足完全二叉树要求，再进行调整堆，满足有序性，时间复杂度O(N)
     */
    private void buildHeap() {
        if (isEmpty()) {
            throw new RuntimeException("堆为空，无法完成建堆操作");
        }

        for (int i = size / 2; i > 0; i--) {
            adjustHeap(i);
        }
    }

    /**
     * 以index指向的节点作为根，将该子堆调整为最大堆
     *
     * @param root 子堆的根节点
     */
    private void adjustHeap(int root) {

        // 取出根节点存的值
        int parentVal = elements[root];

        // parentIndex指向根节点值应该插入的位置
        int parentIndex = root;
        while (parentIndex * 2 <= size) {
            int childIndex = parentIndex * 2;
            if (childIndex != size && elements[childIndex] < elements[childIndex + 1]) {
                childIndex++;
            }

            // 如果根节点的值大于子节点，则证明找到了插入的位置
            if (parentVal > elements[childIndex]) {
                break;
            } else {
                elements[parentIndex] = elements[childIndex];
            }

            parentIndex = childIndex;
        }

        elements[parentIndex] = parentVal;
    }

    /**
     * 向最大堆中新增一个元素<br>
     * 空间复杂度O(1)，时间复杂度O(logN)
     *
     * @param newItem 新增的元素值
     */
    public void insertElement(int newItem) {
        if (isFull()) {
            throw new RuntimeException("堆已满，无法再添加元素");
        }

        // 新元素插入的位置，默认为最后一个元素的后面
        int nextIndex = ++this.size;

        // 将新元素放到最后，可以满足完全二叉树的要求，但是有序性不一定能保证，所以需要和父节点进行比较（父节点就是index/2）
        while (elements[nextIndex / 2] < newItem) {
            // 当父节点比新插入的节点小的时候，将父节点移到新节点准备插入的位置
            elements[nextIndex] = elements[nextIndex / 2];

            // 修改新节点准备插入的位置（此时为父节点的旧位置）
            nextIndex /= 2;
        }

        // 到此，nextIndex就指向了应该插入的位置（比子节点都大，比父节点小）
        elements[nextIndex] = newItem;
    }

    /**
     * 删除最大堆的最大值（堆顶元素）
     *
     * @return 堆最大值
     */
    public int deleteMaxItem() {
        if (isEmpty()) {
            throw new RuntimeException("堆为空，不能进行删除操作");
        }

        // 第一个元素就是最大值
        int maxItem = elements[1];

        // 将最后一个元素取出来（删除，size减一），用来替补第一个元素（被删除的最大值）
        int lastItem = elements[size];
        size--;

        // 最后一个元素存放的位置，默认为1，表示第一个位置
        int insertIndex = 1;

        // 最后一个元素不一定是最大的，放到堆顶不一定合适，所以需要调整
        while (insertIndex * 2 <= size) {
            // childIndex默认指向左孩子
            int childIndex = insertIndex * 2;

            // 如果父节点有右孩子，并且左孩子比右孩子小，则childIndex指向较大的元素（也就是右孩子）
            if (childIndex != size && elements[childIndex] < elements[childIndex + 1]) {
                childIndex++;
            }

            // 当最后一个元素大于指向的元素时，证明找到了插入位置，则中断循环
            if (lastItem >= elements[childIndex]) {
                break;
            } else {
                // 最后一个元素比子节点小（比较大的节点小），则交换较大节点和父节点的位置
                elements[insertIndex] = elements[childIndex];
            }

            // 父节点指向空出来的子节点位置
            insertIndex = childIndex;
        }

        elements[insertIndex] = lastItem;
        return maxItem;
    }

    /**
     * 打印排序后的堆
     */
    public void printSortedHeap() {
        for (int i = 1; i <= this.size; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }

    /**
     * 判断堆是否已经满了（size>=capacity）
     *
     * @return true堆已满；false堆未满
     */
    public boolean isFull() {
        return this.size >= capacity;
    }

    /**
     * 判断堆是否为空
     *
     * @return true堆为空；false堆不为空
     */
    public boolean isEmpty() {
        return this.size == 0;
    }
}
