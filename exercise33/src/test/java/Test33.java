import baseline.Solution33;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Test33 {
    @Test
    void magicBallTest(){
        System.out.print("What is your question? \n> "); //Take phoney input
        int input = 1;
        List<String> list = new ArrayList<String>();//Generate new array list.

        list.add("Yes.");
        list.add("No.");
        list.add("Maybe.");
        list.add("Ask again later.");

        Solution33 obj = new Solution33(); //Take 8ballresponse and print out the random input number form the list


        System.out.println(obj.get8BallResponse(list));
    }
}
