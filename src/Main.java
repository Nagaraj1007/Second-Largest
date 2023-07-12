import java.util.Arrays;

public class Main {

    public static int secondLargest(int array[]){
        Arrays.sort(array);
        int largest = array[array.length-1];
        for (int iterator = array.length-2 ; iterator >= 0 ;iterator--){
            if (array[iterator] < largest){
                return array[iterator];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(secondLargest(new int[]{2}));
    }
}