public class ThreeByFive {
    public static void main(String [] args) {
// note...this is a 2x5 int array
        int [][]nums = {{1,9,9,4,0},{1,1,4,1,9},{9,4,4,1,2}};
// a 3x5 array is required


//this output is incomplete for this array
        System.out.println(nums[0][0]);
        System.out.println(nums[0][1]);
        System.out.println(nums[0][2]);
        System.out.println(nums[0][3]);
        System.out.println(nums[0][4]);
        System.out.println(nums[1][0]);
        System.out.println(nums[1][1]);
        System.out.println(nums[1][2]);
        System.out.println(nums[1][3]);
        System.out.println(nums[1][4]);
        System.out.println(nums[2][0]);
        System.out.println(nums[2][1]);
        System.out.println(nums[2][2]);
        System.out.println(nums[2][3]);
        System.out.println(nums[2][4]);

//change three other values to negative numbers
        nums[1][4] = -4;
        nums[0][3]= -1;
        nums[1][1]= -3;

//make a statement to create a blank line here
        System.out.println("\n");
// output all of the numbers again,
        System.out.println(nums[0][0]);
        System.out.println(nums[0][1]);
        System.out.println(nums[0][2]);
        System.out.println(nums[0][3]);
        System.out.println(nums[0][4]);
        System.out.println(nums[1][0]);
        System.out.println(nums[1][1]);
        System.out.println(nums[1][2]);
        System.out.println(nums[1][3]);
        System.out.println(nums[1][4]);
        System.out.println(nums[2][0]);
        System.out.println(nums[2][1]);
        System.out.println(nums[2][2]);
        System.out.println(nums[2][3]);
        System.out.println(nums[2][4]);
// not just the changed ones
    }
}
