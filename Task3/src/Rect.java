
public class Rect extends Main {
	
	double t;
	double n;
	double m;
	int width;
	int height;
	
	public Rect(double a, double b, int width, int height) {
		this.x = a;
		this.y = b;
		this.height = height;
		this.width = width;
		t = x + width;
		n = y - height;
		
	}
	
	public String toString(){
		return ("- [���������� �������� ������ ����(x=" +x +"," + " " 
	+ "y=" +y +"), ���������� �������� ������� ����(x1=" +t +"," + " " 
	+ "y=" +y +"), ���������� ������� ������ ����(x=" +x +"," + " " 
	+ "y1=" +n +")"+"," + "������ ��������������(" + "�����=" +height + " " + "������=" +width +")]");			
	}
	
	public static void main (String[] args){
		Rect rect = new Rect(3.0, 6.0, 2, 5);
		System.out.println(rect.toString());
		rect.move(2.0, 14.0);
		System.out.println("����������� �������������:");
		System.out.println(rect.toString());
		rect.zoom(5.0);
		System.out.println("�������������� �������������:");
		System.out.println(rect.toString());
	}
}
