package algorithm.sort;

/**
 * Description:
 * date: 2020/11/24 1:57 下午
 *
 * @author vic.yang
 */
public class QuickSortPractice {

    public static void quickSort(int[] arr,int low,int high){

        if (low > high){
            return;
        }

        int i = low;
        int j= high;

        int temp = arr[low];

        while (i < j){

            while (arr[j] >= temp && i <j ){
               j --;
            }

            while (arr[i] <= temp && i <j ){
                i ++;
            }

            if (i < j){
                swap(arr,low,high);
            }
        }

        //
        arr[low] = arr[i];
        arr[i] = temp;
        quickSort(arr,low,j-1);
        quickSort(arr,j + 1,high);
    }

    private static void swap(int[]arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 2, 4, 7, 62, 3, 4, 2, 1, 8, 9, 19};
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

}
