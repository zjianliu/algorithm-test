package cn.seu.edu.zjliu;

import java.util.Scanner;

/**
 * Created by 11363 on 7/25/2017.
 */
public class Main {
    public static int getDNALength(String s, int length){
        char[] chs = {'A', 'T', 'C', 'G'};
        int currentLength = 0;
        int maxLength = 0;
        for(int i=0;i<length;i++){
            char current = s.charAt(i);
            boolean exist = false;
            for(int j=0;j<chs.length;j++){
                if(chs[j] == current){
                    exist = true;
                    break;
                }
            }
            if(exist == true){
                currentLength++;
                if(currentLength > maxLength)
                    maxLength = currentLength;
            }
            else {
                if(currentLength > maxLength)
                    maxLength = currentLength;
                currentLength = 0;
            }
        }
        return maxLength;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.next();
            int length = sc.nextInt();
            System.out.println(getDNALength(str, length));
        }
    }
}
