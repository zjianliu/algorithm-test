package cn.edu.seu.zjliu;

import java.util.Scanner;

/**
 * Created by 11363 on 7/26/2017.
 */
public class SimpleSort {
    public static void simpleSort(int[] array){
        int length = array.length;
        for(int i=0;i<length-1;i++){
            int min = array[i];
            int index = i;
            for(int j=i+1;j<length;j++){
                if(array[j]<min){
                    min = array[j];
                    index = j;
                }
            }
            if(index != i){
                int temp = array[i];
                array[i] = array[index];
                array[index] = temp;
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int length = sc.nextInt();
            int[] array = new int[length];
            for(int i=0;i<length;i++)
                array[i] = sc.nextInt();
            simpleSort(array);
            for(int i : array)
                System.out.print(i + " ");
        }
    }
}
