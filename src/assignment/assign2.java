package assignment;

class person{
	
	int haveMonsterCan = 0;

	public void bringCan(refrigerator refri, int bring) {
		haveMonsterCan += refri.takeCan(bring);
	}

	public void showInfo() {
		System.out.println("사람이 현재 가지고 있는 몬스터 캔 개수 : " + haveMonsterCan);
	}
	
}

class refrigerator{
	
	int monsterCan;
	
	public refrigerator(int monsterCan) {
		this.monsterCan = monsterCan;
		
	}
	
	public int takeCan(int takeNumber) {
		monsterCan -= takeNumber;
		
		return takeNumber;
	}
	
	public void showInfo() {
		System.out.println("냉장고가 현재 가지고 있는 몬스터 캔 개수 : " + monsterCan);
	}
	
}

public class assign2 {
	
	public static void main(String[] args) {
		refrigerator fri = new refrigerator(20);
		person per = new person();
		
		per.bringCan(fri, 5);
		
		fri.showInfo();
		per.showInfo();
	}
}
