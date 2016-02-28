package com.itb.classes;
import java.util.Arrays;

public class Matrix {

	private double[][] matrix;
	private int rows;
	private int columns;

	/**
	 * Creates a new instance of Matrix rows-by-columns of 0's
	 * 
	 * @param rows
	 *            -number of rows
	 * @param columns
	 *            - number of columns
	 */
	public Matrix(int rows, int columns) {
		// TODO Auto-generated constructor stub
		this.rows = rows;
		this.columns = columns;
		matrix = new double[rows][columns];
		//this.matrix[rows][columns] = matrix[rows][columns];
		
	}

	/**
	 * Creates a new instance of Matrix based on 2d array
	 * 
	 * @param data - data to fill the matrix
	 */
	public Matrix(double[][] data) {
		this.matrix = data;
		// TODO Auto-generated constructor stub
		
	}

	/**
	 * Returns the result of adding specified matrix to this matrix
	 * @param matrix
	 * @return
	 */
	public Matrix plus(Matrix matrix) {
		// TODO Auto-generated method stub
		for (int i = 0; i<this.matrix.length; i++){
			for(int j = 0; j<this.matrix[i].length; j++){
				this.matrix[i][j] += matrix.matrix[i][j];
			}
		}
		return matrix;
	}

	/**
	 * Returns the result of multiplying this matrix by specified number
	 */
	public Matrix times(double number) {
		Matrix matrix = new Matrix(new double[rows][columns]);
		// TODO Auto-generated method stub
		 for (int i = 0; i < this.matrix.length; i++) {
	            for (int j = 0; j < this.matrix[i].length; j++) { 
	            	this.matrix[i][j] *= number;
	            }
		 }
		return matrix;
		
	}

	/**
	 * Returns the result of multiplying this matrix by specified matrix
	 */
	public Matrix times(Matrix matrix) {
		// TODO Auto-generated method stub
		for (int i = 0; i<this.matrix.length; i++){
			for(int j = 0; j<this.matrix[i].length; j++){
				this.matrix[i][j] *= matrix.matrix[i][j];
			}
		}
		return matrix;
	}

	/**
	 * Transposes (turn all the rows of a given matrix into columns and
	 * vice-versa) this matrix
	 * 
	 * @return transpose of the invoking matrix
	 */
	public Matrix transpose() {
		Matrix transMatrix = new Matrix(columns, rows);
		for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
            	transMatrix.matrix[j][i] = this.matrix[i][j];
            }
		}
        return transMatrix;
	}

	/**
	 * Prints matrix to the "standard" output stream.
	 */
	public void print() {
		if (matrix == null) {
            System.out.println("null");
        } else {
            System.out.printf("%dx%x:%n", matrix.length, matrix[0].length);

            for (double[] row : matrix) {
                System.out.println(Arrays.toString(row));
            }
        }
       }
    //}
	public static void main(String[] atgs){
		Matrix matrix = new Matrix(new double[][]{{2, 4, 5},	{3, 7, 2}});
		Matrix matrix1 = new Matrix(new double[][]{{20, 40, 50},	{30, 70, 20}});
		matrix.plus(matrix1);
		System.out.println("Новая матрица:");
		matrix.print();
		matrix.times(10);
		matrix.print();
		matrix.times(matrix1);
		matrix.print();
		matrix.transpose();
		System.out.println("Транспонированная матрица:");
		matrix.print();
		
	}
}
