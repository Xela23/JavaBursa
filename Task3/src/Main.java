
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
	
	void printCircle(){
		System.out.println();
	}
	
	void printRect(){
		System.out.println("Rect передвинули, новые координаты центра: x=" + " " + x + " ," + "  y="+ y);
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
		main.move(4.0, 5.0);
		
	}

}
