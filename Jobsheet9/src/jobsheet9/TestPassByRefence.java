package jobsheet9;

/**
 *
 * Created by 21343044 Fairuz Tsani Habibi
 */

public class TestPassByRefence {
     public static void main(String[] args) {
         int[] ages = {10, 11, 12};
         for (int i = 0; i < ages.length; i++){
             System.out.println(ages[i]);
         }
         test(ages);
         
         for (int i = 0; i < ages.length; i++){
             System.out.println(ages[i]);
         }
     }
     
     public static void test(int []arr){
         for (int i = 0; i < arr.length; i++){
             arr[i] = i + 50;
         }
     }
}
