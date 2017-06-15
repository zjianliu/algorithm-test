package cn.edu.seu.zjliu;

/**
 * Created by 11363 on 6/15/2017.
 */
public class ValidateIdCard {
    public static int verifyIDCard(String input){
        if(input.length() != 18)
            return 1;

        for(int i=0;i<17;i++){
            if(Character.isDigit(input.charAt(i)))
                continue;
            else
                return 2;
        }

        if(Character.isDigit(input.charAt(17)) == false && input.charAt(17) != 'x')
            return 3;

        int year = Integer.parseInt(input.substring(6,10));
        int month = Integer.parseInt(input.substring(10,12));
        int day = Integer.parseInt(input.substring(12,14));
        if(year<1900 || year>2100)
            return 4;
        if(month<1 || month>12)
            return 5;

        int february = 0;
        if(year%4==0&&year%100!=0||year%400==0)
            february = 28;
        else
            february = 29;
        int[] dayOfMonth = {31,february,31,30,31,30,31,31,30,31,30,31};
        if(day > dayOfMonth[month] || day < 0)
            return 6;

        return 0;
    }

    public static void main(String[] args){
        String str = "511002198808081234";
        System.out.println(verifyIDCard(str));
    }

}
