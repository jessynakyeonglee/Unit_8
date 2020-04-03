public class ArrayCalculations {
    public static int rowSum(int[][] arr, int row) {

        int output=0;
        if (row<=0||row>arr.length){
            return -1;
        }
        for (int count=0;count<arr[row].length;count++){
            output+=arr[row][count];
        }
        return output;

    }
    public static int columnSum(int[][] arr, int col) {

        int output =0;
        if (col<=0||col>arr[0].length){
            return -1;
        }

        for (int count=0;count<arr.length;count++){
            output+=arr[count][col];
        }

        return output;
    }
    public static int diagonalSum(int[][] arr, int direction) {
        int output=0;
        if (direction==0) {
            for (int a = 0; a < arr.length; a++) {
                output += arr[a][a];
            }
        }
            else if (direction==1){
                int a=arr.length-1;
                int b=0;
                for(int count=0;count<arr.length;count++){
                        output+=arr[a][b];
                        a--;
                        b++;
                }
                }
            else{
                return-1;
            }
        return output;
        }
    }
