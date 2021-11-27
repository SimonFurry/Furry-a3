import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test36 {
    @Test
    void averageTest() {
        List<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(200);
        number.add(150);
        int sum = 0;
        for (int i = 0; i < number.size(); i++) {
            sum += number.get(i);
        }
        int average = sum / number.size();
        System.out.print("\nThe average is " + average);
    }
    @Test
    void maxTest(){
        List<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(200);
        number.add(150);
        Collections.sort(number);
        System.out.print("\nThe max is " + number.get(number.size() - 1));
    }
    @Test
    void minTest(){
        List<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(200);
        number.add(150);
        Collections.sort(number);
        System.out.print("\nThe min is " + number.get(0));
    }
    @Test
    void standardDevTest(){
        List<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(200);
        number.add(150);

        double sum = 0.0;
        double standardDeviation = 0.0;
        double sq = 0.0;
        double res = 0.0;

        for(int i = 0; i < number.size(); i++){
            sum += number.get(i);
        }
        double mean = sum / number.size();
        for(int i = 0; i < number.size(); i++){
            standardDeviation = standardDeviation + Math.pow((number.get(i) - mean), 2);
        }
        sq = standardDeviation / number.size();
        res = Math.sqrt(sq);
        double resRounded = Math.round(res * 100.0) /100.0;

        System.out.print("\nThe standard deviation is " + resRounded);
    }
}
