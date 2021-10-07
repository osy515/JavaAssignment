
public class RectangleTest {
	
	static void show(Rectangle r) { 
		r.show();
		System.out.print(" ≥–¿Ã: " + r.getArea());
		System.out.print(" , ");
		System.out.println(" µ—∑π: " + r.getCircumference() + "]");
	}

	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(1,2,5,8);
		RectangleTest.show(rect1);
		
		System.out.println();
		
		
		Rectangle rect2 = new Rectangle(new Point(2,3), new Point(4, 7));
		RectangleTest.show(rect2);
	}
	

}
