//Class: CSE1321L
// Section: 9
// Term: Fall 2020
// Instructor: Howard Dexter
// Name: Patrick O'Connell
// Lab 14C
import java.util.Scanner;
public class Lab14C {
        public static void addArrays(int[][]arr1, int[][]arr2){
            int[][] arr3 = new int[arr1.length][arr2[0].length];
            for(int i =0; i<arr3.length; i++){
                for(int j=0; j<arr3[0].length; j++)
                    arr3[i][j] = arr1[i][j]+arr2[i][j];
            }
            System.out.println("A + B:");
            for(int i =0; i<arr3.length; i++){
                System.out.print("\t");
                for(int j=0; j<arr3[0].length; j++){
                    System.out.print(arr3[i][j]+"\t");
                }
                System.out.println();
            }
        }
    public static void main(String[] args){
            Scanner scan= new Scanner(System.in);
        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];

        int num1, num2, num3, num4, num5, num6, num7, num8, num9, num10, num11, num12, num13, num14, num15, num16, num17, num18;

        System.out.print("Enter a value: ");
        num1 = scan.nextInt();
        arr1[0][0]=num1;
        System.out.print("Enter a value: ");
        num2 = scan.nextInt();
        arr1[0][1]=num2;
        System.out.print("Enter a value: ");
        num3 = scan.nextInt();
        arr1[0][2]=num3;
        System.out.print("Enter a value: ");
        num4 = scan.nextInt();
        arr1[1][0]=num4;
        System.out.print("Enter a value: ");
        num5 = scan.nextInt();
        arr1[1][1]=num5;
        System.out.print("Enter a value: ");
        num6 = scan.nextInt();
        arr1[1][2]=num6;
        System.out.print("Enter a value: ");
        num7 = scan.nextInt();
        arr1[2][0]=num7;
        System.out.print("Enter a value: ");
        num8 = scan.nextInt();
        arr1[2][1]=num8;
        System.out.print("Enter a value: ");
        num9 = scan.nextInt();
        arr1[2][2]=num9;
        System.out.print("Enter a value: ");
        num10 = scan.nextInt();
        arr2[0][0]=num10;
        System.out.print("Enter a value: ");
        num11 = scan.nextInt();
        arr2[0][1]=num11;
        System.out.print("Enter a value: ");
        num12 = scan.nextInt();
        arr2[0][2]=num12;
        System.out.print("Enter a value: ");
        num13 = scan.nextInt();
        arr2[1][0]=num13;
        System.out.print("Enter a value: ");
        num14 = scan.nextInt();
        arr2[1][1]=num14;
        System.out.print("Enter a value: ");
        num15 = scan.nextInt();
        arr2[1][2]=num15;
        System.out.print("Enter a value: ");
        num16 = scan.nextInt();
        arr2[2][0]=num16;
        System.out.print("Enter a value: ");
        num17 = scan.nextInt();
        arr2[2][1]=num17;
        System.out.print("Enter a value: ");
        num18 = scan.nextInt();
        arr2[2][2]=num18;


    System.out.println("Matrix A:");
        for(int i =0; i<arr1.length; i++){
            System.out.print("\t");
            for(int j=0; j<arr1[0].length; j++){
                System.out.print(arr1[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("Matrix B:");
        for(int i =0; i<arr2.length; i++){
            System.out.print("\t");
            for(int j=0; j<arr2[0].length; j++){
                System.out.print(arr2[i][j]+"\t");
            }
            System.out.println();
        }
        addArrays(arr1,arr2);
    }
}
