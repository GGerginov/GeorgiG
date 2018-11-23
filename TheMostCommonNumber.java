import java.util.*;
import java.util.stream.Collectors;

public class TheMostCommonNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> input = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());


        LinkedHashMap<Integer,Integer> count = new LinkedHashMap<>();


        for (Integer integer : input) {
            count.putIfAbsent(integer,0);
            if (count.containsKey(integer)){
                int oldValue = count.get(integer);
                count.put(integer,oldValue+1);
            }
        }

        int max = 0;

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {

            int value = entry.getValue();

            if (value > max){
                max = value;
            }

        }

        int key = 0;
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {

            if (entry.getValue().equals(max)){
                key = entry.getKey();
                break;
            }

        }

        System.out.println(key);

    }
}
