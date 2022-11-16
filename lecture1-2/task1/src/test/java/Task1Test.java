import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class Task1Test {

  @Test
  public void getPositiveArrayTest() {

    int[] arrayIn = {5, 10, 8, 1, -1, 0};
    int[] result = Task1.getPositiveArray(arrayIn);
    int[] arrayOut = {5, 10, 8, 1, 0};

    Assertions.assertEquals(Arrays.toString(arrayOut), Arrays.toString(result));
  }

  @Test
  public void getPositiveArrayTest1() {

    int[] arrayIn = {-5, -10, -8, 0, -1, 0};
    int[] result = Task1.getPositiveArray(arrayIn);
    int[] arrayOut = {0, 0};

    Assertions.assertEquals(Arrays.toString(arrayOut), Arrays.toString(result));
  }

  @Test
  public void onlyNegativeElemtnts() {

    int[] arrayIn = {-5, -10, -8, -1};
    int[] result = Task1.getPositiveArray(arrayIn);

    Assertions.assertEquals(0, result.length);
  }

}