package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Test32 {
    @Test
    void levelTest() {
        int attempts = 0;
        int randNum = 10;
        int num = 10;
        boolean win = false;
        while(win == false){
            attempts++
                    if(num == randNum){
                        win = true;
                    }
        }
        System.out.print("You got it in " + attempts + " guesses!\n");
    }

    void rngTest(){
        @Test
        Random rand = new Random();
        int randNum = rand.nextInt(10);
        if(randNum <= 10){
            System.out.print("Pass");
        } else{
            System.out.print("Fail");
        }
    }
}