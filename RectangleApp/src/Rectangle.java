
public class Rectangle {
	//Point ��ü�� �� ������ ����(lt,rb)
	Point LeftTop;
	Point RightBottom;
	
	//��ü ������ �� �������� �ʱ�ȭ-
	//int�� �װ��� �ްų�
	public Rectangle(int x1, int y1, int x2, int y2) {
		/*LeftTop = new Point(x1, y1); //������ �ϳ������ ���� �ʿ��� ������ �ʱ�ȭ
		RightBottom = new Point(x2, y2);*/
		this(new Point(x1, y1), new Point(x2, y2));
	}
	
	//Point ��ü �ΰ��� �ްų�
	public Rectangle(Point lt, Point rb) {
		LeftTop = new Point(lt.getX(), lt.getY());
		RightBottom = new Point(rb.getX(), rb.getY());
	}
	
	//���� ���̸� ���ϴ� �޼��� getWidth(), getHeight()
	public int getWidth() {
		return RightBottom.getX() - LeftTop.getX();
	}
	public int getHeight() {
		return RightBottom.getY() - LeftTop.getY();
	}
	//�ѷ��� ���̸� ���ϴ� �޼��� getCircumference(), getArea()
	public int getCircumference() {
		return (getWidth()+getHeight()) * 2;
	}
	public int getArea() {
		return getWidth() * getHeight();
	}
	//���� �簢���� ������ ����ϴ� �޼��� show()
	public void show() {
		System.out.print("[���簢�� ");
		System.out.print(this.getWidth() + "*");
		System.out.print(this.getHeight() + ":");
		LeftTop.show();
		RightBottom.show();
		
	}
}
