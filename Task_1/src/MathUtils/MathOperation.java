package MathUtils;
public class MathOperation {

	private static final String[][] C = null;
	/**
	 * Returns the greatest common divider of given two numbers
	 * 
	 * @param firstNumber
	 *            - positive number
	 * @param secondNumber
	 *            - positive number
	 * @return greatest common divider of two numbers
	 */
	public int getCommonDivisor(int a, int b) {
		// TODO the method body
		if (b==0)
			return a;
		int x = a%b;
		return getCommonDivisor(b,x);
		
}
	/**
	 * Returns sum of digits of the given number
	 * 
	 * @param number
	 *            - positive number
	 * @return the sum of digits of the given number
	 */
	public int getSumOfDigits(int x) {
		// TODO the method body
		int n = 0;
		while (x!=0){
		n = n +(x%10);
		x=x/10;
		}
		return n;
	}

	/**
	 * Checks if the given number is prime or not
	 * 
	 * @param number
	 * @return true - if number is prime, if not return false
	 */
	public boolean isPrime(int a) {
		// TODO the method body
			if(a == 0)
				return false;
			for (int j=2; (j*j <=a); j++)	
				if (a % j == 0)
					return false;
			return true;
	}

	/**
	 * Returns sum of row: 1! - 2! + 3! – 4! + 5! - … + n!
	 * 
	 * @param n
	 *            - positive number
	 */
	public int getSumOfRow(int n) {
		int erg = 1;
		for (int i =1; i<=n; i++){
			erg=erg*1;
		}
		// TODO the method body
		return erg;
	}

	/**
	 * Подсчитать, сколько шестизначных чисел имеют равную сумму трех первых и
	 * трех последних цифр.
	 * 
	 */
	public int getSixDigitNumbersCount() {
		int b = 0;
		 for(int i=1001;i<1000000;i++){
	            int i1=i/100000%10,
	                i2=i/10000%10,
	                i3=i/1000%10,
	                i4=i/100%10,
	                i5=i/10%10,
	                i6=i%10;
	            if((i1+i2+i3)==(i4+i5+i6)){
	                b++;
	            }
	        }
	        //System.out.println(b);
			return b;
	    }

	/**
	 * Returns Fibonacci series of a specified length
	 * 
	 * @param length
	 *            - the length of the Fibonacci series
	 * @return array filled with Fibonacci series
	 */
	public int[] getFibonacciSeries(int lenght) {
		// TODO the method body
        int[] array = new int[lenght];
        array[0] = 1;
        array[1] = 1;
        for(int i=2; i <lenght; i++){
            array[i] = array[i-1] + array[i-2];
            
        }
        for(int i=0; i< lenght; i++){
			System.out.print(array[i] + " ");
        }
		return array;
}

	/**
	 * Returns array with prime numbers
	 * 
	 * @param length
	 *            - the length of prime numbers series
	 */
	public  int getPrimeSeries(int length) {
		int n = 100; 
		for (int i = 2; i <= n; i++) { 
		boolean isPrime = true; 
			for (int j = 2; j < i && isPrime; j++) { 
				if ((i % j) == 0) { 
					isPrime = false; 
				} 
			} 

		if (isPrime) { 

		System.out.print(i + " "); 
		} 
	}
		return n; 
} 
	/**
	 * Prints to console chessboard using arrays b - black square w - white
	 * square
	 * 
	 * the output should be like the following
	 * 
	 * w b w b w b w b b w b w b w b w w b w b w b w b b w b w b w b w w b w b w
	 * b w b b w b w b w b w w b w b w b w b b w b w b w b w
	 */
	public void printChessboard() {
		// TODO the method body
		String a = "�";
		String b = "�";
		String [][] matrixA = new String[2][10];
		for (int i = 0; i < 2; i++) {
		    for (int j = 0; j < 10; j++) {
		    	matrixA[i][j] = (a+b);
		        System.out.print(matrixA[i][j]);
		    }
		    System.out.println();
		}
	
	}

	/**
	 * 1.9. Создать целый шестимерный массив с двумя значениями в каждом
	 * измерении. Заполнить массив числами из начала натурального ряда: 1, 2, 3,
	 * … Сказать, сколько потребуется чисел ?
	 * 
	 * @return
	 */
	public int createSixDimensionArray() {
		int result = 0;
		int[][][][][][] array = new int[2][2][2][2][2][2];
		
		for (int i = 0; i < array.length; i++) {
			int[][][][][] arrayFive = array[i];
				for (int j = 0; j < arrayFive.length; j++) {
					int[][][][] arrayFour = arrayFive[j];
						for (int k = 0; k < arrayFour.length; k++) {
							int[][][] arrayThree = arrayFour[k];
								for (int l = 0; l < arrayThree.length; l++) {
									int[][] arrayTwo = arrayThree[l];
										for (int m = 0; m < arrayTwo.length; m++) {
											int[] is = arrayTwo[m];
												for (int n = 0; n < is.length; n++) {
													is[n] = result;
													result++;
												}
										}
								}
						}
				}
		}
		return result;
	}

	/**
	 * Prints to console Pascal's triangle with the given number of rows
	 * 
	 * @param numberOfRows
	 *            the number of rows in the triangle
	 */
	public void printPascalsTriangle(int numberOfRows) {
		// TODO the method body
		
		long[][] C = new long[numberOfRows+1][numberOfRows+1];
		for (int n = 0; n <= numberOfRows; n++) {	
			C[n][0] = C[n][n] = 1;
			for (int k = 1; k < n; k++) {
				C[n][k] = C[n-1][k-1] + C[n-1][k];  
			}
		}
		for (int n = 0; n <= numberOfRows; n++) {
			for (int k = 0; k <= n; k++) {
				System.out.print(C[n][k] + " ");
			}
			System.out.println();
	}
	}
	public static void main(String[] args) {
		MathOperation math = new MathOperation();

		int gdc = math.getCommonDivisor(10, 15); // 5
		System.out.println(gdc);
		int sumOfDigits = math.getSumOfDigits(123456); // 21
		System.out.println(sumOfDigits);
		boolean isPrime = math.isPrime(7); // true
		System.out.println(isPrime);
		isPrime = math.isPrime(10); //false
		System.out.println(isPrime);
		int sumOfRow = math.getSumOfRow(5);
		System.out.println(sumOfRow);
		int count = math.getSixDigitNumbersCount();
		System.out.println(count);
		int [] fibbonacci = math.getFibonacciSeries(10); // [1, 1, 2, 3, 5, 8, 13, 21, 34, 55]
		System.out.println(fibbonacci);
		int primes = math.getPrimeSeries(5); // 1, 3, 5, 7, 11
		System.out.println(primes);
		math.printChessboard();
		int numbersCount = math.createSixDimensionArray();
		System.out.println(numbersCount);
		math.printPascalsTriangle(3);
		
	}
}
