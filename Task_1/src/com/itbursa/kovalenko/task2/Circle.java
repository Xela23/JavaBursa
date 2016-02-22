package com.itbursa.kovalenko.task2;


public class Circle {
	double x = 2.0;
	double y = 4.0;
	double r = 3.0;
	
	public void printCircle(){
		 System.out.println("���������� ����� ����������" + ":" + " " + x + "," + " " + y + " " + "������" + " " + r);
	}
	public void moveCircle(double a, double b){
		x = x+a;
		y = y+b;
		System.out.println("����� ���������� ������ ����������" + ":" + " " + x + " " + "," + y);
	}
	public void pointInCircle(double a, double b){
		double n = a-x;
		double m = b-y;
		double k = (Math.pow((n),2)+Math.pow((m), 2));
		 if (k<=Math.pow((r), 2)){
		System.out.println("����� ��������� � ����������");
		 }
		 else{
		 System.out.println("����� ��������� ��� ����������");
		 }
	}
	public void circleInCircle(double x1, double y1, double r1){
		double distance;
		distance = Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));
		if (distance > (r+r1)){
		System.out.println("���� 2 �� ������������ � ������ 1");
	}
		else if ((distance <= Math.abs(r - r1))) {
	        System.out.println("���� 2 ��������� ������ ����� 1");
	    } else {
	        System.out.println("���� 2 ������������ � ������ 1");
	}
}

	public static void main(String[] args) {
		Circle a1 = new Circle();
		a1.printCircle();
		a1.moveCircle(3.0,2.0);
		a1.pointInCircle(10.0, 3.0);
		a1.circleInCircle(2.0, 5.0, 3.0);
		
	}
}
