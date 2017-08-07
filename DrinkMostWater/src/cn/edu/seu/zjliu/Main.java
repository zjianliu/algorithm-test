package cn.edu.seu.zjliu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by 11363 on 8/7/2017.
 */
public class Main {
    public static int drinkMostWater(int num){
        int result = 0;

        while(num / 3 != 0){
            result += num / 3;
            num = num / 3 + num % 3;
        }
        if(num % 3 == 2)
            result += 1;

        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> array = new ArrayList<>();
        while(sc.hasNext()){
            int num = sc.nextInt();
            if(num == 0)
                break;
            array.add(drinkMostWater(num));
        }
        for(Integer i : array){
            System.out.println(i);
        }
    }
}
