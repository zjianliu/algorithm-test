import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by 11363 on 8/7/2017.
 */
public class Main {
    public static void insertSort(int[] array, int length){
        for(int i = 0;i < length - 1;i++){
            int min = array[i];
            int current = i;
            for(int j = i + 1;j < length; j++){
                if(min > array[j]) {
                    current = j;
                    min = array[j];
                }
            }
            if(current != i){
                int temp = array[i];
                array[i] = array[current];
                array[current] = temp;
            }
        }
    }

    public static ArrayList<Integer> removeDuplication(int[] array, int length){
        ArrayList<Integer> result = new ArrayList<>();
        result.add(array[0]);
        for(int i = 1;i < length;i++){
            int current = array[i];
            if(current != result.get(result.size()-1)){
                result.add(array[i]);
            }
        }
        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int length = sc.nextInt();
            int[] array = new int[length];
            for(int i=0;i<length;i++)
                array[i] = sc.nextInt();
            insertSort(array, length);
            ArrayList<Integer> result = removeDuplication(array, length);
            for(int i : result)
                System.out.println(i);
        }
    }
}
