package cn.seu.edu.zjliu;

import java.util.Scanner;

/**
 * Created by 11363 on 7/25/2017.
 */
public class Main {
    public static int findMaxHuiWen(String str){
        int odd = 0;
        int even = 0;
        int result = 0;
        int[] num = new int[26];
        for(int i=0;i<str.length();i++){
            num[str.charAt(i)-97]++;
        }
        for(int i=0;i<26;i++){
            if(num[i]%2==0)
                even++;
            else if(num[i]%2==1)
                odd++;
        }
        if(odd == 0)
            result = even;
        else
            result = odd--;

        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.next();
            System.out.println(findMaxHuiWen(str));
        }
    }
}
