//Write a Java program to perform multiplication between two matrices.          
import java.util.Scanner;
public class ArrayMul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows for matrices:");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns for matrices:");
        int cols = sc.nextInt();

        int[][] matrixA = new int[rows][cols];
        int[][] matrixB = new int[rows][cols];
        int[][] productMatrix = new int[rows][cols];

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
                productMatrix[i][j] = 0;
                for(int k=0; k<cols; k++){
                    productMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        System.out.println("Product of the two matrices is:");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(productMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}