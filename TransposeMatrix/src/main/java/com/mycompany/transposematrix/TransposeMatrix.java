

package com.mycompany.transposematrix;


public class TransposeMatrix {
    public static int [][] transpose(int [][] matrix){
        int rows =matrix.length;
        int cols=matrix[0].length;
        int[][] transposed = new int [cols][rows];
        for(int i =0; i<rows;i++){
            for(int j=0; j<cols; j++){
               transposed[j][i]=matrix[i][j]; 
            }
        }
        return transposed;
       
        
     }
    

    public static void main(String[] args) {
       int [][]matrix={
           {10,20,30},
           {40,50,60},
           {70,80,90}
       };
       int[][] transposed =transpose(matrix);
        System.out.println("Original Matrix : ");
        print_Matrix(matrix);
        System.out.println("\n Transposed Matrix: ");
        print_Matrix(transposed);
        
    }
    public static void print_Matrix(int [][]matrix){
        for(int []row  : matrix){
            for(int num : row){
                System.out.print(num+ " ");
            }
            System.out.println();
        }
    }
}
