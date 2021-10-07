
public class Rectangle {
	//Point 객체로 두 꼭지점 유지(lt,rb)
	Point LeftTop;
	Point RightBottom;
	
	//객체 생성시 두 꼭지점을 초기화-
	//int값 네개를 받거나
	public Rectangle(int x1, int y1, int x2, int y2) {
		/*LeftTop = new Point(x1, y1); //위에서 하나만들어 놓고 필요한 순간에 초기화
		RightBottom = new Point(x2, y2);*/
		this(new Point(x1, y1), new Point(x2, y2));
	}
	
	//Point 객체 두개를 받거나
	public Rectangle(Point lt, Point rb) {
		LeftTop = new Point(lt.getX(), lt.getY());
		RightBottom = new Point(rb.getX(), rb.getY());
	}
	
	//폭과 높이를 구하는 메서드 getWidth(), getHeight()
	public int getWidth() {
		return RightBottom.getX() - LeftTop.getX();
	}
	public int getHeight() {
		return RightBottom.getY() - LeftTop.getY();
	}
	//둘레와 넓이를 구하는 메서드 getCircumference(), getArea()
	public int getCircumference() {
		return (getWidth()+getHeight()) * 2;
	}
	public int getArea() {
		return getWidth() * getHeight();
	}
	//현재 사각형의 정보를 출력하는 메서드 show()
	public void show() {
		System.out.print("[직사각형 ");
		System.out.print(this.getWidth() + "*");
		System.out.print(this.getHeight() + ":");
		LeftTop.show();
		RightBottom.show();
		
	}
}
