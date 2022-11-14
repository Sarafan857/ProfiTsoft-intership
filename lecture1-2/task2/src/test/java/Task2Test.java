import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Task2Test {

  List<String> str = new ArrayList<>();

  @Test
  void top5Hashtags() {
    str.add("#Dynamo #Kyiv is the #champion of #Ukraine");
    str.add("#Dynamo #Kyiv vs #Shakhtar #Donetsk #football #Ukraine #Dynamo #Shakhtar");
    str.add("NSC Olympiiskyi is home stadium of #Dynamo Kyiv");
    str.add("Magnus #Carlsen is the world #champion of #chess");

    Map<String, Long> hashtagCount = Task2.top5Hashtags(str);

    Map<String, Long> result = new HashMap<>();
    result.put("#Dynamo", 3L);
    result.put("#champion", 2L);
    result.put("#Kyiv", 2L);
    result.put("#Ukraine", 2L);
    result.put("#chess", 1L);

    Assertions.assertEquals(result, hashtagCount);
  }

  @Test
  void noHashtags() {
    str.add("Dynamo Kyiv is the champion of Ukraine");
    str.add("Dynamo Kyiv vs Shakhtar Donetsk football Ukraine Dynamo Shakhtar");
    str.add("NSC Olympiiskyi is home stadium of Dynamo Kyiv");
    str.add("Magnus Carlsen is the world champion of chess");

    Map<String, Long> hashtagCount = Task2.top5Hashtags(str);

    Assertions.assertEquals(0, hashtagCount.size());
  }
}