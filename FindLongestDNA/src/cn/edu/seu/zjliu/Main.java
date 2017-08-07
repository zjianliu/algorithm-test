package cn.edu.seu.zjliu;

import java.util.Scanner;
public class Main{
    public static int findLongestDNA(String str){
        int maxLength = 0;

        char[] DNA = {'A', 'T', 'C', 'G'};
        int len = 0;
        for(int i=0;i<str.length();){
            for(int j=0;j<DNA.length;j++) {
                if (str.charAt(i) == DNA[j]) {
                    len++;
                    break;
                }
            }
            if(len > maxLength)
                maxLength = len;
            i = i + len + 1;
        }
        return maxLength;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.next();
            System.out.println(findLongestDNA(str));
        }
    }
}
