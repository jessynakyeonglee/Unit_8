public class TwoDArrays {
    public static int maxValue (int [][]list){
        int max = Integer.MIN_VALUE;
        for (int x=0;x<list.length;x++){
            for (int y=0;y< list[1].length;y++){
                if (list[x][y]>max) {
                    max = list[x][y];
                }
            }
        }
        return max;
    }

    public static int sumAll (int [][]list) {
        int output = 0;
        for (int x = 0; x < list.length; x++) {
            for (int y = 0; y < list[1].length; y++) {
                output += list[x][y];
            }
        }
        return output;
    }
    public static boolean isSquare (int [][]arr){
        if (arr[1].length!=arr.length){
            return false;
        }
        else{
            return true;
        }
    }
}
