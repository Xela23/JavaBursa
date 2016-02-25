
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
		return ("- ���������� �������� ������ ����(x=" +x +"," + " " 
	+ "y=" +y +"), ���������� �������� ������� ����(x1=" +t +"," + " " 
	+ "y=" +y +"), ���������� ������� ������ ����(x=" +x +"," + " " 
	+ "y1=" +n +")"+"," + "������ ��������(" + "�����=" +height + " " + "������=" +width +")]");			
	}
	
	public static void main (String[] args){
		Square square = new Square(3.0, 6.0, 5, 5);
		System.out.println(square.toString());
		square.move(2.0, 14.0);
		System.out.println("����������� �������:");
		System.out.println(square.toString());
		square.zoom(5.0);
		System.out.println("�������������� �������:");
		System.out.println(square.toString());
	}
}
