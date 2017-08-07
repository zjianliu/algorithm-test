package cn.edu.seu.zjliu;

import java.util.Scanner;

/**
 * Created by 11363 on 7/20/2017.
 */
public class Main {
    public static int getCharNumber(String s, char c){
        char[] charArray = s.toCharArray();
        int num = 0;
        for(int i=0;i<charArray.length;i++){
            if(Character.toLowerCase(charArray[i]) == Character.toLowerCase(c))
                num++;
        }
        return num;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = null;
        char c;
        while(sc.hasNext()){
            s = sc.next();
            c = sc.next().charAt(0);
            System.out.println(getCharNumber(s,c));
        }
    }
}
