//Class: CSE1321L
// Section: 9
// Term: Fall 2020
// Instructor: Howard Dexter
// Name: Patrick O'Connell
// Assignment 8
import java.util.Scanner;
public class Assignment8A {
    public static void main(String[] args){

        Scanner scan= new Scanner(System.in);
        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];

        int num1, num2, num3, num4, num5, num6, num7, num8, num9, num10, num11, num12, num13, num14, num15, num16, num17, num18, temp;
        boolean isEqual=true;
        System.out.print("Array 1 slot (0,0):");
        num1 = scan.nextInt();
        arr1[0][0]=num1;
        System.out.print("Array 1 slot (0,1):");
        num2 = scan.nextInt();
        arr1[0][1]=num2;
        System.out.print("Array 1 slot (0,2):");
        num3 = scan.nextInt();
        arr1[0][2]=num3;
        System.out.print("Array 1 slot (1,0):");
        num4 = scan.nextInt();
        arr1[1][0]=num4;
        System.out.print("Array 1 slot (1,1):");
        num5 = scan.nextInt();
        arr1[1][1]=num5;
        System.out.print("Array 1 slot (1,2):");
        num6 = scan.nextInt();
        arr1[1][2]=num6;
        System.out.print("Array 1 slot (2,0):");
        num7 = scan.nextInt();
        arr1[2][0]=num7;
        System.out.print("Array 1 slot (2,1):");
        num8 = scan.nextInt();
        arr1[2][1]=num8;
        System.out.print("Array 1 slot (2,2):");
        num9 = scan.nextInt();
        arr1[2][2]=num9;

        for(int i =0; i<arr1.length; i++){
            for(int j=0; j<arr1[0].length; j++){
                System.out.print(arr1[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.print("Array 2 slot (0,0):");
        num10 = scan.nextInt();
        arr2[0][0]=num10;
        System.out.print("Array 2 slot (0,1):");
        num11 = scan.nextInt();
        arr2[0][1]=num11;
        System.out.print("Array 2 slot (0,2):");
        num12 = scan.nextInt();
        arr2[0][2]=num12;
        System.out.print("Array 2 slot (1,0):");
        num13 = scan.nextInt();
        arr2[1][0]=num13;
        System.out.print("Array 2 slot (1,1):");
        num14 = scan.nextInt();
        arr2[1][1]=num14;
        System.out.print("Array 2 slot (1,2):");
        num15 = scan.nextInt();
        arr2[1][2]=num15;
        System.out.print("Array 2 slot (2,0):");
        num16 = scan.nextInt();
        arr2[2][0]=num16;
        System.out.print("Array 2 slot (2,1):");
        num17 = scan.nextInt();
        arr2[2][1]=num17;
        System.out.print("Array 2 slot (2,2):");
        num18 = scan.nextInt();
        arr2[2][2]=num18;

        for(int i =0; i<arr2.length; i++){
            for(int j=0; j<arr2[0].length; j++){
                System.out.print(arr2[i][j]+"\t");
            }
            System.out.println();
        }

        int[] sort1 = new int[] {num1,num2,num3,num4,num5,num6,num7,num8,num9};
        int[] sort2 = new int[] {num10,num11,num12,num13,num14,num15,num16,num17,num18};

        for (int i = 0; i < sort1.length; i++) {
            for (int j = i + 1; j < sort1.length; j++) {
                if (sort1[i] > sort1[j]) {
                    temp = sort1[i];
                    sort1[i] = sort1[j];
                    sort1[j] = temp;
                }
            }
        }
        for (int i = 0; i < sort2.length; i++) {
            for (int j = i + 1; j < sort2.length; j++) {
                if (sort2[i] > sort2[j]) {
                    temp = sort2[i];
                    sort2[i] = sort2[j];
                    sort2[j] = temp;
                }
            }
        }
        for(int i =0; i<sort1.length; i++){
            System.out.print("|"+sort1[i]);
        }
        System.out.print("|");
        System.out.println();
        for(int i =0; i<sort2.length; i++){
            System.out.print("|"+sort2[i]);
        }
        System.out.print("|");
        for(int i=0; i<sort1.length; i++){
            if(sort1[i]!=sort2[i]){
                isEqual=false;
                break;
            }
        }
        System.out.println();
        if(isEqual==true){
            System.out.println("Arrays are equivalent.");
        }
        else{
            System.out.println("Arrays are not equivalent.");
        }

    }
}
