package MathUtils;

public class NumberPrimeOrNot {
	public static void main (String[] args){
		//boolean n = false;
		//int a = 10;
		//System.out.println(a);
		//Name name = new isPrime();
		int a = 10;
		if(isPrime(a))
		System.out.println(a + " " + "число простое");
	}
	public static boolean isPrime(int a){
		for (int j=2; (j*j <=a); j++)
			if (a % j == 0)
				return false;
		
		return true;
		
	}
	

}
