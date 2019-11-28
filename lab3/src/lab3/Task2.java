package lab3;

import java.lang.*;

public class Task2 {

	public static void main(String[] args) {
		Shapes3D cylinder = new Cylinder(3, 4);
		Shapes3D sphere = new Sphere(4);
		Shapes3D cube = new Cube(3);
		
		System.out.println("CYLINDER: surface area = " + cylinder.surfaceArea() + " volume = " + cylinder.volume());
		System.out.println("SPHERE: surface area = " + sphere.surfaceArea() + " volume = " + sphere.volume());
		System.out.println("CUBE: surface area = " + cube.surfaceArea() + " volume = " + cube.volume());

	}

}

abstract class Shapes3D{
	
	abstract double volume();
	
	abstract double surfaceArea();
	
}

class Cylinder extends Shapes3D{
	private double r, h;
	
	public Cylinder(double r, double h) {
		this.r = r;
		this.h = h;
	}

	@Override
	double volume() {
		
		return Math.PI * r * r * h;
	}

	@Override
	double surfaceArea() {
		
		return 2 * Math.PI * r * (r + h);
	}
}

class Sphere extends Shapes3D{
	
	private double r;
	
	public Sphere(double r) {
		this.r = r;
	}

	@Override
	double volume() {
		// TODO Auto-generated method stub
		return (4 * Math.PI * Math.pow(r, 3)) / 3;
	}

	@Override
	double surfaceArea() {
		// TODO Auto-generated method stub
		return 4 * Math.PI * r * r;
	}
	
}

class Cube extends Shapes3D{
	
	private double a;
	
	public Cube(double a) {
		this.a = a;
	}

	@Override
	double volume() {
		// TODO Auto-generated method stub
		return Math.pow(a, 3);
	}

	@Override
	double surfaceArea() {
		// TODO Auto-generated method stub
		return 6 * a * a;
	}
	
}

