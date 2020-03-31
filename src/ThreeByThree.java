public class ThreeByThree {
        public static void main(String [] args){

//code to define an initially empty double
//2D array size 3x3

            double [][] list = new double[3][3];

//code to output all original values
            System.out.println(list[0][0]);
            System.out.println(list[0][1]);
            System.out.println(list[0][2]);
            System.out.println(list[1][0]);
            System.out.println(list[1][1]);
            System.out.println(list[1][2]);
            System.out.println(list[2][0]);
            System.out.println(list[2][1]);
            System.out.println(list[2][2]);

//code to change five of the values to positive

            list[1][0] = 10;
            list[0][2]= 100;
            list[1][2]= 1000;
            list[1][1]= 10000;
            list[2][1]= 100000;

//and the other four to negative

            list[0][1] = -10;
            list[2][0]= -100;
            list[0][0]= -1000;
            list[2][2]= -10000;

//code to output a blank line separating output sets
            System.out.println("\n");

//code to output all array elements
            System.out.println(list[0][0]);
            System.out.println(list[0][1]);
            System.out.println(list[0][2]);
            System.out.println(list[1][0]);
            System.out.println(list[1][1]);
            System.out.println(list[1][2]);
            System.out.println(list[2][0]);
            System.out.println(list[2][1]);
            System.out.println(list[2][2]);


        }
    }

