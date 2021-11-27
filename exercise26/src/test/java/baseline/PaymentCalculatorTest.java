package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PaymentCalculatorTest {
    @Test
    void calcTest() {
        int b = 5000;
        int p = 200;
        int i = 3000;
        double n = -(1 / 30) * Math.log10(1 + b / p * (1 - (1 + i) ^ 30)) / Math.log10(1 + i);

        System.out.print("It will take you " + n + " months to pay off this card.");
    }

}