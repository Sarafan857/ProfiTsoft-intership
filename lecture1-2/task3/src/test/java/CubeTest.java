import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CubeTest {

  @Test
  void calcVolume() {
    Cube cube = new Cube(3);

    Assertions.assertEquals(27, cube.calcVolume());
  }
}