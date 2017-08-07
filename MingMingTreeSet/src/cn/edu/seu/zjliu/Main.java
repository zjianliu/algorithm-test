package cn.edu.seu.zjliu;

import java.util.Scanner;
import java.util.TreeSet;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();
            TreeSet<Integer> treeSet = new TreeSet<Integer>();
            for(int i=0;i<num;i++){
                treeSet.add(sc.nextInt());
            }
            for(Integer i : treeSet)
                System.out.println(i);
        }
    }
}