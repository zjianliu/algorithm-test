package cn.edu.seu.zjliu;

/**
 * Created by 11363 on 6/15/2017.
 */
public class ValidatePhoneNumber {
    public static int verifyMsisdn(String inMsisdn){
        if(inMsisdn.length() != 13)
            return 1;
        for(int i=0;i<inMsisdn.length();i++)
            if(Character.isDigit(inMsisdn.charAt(i)))
                continue;
            else
                return 2;
        if(!inMsisdn.substring(0,2).equals("86"))
            return 3;
        return 0;
    }
    public static void main(String[] args){
        String str = "16187519725W9";
        System.out.println(verifyMsisdn(str));
    }
}
