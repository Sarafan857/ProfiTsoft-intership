import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Task1 {

    public static void main (String[] args){
        int[] arrayIn;
        int[] arrayOut;

        arrayIn = getArray();
        System.out.println("Input array:");
        System.out.println(Arrays.toString(arrayIn));

        arrayOut = getPositiveArray(arrayIn);

        if(arrayOut.length == 0) {
            System.out.println("\nOnly negative elements in array");
        }
        else {
            arrayOut = Arrays.stream(arrayOut)
                    .boxed()
                    .sorted(Collections.reverseOrder())
                    .mapToInt(Integer::intValue)
                    .toArray();
            System.out.println("\nOutput array:");
            System.out.println(Arrays.toString(arrayOut));
        }

    }

    public static int[] getPositiveArray(int[] array) {
        List<Integer> list = Arrays.stream(array)
                .boxed()
                .collect(Collectors.toList());

        list.removeIf(data -> data < 0);

        int[] arrayOut = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            arrayOut[i] = list.get(i);
        }

        return arrayOut;
    }

    public static int[] getArray() {
        int[] array = new int[10];

        Random rand = new Random();
        int min = -50;
        int max = 50;

        for(int i = 0; i < array.length; i++) {
            array[i] = (rand.nextInt(max - min + 1) + min);
        }

        return array;
    }

}
