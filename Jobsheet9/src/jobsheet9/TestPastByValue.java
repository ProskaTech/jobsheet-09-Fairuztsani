package jobsheet9;

/**
 *
 * Created by 21343044 Fairuz Tsani Habibi
 */

//Percobaan 1 pass by value

public class TestPastByValue {
    public static void main(String[] args) {
        int i = 10;
        System.out.println(i);
        
        test(i);
        System.out.println(i);
    }
    
    public static void test(int j){
        j = 33;
    }
}
