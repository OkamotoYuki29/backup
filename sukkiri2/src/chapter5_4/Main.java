package chapter5_4;

public class Main {
	public static void main(String[] args){
		System.out.println("三角形:" + calcTriangleArea(10.0,5.0) + "平方cm");
		System.out.println("円:" + calcCircleArea(5.0) + "平方cm");
	}
	public static double calcTriangleArea(double bottom, double height){
		double area = bottom * height /2;
		return area;
	}
	public static double calcCircleArea(double radius){
		double area = radius * radius * 3.14;
		return area;
	}
}
