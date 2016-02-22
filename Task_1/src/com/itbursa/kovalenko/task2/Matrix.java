package com.itbursa.kovalenko.task2;

import java.util.Arrays;

public class Matrix {
    private int[][] values;

    public Matrix(int[][] initialValues) {
        this.values = initialValues;
    }

   
    public void Multiplication(int c) {
        for (int i = 0; i < this.values.length; i++) {
            for (int j = 0; j < this.values[i].length; j++) {
                this.values[i][j] *= c;
            }
        }
    }
    
    public void add(Matrix m) {
    	
        for (int i = 0; i < this.values.length; i++) {
            for (int j = 0; j < this.values[i].length; j++) {
                this.values[i][j] += m.values[i][j];
            }
        }
    }
    public void multip(Matrix m) {
    	
        for (int i = 0; i < this.values.length; i++) {
            for (int j = 0; j < this.values[i].length; j++) {
                this.values[i][j] *= m.values[i][j];
            }
        }
   }
    public void transpose() {
     
        int[][] transMatrix = new int[this.values[0].length][this.values.length];
        
        for (int i = 0; i < this.values[0].length; i++) {
            for (int j = 0; j < this.values.length; j++) {
                transMatrix[i][j] = this.values[j][i];
            }
        }
        this.values = transMatrix;
    }

    // --------------------------------------------------------------

    private void print() {
        if (values == null) {
            System.out.println("null");
        } else {
            System.out.printf("%dx%x:%n", values.length, values[0].length);

            for (int[] row : values) {
                System.out.println(Arrays.toString(row));
            }
        }
    }
    public static void main(String[] args) {
        Matrix m = new Matrix(new int[][]
                {
                        {2, 4, 5},
                        {3, 7, 2},
                        {-2, 0, 1},
                        {5, 1, 1}
                });

        System.out.println("Новая матрица m:");
        m.print();
        System.out.println("------------------------------------------------------------------");

        Matrix n = new Matrix(new int[][]
                {
                        {1, 0, -1},
                        {1, 3, 3},
                        {-2, -4, 1},
                        {0, 0, 1}
                });

        System.out.println("Новая матрица n:");
        n.print();

        System.out.println("------------------------------------------------------------------");
        
        System.out.println("Умножение матрицы n на 10:");
        n.Multiplication(10);
        n.print();

        System.out.println("------------------------------------------------------------------");

        System.out.println("Сложение матриц");
        m.add(n);
        m.print();

        System.out.println("------------------------------------------------------------------");

        System.out.println("Умножение матриц");
        m.multip(n);
        m.print();

        System.out.println("------------------------------------------------------------------");

        System.out.println("Транспонирование матрицы n:");
        n.transpose();
        n.print();
    }
}