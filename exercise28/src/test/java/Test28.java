import org.junit.jupiter.api.Test;

public class Test28 {
    @Test
    void sumCalcTest() {
        int num = 12345;
        double sum = 0;
        for (int amount = 5; amount > 0; amount--) {
            sum = sum + num;
            System.out.print("The total is " + sum + ".");
        }

    }
}
