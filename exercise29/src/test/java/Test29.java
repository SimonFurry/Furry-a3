import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

public class Test29 {
    @Test
    void testRateReturn(){
        boolean error = false;

        while (!error) {
            System.out.print("What is the rate of return? ");
            try {
                int r = 6;
                if (r > 0) {
                    error = false;
                    int year = 72 / r;
                    System.out.print("It will take " + year + " years to double your initial investment.");
                    break;
                } else if(r <= 0){
                    System.out.println("Sorry. That's not a valid input.");
                }
            } catch (InputMismatchException e) {
                //catch invalid input
            }
        }
    }
}
