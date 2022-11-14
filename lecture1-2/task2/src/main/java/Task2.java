import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task2 {

    public static void main (String[] args) {

        List<String> str = new ArrayList<>();
        Map<String, Long> hashtagCount;

        str.add("#Dynamo Kyiv is the #champion of #Ukraine");
        str.add("#Dynamo Kyiv vs #Shakhtar Donetsk #football #Ukraine #Dynamo #Shakhtar");
        str.add("NSC Olympiiskyi is home stadium of #Dynamo Kyiv");
        str.add("Magnus #Carlsen is the world #champion of #chess");

        hashtagCount = top5Hashtags(str);

        if(hashtagCount.size() == 0) {
            System.out.println("No hashtags");
        }
        else {
            System.out.println("Top 5 hashtags:");
            hashtagCount.entrySet()
                    .forEach(System.out::println);
        }

    }

    public static Map<String, Long> top5Hashtags(List<String> str) {
        List<String> hashtagList = new ArrayList<>();

        for (String s : str) {
            Arrays
                    .stream(s.split(" "))
                    .distinct()
                    .filter(i -> i.substring(0, 1).matches("#"))
                    .forEach(hashtagList::add);
        }

        Map<String, Long> hashtagCount =
                hashtagList.stream()
                        .collect(Collectors
                                .groupingBy(Function.identity(), Collectors.counting())
                        );


        Map<String, Long> top5HashtagCount;

        top5HashtagCount = hashtagCount.entrySet()
                .stream()
                .sorted(Collections
                        .reverseOrder(Map
                                .Entry
                                .comparingByValue()))
                .limit(5)
                .collect(Collectors
                        .toMap(Map.Entry::getKey,
                                Map.Entry::getValue,
                                (e1, e2) -> e1,
                                LinkedHashMap::new)
                );

        return top5HashtagCount;
    }
}
