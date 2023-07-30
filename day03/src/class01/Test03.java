package class01;

// !!!! 유지보수가 뛰어난 프로그램을 만드는 것이 제 1목표
public class Test03 {

	public static void main(String[] args) {

//		int num = 4; // 음료 종류의 개수 -> 종류의 변동 가능성으로, 유지보수를 위한 변수
//		혹은 배열 선언할때 공간 설정(라인14)을 해주고
//		for문에서 .length를 이용해서 활용 ===> 가독성을 위함
		
		// 음료 3종류의 자판기 제조
		// 재고 데이터를 저장할 공간 필요
		int[] data = new int[5];
		data[0] = 5;
		data[1] = 2;
		data[2] = 3;

		for(int i=0; i<data.length; i++) {
			System.out.println("음료 "+ (i+1) +"은 "+ data[i] +"개 있습니다.");
		}
	}
}
