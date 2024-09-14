

package com.mycompany.matrixmultiplication;

public class Matrixmultiplication {

    static int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        int rows1 = firstMatrix.length;
        int cols1 = firstMatrix[0].length;
        int cols2 = secondMatrix[0].length;
        
        int[][] result = new int[rows1][cols2];
        
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }
        
        return result;
    }

    // Function to print a matrix
    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] firstMatrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] secondMatrix = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        System.out.println("First Matrix:");
        printMatrix(firstMatrix);

        System.out.println("Second Matrix:");
        printMatrix(secondMatrix);

        // Multiply matrices
        int[][] product = multiplyMatrices(firstMatrix, secondMatrix);

        System.out.println("Product of the matrices:");
        printMatrix(product);
    }
}
