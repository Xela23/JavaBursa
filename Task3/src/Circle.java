
public class Circle extends Main {
	int  r;
	
	Circle(double a, double b, int r){
		this.x = a;
		this.y = b;
		this.r = r;
	}
	
	public String toString(){
		return "- [�����(x=" + x + ",y=" + y + ") R = " + r +"]"; 
	}
	
	public static void main (String[] args){
		Circle circle = new Circle(4.0,3.0,5);
		System.out.println("�������� ������������ �����");
		System.out.println(circle.toString());
		circle.move(5.0, 7.0);
		System.out.println("����������� ����");
		System.out.println(circle.toString());
		circle.zoom(10.0);		
		System.out.println("���� ��������������");
		System.out.println(circle.toString());
	}
}
