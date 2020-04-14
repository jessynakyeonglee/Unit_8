public class free {
    public static int[][] addMatrix(int[][] list1, int[][] list2){

        int [][] newArray = new int[4][3];
        for(int a=0;a<list1.length;a++){

            for(int b=0;b<list1[0].length;b++){

                newArray[a][b]=list1[a][b]+list2[a][b];
            }
        }
        return newArray;
    }
}
