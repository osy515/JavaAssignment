
public class Child {
	//어린이가 소유하고 있는 구슬의 개수를 저장!!
	int marble;
	
	//객체 생성시 보유 구슬 개수 초기화
	//각 어린이의 구슬 개수는 0이상 구슬 개수는 음수가 될 수 없음
	public Child(int num) {
		if(num >= 0) {
			this.marble = num;
		}
		else
			System.out.println("구슬의 개수를 양수로 설정해주세요");
	}
	

	//놀이를 통한 '주고받음'
	public void takeMarble(int takeCount, Child looser) {
		//승자가 얻는 구슬 수는 곧 패자가 잃는 구슬 수
		int takeNum = looser.loseMarble(takeCount);
		marble += takeNum;
	}
	public int loseMarble(int loseCount) {
		if(marble < loseCount ) { //갖고 있는 거보다 더 많이 요구하면
			return 0; 			  //아예 잃을 수 없음
		}
		marble -= loseCount;
		return loseCount;
	}
	
	//어린이가 현재 갖고있는 구슬개수 표시 가능
	public void show() {
		System.out.println(marble);
	}
}
