import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Pairs {
    public void getPairs(List<Integer> numbers, int k){
        Collections.sort(numbers);
        for (int i = 0; i < numbers.size() - 1; i++) {
            if(numbers.get(i) >= k) break;
            for (int j = i + 1; j < numbers.size(); j++) {
                if(numbers.get(i) + numbers.get(j) == k){
                    System.out.println(numbers.get(i) + " + " + numbers.get(j));
                }
            }
        }
    }

    @Test
    public void testPairs(){
        List<Integer> list= Arrays.asList(10, 1, 2, 6, 4, 5, 3, 7, 8, 9);
        getPairs(list, 8);
    }
}
