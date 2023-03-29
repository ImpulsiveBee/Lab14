//Class: CSE1321L
// Section: 9
// Term: Fall 2020
// Instructor: Howard Dexter
// Name: Patrick O'Connell
// Lab 14B
import java.util.Scanner;
public class Lab14B {

    public static void findMax(int[][]arr){
        int rowMax=0, columnMax=0, max=-10;
        for(int i=0; i<arr.length; i++){
            for(int k=0; k<arr[0].length; k++){
                if(arr[i][k]>max){
                    rowMax=i;
                    columnMax=k;
                    max=arr[i][k];
                }
            }
        }


      System.out.println("First largest value is located at row "+rowMax+" and column "+columnMax);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int row=3, column=4;
        int[][] arr  = new int[row][column];
        int num1, num2, num3, num4, num5, num6, num7, num8, num9, num10, num11, num12;

        System.out.print("Enter a value: ");
        num1 = scan.nextInt();
        arr[0][0]=num1;
        System.out.print("Enter a value: ");
        num2 = scan.nextInt();
        arr[0][1]=num2;
        System.out.print("Enter a value: ");
        num3 = scan.nextInt();
        arr[0][2]=num3;
        System.out.print("Enter a value: ");
        num4 = scan.nextInt();
        arr[0][3]=num4;
        System.out.print("Enter a value: ");
        num5 = scan.nextInt();
        arr[1][0]=num5;
        System.out.print("Enter a value: ");
        num6 = scan.nextInt();
        arr[1][1]=num6;
        System.out.print("Enter a value: ");
        num7 = scan.nextInt();
        arr[1][2]=num7;
        System.out.print("Enter a value: ");
        num8 = scan.nextInt();
        arr[1][3]=num8;
        System.out.print("Enter a value: ");
        num9 = scan.nextInt();
        arr[2][0]=num9;
        System.out.print("Enter a value: ");
        num10 = scan.nextInt();
        arr[2][1]=num10;
        System.out.print("Enter a value: ");
        num11 = scan.nextInt();
        arr[2][2]=num11;
        System.out.print("Enter a value: ");
        num12 = scan.nextInt();
        arr[2][3]=num12;

        System.out.println("The entered matrix:");
        for(int i=0; i<row; i++){
            System.out.print("\t");
            for(int j=0; j<column; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
        findMax(arr);
    }
}
