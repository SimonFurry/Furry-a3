import org.junit.jupiter.api.Test;

public class Test38 {
    @Test
    void separateEvensTest(){

        System.out.print("Enter a list of numbers, separated by spaces: ");
        String input = ("1 2 3 4 5 6 7 8 9 10");
        String[] tempArray;

        String delimiter = (" ");

        tempArray = input.split(delimiter);
        for (int i = 0; i < tempArray.length; i++) {
            if(i % 2 == 0){
                System.out.print(tempArray[i + 1] + " ");
            }
        }
    }
}
