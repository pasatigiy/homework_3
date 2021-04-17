import java.util.Arrays;

public class TheTask5 {
    public static void main(String[] args) {
        int[] myArray = { 5, 29, 6, 38, 14, 97};
        System.out.println(Arrays.toString(myArray));
        for ( int i = 1; i< myArray.length; i = i+2){
            myArray[i] = 0;
        }
        System.out.println(Arrays.toString(myArray));
    }
}
