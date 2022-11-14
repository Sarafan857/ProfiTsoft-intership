import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {

    Cube cube = new Cube(3);
    Sphere sphere = new Sphere(2);
    Cylinder cylinder = new Cylinder(1, 3);

    Map<Figure, Float> map = new HashMap<>();
    map.put(cube, cube.calcVolume());
    map.put(sphere, sphere.calcVolume());
    map.put(cylinder, cylinder.calcVolume());

    Map<Figure, Float> sortedByVolume;
    sortedByVolume = sortByVolume(map);

    System.out.println("Sorted figures by volume:");
    sortedByVolume.entrySet()
            .forEach(System.out::println);
  }

  public static Map<Figure, Float> sortByVolume(Map<Figure, Float> map) {

    Map<Figure, Float> sortedByVolume;
    sortedByVolume = map.entrySet()
            .stream()
            .sorted(Collections
                    .reverseOrder(Map
                            .Entry
                            .comparingByValue()))
            .collect(Collectors
                    .toMap(Map.Entry::getKey,
                            Map.Entry::getValue,
                            (e1, e2) -> e1,
                            LinkedHashMap::new)
            );

    return sortedByVolume;
  }

}
