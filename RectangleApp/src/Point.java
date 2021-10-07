
public class Point {//하나의 좌표값을 나타냄
	//x,y는 정수로 표현
	//멤버 변수는 Point 객체 외부에서 직접접근불가
	private int x;
	private int y;
	
	//Point 객체 생성시 (x,y)값 초기화 - 생성자만들기
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Point() {
		this(0, 0); //밑에꺼가 더 일반화된거다. 그걸 호출해서 쓸 수 있음.
		//this.x = 0;   this.y = 0;이랑 같음
	}
	
	//x,y를 한번에 수정하는 메서드 setXY()제공
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	//현재 Point 객체가 갖고 있는 x,y값을 반환하는 getX(),getY()제공
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	//현재 객체를 "(x,y)"형식으로 출력하는 show()제공
	public void show() {
		System.out.print("(" + getX() + ", ");
		System.out.print(getY() + ")");
	}
	
}
