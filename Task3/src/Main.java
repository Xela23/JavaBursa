
public class Main {
	double x = 0;
	double y = 0;
	
	public String toString(){
		return ""; 
	}
	
	public void move(double a, double b){
		x = x+a;
		y = y+b;
	}
	
	public void zoom(double k){
		x = x*k;
		y = y*k;
	}
	
	public static void main(String[] args){
		Main main = new Main();
		System.out.println("Круг");
		Circle.main(args);
		System.out.println("Прямоугольник");
		Rect.main(args);
		System.out.println("Квадрат");
		Square.main(args);
		main.zoom(2.0);
		main.move(4.0, 5.0);
	}

}
