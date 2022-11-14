import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SphereTest {

  @Test
  void calcVolume() {
    Sphere sphere = new Sphere(4);

    Assertions.assertEquals(268.08F, sphere.calcVolume());
  }
}