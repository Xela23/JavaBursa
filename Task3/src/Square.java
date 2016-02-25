
public class Square extends Main {
	
	double t;
	double n;
	double m;
	int width;
	int height;
	
	public Square(double a, double b, int width, int height) {
		this.x = a;
		this.y = b;
		this.height = height;
		this.width = width;
		t = x + width;
		n = y - height;
		
	}
	
	public String toString(){
		return ("- координаты верхнего левого угла(x=" +x +"," + " " 
	+ "y=" +y +"), координаты верхнего правого угла(x1=" +t +"," + " " 
	+ "y=" +y +"), координаты нижнего левого угла(x=" +x +"," + " " 
	+ "y1=" +n +")"+"," + "размер квадрата(" + "длина=" +height + " " + "высота=" +width +")]");			
	}
	
	public static void main (String[] args){
		Square square = new Square(3.0, 6.0, 5, 5);
		System.out.println(square.toString());
		square.move(2.0, 14.0);
		System.out.println("ѕереместили квадрат:");
		System.out.println(square.toString());
		square.zoom(5.0);
		System.out.println("ћасштабировали квадрат:");
		System.out.println(square.toString());
	}
}
