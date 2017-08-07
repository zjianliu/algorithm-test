package cn.edu.seu.zjliu;

import java.util.Scanner;

/**
 * Created by 11363 on 7/21/2017.
 */
public class Main{
    public static int getCoupleNumber(int n, int[] array){
        int sum = 0;
        for(int i=0;i<n;i++){
            int max = array[(i+1) % n];
            for(int j=i+1;j<i+n;j++){
                if(array[i]<=max || array[j % n]<=max)
                    break;
                else{
                    sum++;
                    if(max<array[j % n])
                        max = array[j % n];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int[] array = new int[n];
            for(int i=0;i<n;i++){
                array[i] = sc.nextInt();
            }
            System.out.println(getCoupleNumber(n, array));
        }
    }
}
