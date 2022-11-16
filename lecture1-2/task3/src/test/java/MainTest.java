import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class MainTest {

  @Test
  void sortByVolume() {
    Cube cube = new Cube(2);
    Sphere sphere = new Sphere(3);
    Cylinder cylinder = new Cylinder(2, 3);

    Map<Figure, Double> map = new HashMap<>();

    map.put(cube, cube.calcVolume());
    map.put(sphere, sphere.calcVolume());
    map.put(cylinder, cylinder.calcVolume());


    Map<Figure, Double> result = new HashMap<>();
    result.put(cube, 8.0);
    result.put(sphere, 113.1);
    result.put(cylinder, 56.55);

    Assertions.assertEquals(result, map);

  }
}