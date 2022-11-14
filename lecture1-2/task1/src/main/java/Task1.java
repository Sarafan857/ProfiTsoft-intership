import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task1 {

    public static void main (String[] args){
        ArrayList<Integer> arrayIn;
        ArrayList<Integer> arrayOut;

        arrayIn = getArray();
        System.out.println("Input array:");
        System.out.println(arrayIn);

        arrayOut = new ArrayList<>(getPositiveArray(arrayIn));

        if(arrayOut.size() == 0) {
            System.out.println("\nOnly negative elements in array");
        }
        else {
            arrayOut.sort(Collections.reverseOrder());
            System.out.println("\nOutput array:");
            System.out.println(arrayOut);
        }

    }

    public static ArrayList<Integer> getPositiveArray(ArrayList<Integer> array) {
        array.removeIf(data -> data < 0);

        return array;
    }

    public static ArrayList<Integer> getArray() {
        ArrayList<Integer> array = new ArrayList<>();

        Random rand = new Random();
        int min = -50;
        int max = 50;

        for(int i = 0; i < 10; i++) {
            array.add(rand.nextInt(max - min + 1) + min);
        }

        return array;
    }

}
