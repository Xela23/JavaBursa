package com.itb.classes;


/**
 * This class creates a new circle with a specified radius and center location.
 */
public class Circle {

	private int centerX;
	private int centerY;
	private int radius;
	

	/**
	 * Creates a new instance of Circle with a specified position and radius.
	 */
	public Circle(int centerX, int centerY, int radius) {
		this.centerX = centerX;
		this.centerY = centerY;
		this.radius = radius;
	}

	/**
	 * Creates a new instance of Circle with a specified radius.
	 */
	public Circle(int radius) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Moves the center of the circle
	 * 
	 * @param dx
	 *            - differentiation of x coordinate
	 * @param dy
	 *            - differentiation of y coordinate
	 */
	public void move(int dx, int dy) {
		// TODO Auto-generated method stub
		centerX = centerX + dx;
		centerY = centerY + dy;
	}

	/**
	 * Checks if specified point belongs to this circle
	 * 
	 * @param x
	 *            - x center coordinate of specified point
	 * @param y
	 *            - y center coordinate of specified point
	 * @return true if specified point belongs to this circle, if not - return
	 *         false
	 */
	public boolean isPointInCircle(int x, int y) {
		// TODO Auto-generated method stub
		 if ((Math.pow((x-centerX),2)+Math.pow((y-centerY), 2))<=Math.pow((radius), 2)){
			 return true;
		 }
		return false;
	}

	/**
	 * Checks if specified circle is in this circle
	 * 
	 * @param circle
	 *            - specified circle
	 * @return 
	 * @return true if specified circle is in this circle, if not - return false
	 */

	public boolean isCircleInCurrentCircle(Circle circle, int centerX1, int centerY1, int radius1) {
		if ((Math.pow((centerX1-centerX),2)+Math.pow((centerY1-centerY), 2))<=radius+radius1){
			return true;
		}
		// TODO Auto-generated 	method stub
		return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Координаты центра окружности: x=" +centerX + ", y=" + centerY + ", " + "radius="+radius;
	}
				
	public static void main(String[] args){
		Circle circle = new Circle(2,3,4);
		System.out.println(circle);
		System.out.println("-Круг передвинули");
		circle.move(4, 10);
		System.out.println(circle);
		System.out.println("-В кругу ли точка");
		System.out.println(circle.isPointInCircle(7, 10));
		System.out.println("-Попадает ли одна окружность в другую");
		System.out.println(circle.isCircleInCurrentCircle(circle, 10, 2, 1));
	}
}
