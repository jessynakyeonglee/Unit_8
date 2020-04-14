/**
 * @author Jessy Lee
 * @since 4/15/20
 * Checks if a 2D array is a magic square
 */

public class MagicSquare {
    private int[][] grid;

    /**
     * Initiates by taking a 2D array as a parameter
     * @param g A 2D array
     */

    public MagicSquare(int[][] g) {
        grid = g;
    }

    /**
     * rowSum will go through every numbers in the same row and add to the output
     * @param row the number of row we're finding the sum of
     * @return the sum of the numbers of the row
     */
    public int rowSum(int row) {
        int output = 0; //output is an empty int type variable that will store the sum of the numbers in the same row
        for (int column = 0; column < grid[row].length; column++) {
            output += grid[row][column];//this part will add all the values through every columns in the row
        }
        return output;//This part will return the sum of the same row
    }

    /**
     * colSum will go through every numbers in the same column and add to the output
     * @param col the number of column we're finding the sum of
     * @return the sum of the numbers of the column
     */

    public int colSum(int col) {
            int output=0; //output is an empty int type variable that will store the sum of the numbers in the same column
            for(int row=0;row<grid.length;row++){
                output+= grid[row][col];
            }
            return output; //This part will return the sum of the same column

        }

    /**
     * upDiagSum will go through every numbers in the upward diagonal and add to the output
     * @return the sum of the numbers of the upward diagonal
     */

    public int upDiagSum() {
            int output = 0; //output is an empty int type variable that will store the sum of the numbers in the upward diagonal
            int column = 0;
            int row = grid.length - 1;
            while(column<grid.length) {
                output+= grid[row][column];
                column++;
                row--;
            }
        return output; //This part will return the sum of the upward diagonal
    }

    /**
     * downDiagSum will go through every numbers in the downward diagonal and add to the output
     * @return the sum of the numbers of the downward diagonal
     */

    public int downDiagSum() {
        int output = 0; //output is an empty int type variable that will store the sum of the numbers in the downward diagonal
        int row = 0;
        int column = 0;
        while(column<grid.length){
            output += grid[row][column];
            column++;
            row++;
        }
        return output; //This part will return the sum of the downward diagonal
    }

    /**
     * isMagicSquare compares and checks if all sums are equal to each other
     * @return returns true or false if a 2D array is a magic square or not
     */

    public boolean isMagicSquare() {
        int standard = rowSum(0);
        for (int count = 0; count < grid.length; count++){
            if (rowSum(count)!= colSum(count)){
                return false;
            }
            else if (rowSum(count) != upDiagSum()){
                return false;
            }
            else if (rowSum(count) != downDiagSum()){
                return false;
            }
            else if (colSum(count) != upDiagSum()){
                return false;
            }
            else if (upDiagSum() != downDiagSum()){
                return false;
            }
            else if (colSum(count) != downDiagSum()){
                return false;
            }
        }
        return true;
    }


    /**
     * This method is complete. You do not need to provide additional
     * comments here.
     */
    public void printGrid() {
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                System.out.print(grid[row][col] + "\t");
            }
            System.out.println("");
        }
    }
}

