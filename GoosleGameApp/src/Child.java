
public class Child {
	//��̰� �����ϰ� �ִ� ������ ������ ����!!
	int marble;
	
	//��ü ������ ���� ���� ���� �ʱ�ȭ
	//�� ����� ���� ������ 0�̻� ���� ������ ������ �� �� ����
	public Child(int num) {
		if(num >= 0) {
			this.marble = num;
		}
		else
			System.out.println("������ ������ ����� �������ּ���");
	}
	

	//���̸� ���� '�ְ����'
	public void takeMarble(int takeCount, Child looser) {
		//���ڰ� ��� ���� ���� �� ���ڰ� �Ҵ� ���� ��
		int takeNum = looser.loseMarble(takeCount);
		marble += takeNum;
	}
	public int loseMarble(int loseCount) {
		if(marble < loseCount ) { //���� �ִ� �ź��� �� ���� �䱸�ϸ�
			return 0; 			  //�ƿ� ���� �� ����
		}
		marble -= loseCount;
		return loseCount;
	}
	
	//��̰� ���� �����ִ� �������� ǥ�� ����
	public void show() {
		System.out.println(marble);
	}
}
