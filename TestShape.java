import java.util.*;
abstract class Shape{
	public static final double pi=3.14;
	abstract double calculateArea();
}
abstract class TwoD extends Shape{
	public static int dimension=2;
}
abstract class ThreeD extends Shape{
	public static int dimension=3;
}
class Circle extends TwoD{
	double radius;
	Circle(double r){
		this.radius=r;
	}
	double calculateArea(){
		return Shape.pi*this.radius*this.radius;
	}
}
class Triangle extends TwoD{
	double height,base;
	Triangle(double h,double b){
		this.height=h;
		this.base=b;
	}
	double calculateArea(){
		return 0.5*this.height*this.base;
	}
}
class Sphere extends ThreeD{
	double radius;
	Sphere(double r){
		this.radius=r;
	}
	double calculateArea(){
		return 0;
	}
	double calculateVol(){
		return (3/2)*Shape.pi*Math.pow(radius,3);
	}
}
class Cube extends ThreeD{
	int side;
	Cube(int s){
		this.side=s;
	}
	double calculateArea(){
		return 0;
	}
	int calculateVol(){
		return side*side*side;
	}
}
class TestShape{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the radius for circle and sphere: ");
		double r=sc.nextDouble();
		System.out.printf("Enter the height and base of the triangle: ");
		double h=sc.nextDouble();
		double b=sc.nextDouble();
		System.out.printf("Enter the side of the cube: ");
		int s=sc.nextInt();
		Circle c=new Circle(r);
		Sphere sp=new Sphere(r);
		Triangle t=new Triangle(h,b);
		Cube cb=new Cube(s);
		System.out.printf("The area of circle is: %.2f & dimension is:%d\n",c.calculateArea(),c.dimension);
		System.out.printf("The vol of sphere is: %.2f & dimension is:%d\n",sp.calculateVol(),sp.dimension);
		System.out.printf("The area of the triangle: %.2f & dimension is:%d\n",t.calculateArea(),t.dimension);
		System.out.printf("The vol of the cube is: %d & dimension is:%d\n",cb.calculateVol(),cb.dimension);
	}
}
