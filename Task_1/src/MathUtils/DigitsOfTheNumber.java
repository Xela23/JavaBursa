package MathUtils;

public class DigitsOfTheNumber {
	public static void main (String[] args){
		int a = 967;
		System.out.println(gerSumOfDigits(a));
	}
	private static int gerSumOfDigits(int a){
		if (a==0)
			return 0;
		int x = a%10;
		int y = (a/10)%10;
		int z = (a/100)%10;
		int n = x+y+z;
		return n;
		
	}

}
