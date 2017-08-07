package cn.edu.seu.zjliu;

/**
 * Created by 11363 on 7/20/2017.
 */
public class QuickSort {
    public static void quickSort(int[] array, int low, int high){
        if(low >= high)
            return;
        int first  = low;
        int last = high;
        int key = array[first];

        while(first < last){
            while(first < last && key <= array[last])
                last--;
            array[first] = array[last];

            while(first < last && key >= array[first])
                first++;
            array[last] = array[first];
        }
        array[first] = key;
        quickSort(array, low, first-1);
        quickSort(array, last+1, high);
    }

    public static void main(String[] args){
        int[] array = {5,3,6,9,18,4,7,10};
        quickSort(array, 0, array.length-1);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
