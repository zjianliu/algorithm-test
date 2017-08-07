package cn.edu.seu.zjliu;

import java.util.Scanner;

/**
 * Created by 11363 on 8/7/2017.
 */
public class Main {
    public static int[] hexToDecimal(String str){
        String[] array = str.split(" ");
        int[] result = new int[array.length];
        for(int i = 0;i < array.length;i++){
            String substr = array[i].substring(2);
            char[] chars = substr.toCharArray();
            for(int j=chars.length-1;j >= 0;j--){
                if(Character.isDigit(chars[j])){
                    result[i] += ((int)chars[j] - 48) * Math.pow(16, chars.length-j-1);
                }
                else{
                    result[i] += ((int)chars[j] - 65 + 10) * Math.pow(16, chars.length-j-1);
                }
            }
        }
        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.next();
            int[] result = hexToDecimal(str);
            for(int i : result)
                System.out.println(i);
        }
    }
}
