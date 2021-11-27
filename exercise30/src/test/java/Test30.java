import org.junit.jupiter.api.Test;

public class Test30 {
    @Test
    void generateTable(){
        int[][] data = new int[5][5];
        data = generateTimesTable(12,12); //Give input to x & y value in function
        for (int row = 0; row < data.length ; row++)
        {
            for (int column = 0; column < data[row].length; column++)
            {
                System.out.printf("%3d  ",data[row][column]);
            }
            System.out.println();
        }
    }
    public static int[][] generateTimesTable(int x, int y){
        /*
        generate code that will:
        create rows and columns based on 2 integers.
        (12*12)
        Wow that pseudocode was kinda simple, what's the worst that could happen? :)
         */
        int [][] yes = new int[x][y];
        for (int row = 0; row < yes.length ; row++)
        {
            for (int column = 0; column < yes[row].length; column++) {
                yes[row][column] = (row+1)*(column+1);
            }

        }
        return yes;
    }
}
