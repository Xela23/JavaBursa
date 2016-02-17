package MathUtils;
public class MathOperation {

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
		// TODO the method body
		return 0;
	}

	/**
	 * Подсчитать, сколько шестизначных чисел имеют равную сумму трех первых и
	 * трех последних цифр.
	 * 
	 */
	public int getSixDigitNumbersCount() {
		return 0;
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
		int a = lenght;
        int[] n = new int[a];
        n[0] = 1;
        n[1] = 1;
        for(int i=2; i <a; i++){
            n[i] = n[i-1] + n[i-2];
            
        }
        for(int i=0; i< a; i++){
			System.out.print(n[i] + " ");
        }
		return n;
}

	/**
	 * Returns array with prime numbers
	 * 
	 * @param length
	 *            - the length of prime numbers series
	 * @return array filled with prime numbers
	 */
	public int[] getPrimeSeries(int length) {
		// TODO the method body
		return null;
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
		return 0;
	}

	/**
	 * Prints to console Pascal's triangle with the given number of rows
	 * 
	 * @param numberOfRows
	 *            the number of rows in the triangle
	 */
	public void printPascalsTriangle(int numberOfRows) {
		// TODO the method body
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
		int [] primes = math.getPrimeSeries(5); // 1, 3, 5, 7, 11
		System.out.println(primes);
		math.printChessboard();
		int numbersCount = math.createSixDimensionArray();
		System.out.println(numbersCount);
		math.printPascalsTriangle(3);
	}
}
