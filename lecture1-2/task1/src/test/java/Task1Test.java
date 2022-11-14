import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class Task1Test {

  ArrayList<Integer> arrayIn;
  ArrayList<Integer> arrayOut;
  ArrayList<Integer> result;


  @Test
  public void getPositiveArrayTest() {

    arrayIn = new ArrayList<>(Arrays.asList(5, 10, 8, 1, -1, 0));
    result = Task1.getPositiveArray(arrayIn);
    arrayOut = new ArrayList<>(Arrays.asList(5, 10, 8, 1, 0));

    Assertions.assertEquals(arrayOut, result);
  }

  @Test
  public void getPositiveArrayTest1() {

    arrayIn = new ArrayList<>(Arrays.asList(-5, -10, -8, 0, -1, 0));
    result = Task1.getPositiveArray(arrayIn);
    arrayOut = new ArrayList<>(Arrays.asList(0, 0));

    Assertions.assertEquals(arrayOut, result);
  }

  @Test
  public void onlyNegativeElemtnts() {

    arrayIn = new ArrayList<>(Arrays.asList(-5, -10, -8, -1));
    result = Task1.getPositiveArray(arrayIn);

    Assertions.assertEquals(0, result.size());
  }

}