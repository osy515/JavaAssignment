
public class GameSimulation {
	//��� 1 ���� 15������, ��� 2 ���� 9�� ����
	//���� : 1�����ӿ��� 1�� 2�� ���� 2��ȹ�� 
	//      2�����ӿ��� 2�� 1�� ���� 7�� ȹ��
	public static void main(String[] args) {
		Child child1 = new Child(15);
		Child child2 = new Child(9);
		
		System.out.println("[���� �� ���� ��]");
		System.out.print("���1 : ");
		child1.show();
		System.out.print("���2 : ");
		child2.show();
		
		child1.takeMarble(2, child2);
		System.out.println("[1������ �� ���� ��]");
		System.out.print("���1 : ");
		child1.show();
		System.out.print("���2 : ");
		child2.show();
		
		child2.takeMarble(7, child1);
		System.out.println("[2������ �� ���� ��]");
		System.out.print("���1 : ");
		child1.show();
		System.out.print("���2 : ");
		child2.show();
	
	}

}
