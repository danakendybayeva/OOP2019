package bonus_on_lesson;

import java.util.*;

public class ShapesAndColors {

	public static void main(String[] args) {
		

	}

}
enum Colors{
	RED,
	BLACK
}

abstract class Shape{
	public Colors color;
	
	public Shape(Colors color)
	{
		this.color = color;
	}
	
	void draw(int n) {
		for(int i = 0; i < n; i++) {
			draw();
		}
	}
	
	abstract void draw();
	
}
 class Circle extends Shape{

	public Circle(Colors c) {
		super(c);
	}
	
	@Override
	public void draw() {
		if (color == Colors.RED)
			System.err.println("()");
		else 
			System.out.println("()");
	}
}

 class Square extends Shape {

		public Square(Colors c)
		{
			super(c);
		}
		@Override
		public void draw()
		{
			if (color == Colors.RED)
			System.err.println("[]");
			else 
			System.out.println("[]");
		}
	}

 class Triangle extends Shape {
		public Triangle(Colors c)
		{
			super(c);
		}
		@Override
		public void draw()
		{
			if (color == Colors.RED)
			System.err.println("^");
			else 
			System.out.println("^");
		}
	}
 
 class Test {

		public static void main(String[] args) {

			Vector<Shape> v = new Vector<Shape>();
			v.add(new Circle(Colors.RED));
			v.add(new Circle(Colors.BLACK));
			v.add(new Square(Colors.RED));
			
			v.add(new Triangle(Colors.RED));
			v.add(new Triangle(Colors.BLACK));
			v.add(new Square(Colors.BLACK));
			for (Shape s : v)
			{
				s.draw();
			}
		}

	}