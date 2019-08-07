
public class TestVirtualInvoke {
		static void doStuff(Shape s ) {
			s.draw();
		}
			
	public static void main(String [] args) {
		// TODO Auto-generated method stub
		//�鷽������
		Circle c = new Circle();
		Triangle t = new Triangle();
		Line l = new Line();
		doStuff(c);
		doStuff(t);
		doStuff(l);
		
		Shape s = new Circle();
		doStuff(s);
		s.draw();
		
		Shape c2 = new Circle();
		c2.draw();

	}
}
class Shape{
			void draw() {
				System.out.println("Shape Drawing");
			}
		}
		class Circle extends Shape{
			void draw() { System.out.println("Draw Circle");}
		}
		class Triangle extends Shape{
			void draw() { System.out.println("Draw Three Lines");}
		}
		class Line extends Shape{
			void draw() { System.out.println("Draw Line");}
		}
		
