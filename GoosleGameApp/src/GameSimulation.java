
public class GameSimulation {
	//어린이 1 구슬 15개보유, 어린이 2 구슬 9개 보유
	//내용 : 1차게임에서 1이 2의 구슬 2개획득 
	//      2차게임에서 2는 1의 구슬 7개 획득
	public static void main(String[] args) {
		Child child1 = new Child(15);
		Child child2 = new Child(9);
		
		System.out.println("[게임 전 구슬 수]");
		System.out.print("어린이1 : ");
		child1.show();
		System.out.print("어린이2 : ");
		child2.show();
		
		child1.takeMarble(2, child2);
		System.out.println("[1차게임 후 구슬 수]");
		System.out.print("어린이1 : ");
		child1.show();
		System.out.print("어린이2 : ");
		child2.show();
		
		child2.takeMarble(7, child1);
		System.out.println("[2차게임 후 구슬 수]");
		System.out.print("어린이1 : ");
		child1.show();
		System.out.print("어린이2 : ");
		child2.show();
	
	}

}
