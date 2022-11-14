import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CylinderTest {

  @Test
  void calcVolume() {
    Cylinder cylinder = new Cylinder(2, 1.5F);

    Assertions.assertEquals(14.14F, cylinder.calcVolume());
  }
}