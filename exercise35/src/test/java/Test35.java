import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Random;

public class Test35 {
    @Test
    void findWinnerTest(){
        ArrayList<String> name = new ArrayList<>();
        
        name.add("Bart");
        name.add("Homer");
        name.add("Lisa");
                Random rand = new Random();
                int randomize = rand.nextInt(name.size() - 1);
                System.out.print("The winner is... " + randomize);
    }
}
