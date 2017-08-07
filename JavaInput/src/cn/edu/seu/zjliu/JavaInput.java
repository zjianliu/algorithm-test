package cn.edu.seu.zjliu;

import java.io.IOException;

/**
 * Created by 11363 on 7/14/2017.
 */
public class JavaInput {
    public static void CharTest(){
        try{
            System.out.println("Enter a char:");
            char i = (char)System.in.read();
            System.out.println("Your enter char is:" + i);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

