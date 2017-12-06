
import java.util.*;
import java.util.zip.CRC32;

import Geometry.SimpleCircle;
import Geometry.TV;
import Geometry.Circle;


public class JetBrain {
    public static void main(String argc[]){

        Scanner scan = new Scanner(System.in);

        Circle circle = new Circle(20);
        Circle c1 = new Circle(20);
        Circle c2 = new Circle(20);
        Circle c3 = new Circle(20);
        int c[] = {1,2,3,5};

        Circle cirs[] = {c1,c2,c3};
        System.out.println("它奶奶的");




    }


    // ------------------------------ Methods ------------------------------

    public static double nor(double a){
        return 1/(1 - Math.exp(a));
    }
    public static double nor(int c){
        return (double)1/(1-Math.exp(c));
    }



    public static void show(int[] arr){
        // foreach迴圈
        //for(data_type element: matrix)
        for(int c: arr){
            System.out.println(c);
        }
    }



    public static void show(int[][] arr){
        for(int i=0;i<arr.length;i++){
            if(i>=1) System.out.println();
            for(int k=0;k<arr[0].length;k++){
                System.out.print(arr[i][k]+"\t");
            }
        }
    }

    // 可變長度陣列 [important]
    public static void printMax(int... numbers){
        if(numbers.length == 0){
            System.out.println("No argument passed");
            return;
        }

        double result = numbers[0];

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>result){
                result = numbers[i];
            }
        }
        System.out.println("The max value is " + result);
    }

    public static int sum(int[][] m){
        int total = 0;
        for(int row = 0; row<m.length; row++){
            for(int col=0; col<m[0].length; col++){
                total += m[row][col];
            }
        }

        return total;
    }

    public static void array_2d(){
        double score[][] = {
                {1,2,3,4,5},
                {13,23,34,54,75},
                {16,42,13,34,52},
                {145,22,333,44,75},

        };

        // 不規則矩陣
        int triangArray[][] = {
                {1,2,3,4,5},
                {1,2,3,4,5},
                {1,2,3,4},
                {1,2,3,4},
                {1,2,3},
                {1,2,3}
        };

        // 先宣告後指定
        int row,col;
        row = 10;
        col = 10;

        int matrix[][] = new int[row][col];
        int scores[][][] = new int[row][][];

        for(int i=0;i<matrix.length;i++)
            Arrays.fill(matrix[i],(int)(Math.random()*10));



        int arr[][] = {
                {1,2,3,4,5,6},
                {1,2,3,4,5,6,7,8,9},
                {1,2,3,4,5},
                {1,2,3,4,5,6,7},
                {1,2,3},
                {1,2,3,4},
                {1,2,3,4,5,6,7,8},
        };
        int total = sum(matrix);
        System.out.println(total);
        System.out.println("---------------------------");
        show(matrix);
    }


    public static void setCircleRadius(Circle c,double r){


        c.setRadius(r);

    }
    public static void setCircleRadius(Circle c[],double r[]){
        for(int i=0;i<c.length;i++){
            c[i].setRadius(r[i]);
        }

    }
}

class Student{
    String name;
    int age;
    boolean isSci;
    char gender;

}
