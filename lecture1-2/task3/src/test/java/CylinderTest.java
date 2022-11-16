import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CylinderTest {

  @Test
  void calcVolume() {
    Cylinder cylinder = new Cylinder(2, 1.5);

    Assertions.assertEquals(14.14, cylinder.calcVolume());
  }
}