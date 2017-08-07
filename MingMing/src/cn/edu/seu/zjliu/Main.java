package cn.edu.seu.zjliu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by 11363 on 7/20/2017.
 */
public class Main {
    public static void sort(int[] array, int n){
        for(int i=0;i<n-1;i++){
            int min = array[i];
            int index = i;
            for(int j=i+1;j<n;j++){
                if(min > array[j]) {
                    min = array[j];
                    index = j;
                }
            }
            if(min != array[i]){
                int tmp = array[i];
                array[i] = array[index];
                array[index] = tmp;
            }
        }
    }
    public static ArrayList<Integer> removeDuplicate(int[] array, int n){
        ArrayList<Integer> result = new ArrayList();
        result.add(array[0]);
        int same= array[0];
        for(int i=1;i<n;i++){
            if(same == array[i])
                continue;
            else{
                result.add(array[i]);
                same = array[i];
            }
        }
        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] inputArray = new int[n];
        int i = 0;
        while(sc.hasNext()){
            inputArray[i++] = sc.nextInt();
            if(i >= n)
                break;
        }
        sort(inputArray, n);
        ArrayList<Integer> array = removeDuplicate(inputArray, n);
        for(int j=0;j<array.size();j++)
            System.out.println(array.get(j));
    }
}
