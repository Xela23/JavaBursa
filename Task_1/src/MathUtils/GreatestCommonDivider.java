package MathUtils;

public class GreatestCommonDivider {

	public static void main(String[] args){
		int a = 4;
		int b = 20;
		System.out.println(getCommonDivisior(a,b));
	}
	private static int getCommonDivisior(int a, int b){
		if (b==0)
			return a;
		int x = a%b;
		return getCommonDivisior(b,x);
		}
}

