package cn.edu.seu.zjliu;

import java.util.Scanner;

/**
 * Created by 11363 on 7/28/2017.
 */
public class FindTile {
    public static int findTile(String str){
        int num = 0;
        int[] numResult = new int[str.length()+1];
        for(int i=0;i<str.length()-1;){
            char current = str.charAt(i);
            int currentNum = 1;
            int j;
            for(j=i+1;j<str.length();j++){
                if(str.charAt(j) == current) {
                    currentNum++;
                    continue;
                }
                else {
                    break;
                }
            }
            numResult[currentNum]++;
            i = j;
        }
        for(int i=2;i<numResult.length;i++){
            num = num + numResult[i] * i / 2;
        }
        return num;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.next();
            System.out.println(findTile(str));
        }
    }
}
