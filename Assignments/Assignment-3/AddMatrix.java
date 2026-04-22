//Write a Java program to perform the addition between two matrices. Check the order of the matrices before performing the addition operation.

import java.util.Scanner;

public class AddMatrix{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows for matrices:");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns for matrices:");
        int cols = sc.nextInt();

        int[][] matrixA = new int[rows][cols];
        int[][] matrixB = new int[rows][cols];
        int[][] sumMatrix = new int[rows][cols];

        System.out.println("Enter elements of first matrix:");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                matrixA[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of second matrix:");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                matrixB[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        System.out.println("Sum of the two matrices is:");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(sumMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}