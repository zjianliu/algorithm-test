package cn.edu.seu.zjliu;

import java.util.Scanner;

/**
 * Created by 11363 on 7/25/2017.
 */
public class InsertSort {
    public static void insertSort(int[] array){
        int length = array.length;
        for(int i=1;i<length;i++){
            int current = array[i];
            int k = i;
            for(int j=i-1;j>=0&&current<array[j];j--){
                array[j+1] = array[j];
                k = j;
            }
            array[k] = current;
        }
    }

    public static void insertSortWithSentry(int[] array){
        int[] newArray = new int[array.length+1];
        for(int i=0;i<array.length;i++)
            newArray[i+1] = array[i];

        int length = array.length+1;
        for(int i=2;i<length;i++){
            newArray[0] = newArray[i];
            int k = i;
            for(int j=i-1;newArray[j]>newArray[0];j--){
                newArray[j+1] = newArray[j];
                k = j;
            }
            newArray[k] = newArray[0];
        }
        for(int i=0;i<array.length;i++)
            array[i] = newArray[i+1];
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int[] array = new int[n];
            for(int i=0;i<n;i++){
                array[i] = sc.nextInt();
            }
            //insertSort(array);
            insertSortWithSentry(array);
            for(int i : array){
                System.out.print(i + " ");
            }
        }
    }
}
