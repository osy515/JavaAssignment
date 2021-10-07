
public class Point {//�ϳ��� ��ǥ���� ��Ÿ��
	//x,y�� ������ ǥ��
	//��� ������ Point ��ü �ܺο��� �������ٺҰ�
	private int x;
	private int y;
	
	//Point ��ü ������ (x,y)�� �ʱ�ȭ - �����ڸ����
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Point() {
		this(0, 0); //�ؿ����� �� �Ϲ�ȭ�ȰŴ�. �װ� ȣ���ؼ� �� �� ����.
		//this.x = 0;   this.y = 0;�̶� ����
	}
	
	//x,y�� �ѹ��� �����ϴ� �޼��� setXY()����
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	//���� Point ��ü�� ���� �ִ� x,y���� ��ȯ�ϴ� getX(),getY()����
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	//���� ��ü�� "(x,y)"�������� ����ϴ� show()����
	public void show() {
		System.out.print("(" + getX() + ", ");
		System.out.print(getY() + ")");
	}
	
}
