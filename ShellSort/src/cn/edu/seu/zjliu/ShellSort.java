package cn.edu.seu.zjliu;

import java.util.Scanner;

/**
 * Created by 11363 on 7/26/2017.
 */
public class ShellSort {
    public static void shellSort(int[] array){
        int d = array.length;

        while(true){
            d = d / 2;
            for(int i=0;i<d;i++){
                for(int j=i+d;j<array.length;j=j+d){
                    int temp = array[j];
                    int m = j;
                    for(int k=j-d;k>=0&&array[k]>temp;k=k-d){
                        array[k+d] = array[k];
                        m = k;
                    }
                    array[m] = temp;
                }
            }
            if(d == 1)
                break;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int length = sc.nextInt();
            int[] array = new int[length];
            for(int i=0;i<length;i++)
                array[i] = sc.nextInt();
            shellSort(array);
            for(int i : array)
                System.out.print(i + " ");
        }
    }
}
