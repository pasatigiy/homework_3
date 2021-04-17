import java.util.Arrays;

public class TheTask7 {
    public static void main(String[] args) {
        int[] myArray = { 58, 6, 38, 1, 99, 3, 54};
        System.out.println("Before");
        System.out.println(Arrays.toString(myArray));
        for ( int i = myArray.length - 1; i>0; i--){
            for ( int j = 0; j<i; j++){
                if (myArray[j]>myArray[j+1]){
                    int tmp = myArray[j];
                    myArray[j] = myArray[j+1];
                    myArray[j+1] = tmp;

                }
            }

        }
        System.out.println( "After");
        System.out.println(Arrays.toString(myArray));
    }
}
