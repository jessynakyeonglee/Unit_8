public class TwoDArrays {
    public static int maxValue (int [][]list){
        int max = Integer.MIN_VALUE;
        for (int x=0;x<list.length;x++){
            for (int y=0;y< list.length;y++){
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
            for (int y = 0; y < list.length; y++) {
                output += list[x][y];
            }
        }
        return output;
    }

}
