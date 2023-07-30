package class02;

// 1. 객체끼리 값을 "공유"하는 경우
//	static 붙여서 클래스 변수로 선언
// 	this 사용 하면 x
// 2. 객체들로도 배열을 생성할 수 있음

class Game{
	String name; // 객체마다 다른 것 (인스턴스 변수) : 모래성 게임을 하는 사람이름 
	static int res = 100; // 객체마다 같은 것 (공유자원) : 모래성

	// this == 자기 자신 객체
	// res는 클래스변수(공유자원)이기 때문에 this를 붙일 필요 없음

	Game(String name){
		this.name = name;
		System.out.println(this.name+"님 참가!");
	}

	boolean game(int cnt) {
		res -= cnt;
		if(res<=0) {
			System.out.println(this.name+"님 패배,,,");
			return false;
		}
		System.out.println(this.name+"님 성공! 남은 모래: "+res);
		return true; // 이겼을 때 true 반환
	}
}

public class Test02 {
	public static void main(String[] args) {
		/*
		Game g1 = new Game("홍");
		Game g2 = new Game("길");
		Game g3 = new Game("덩");
		*/

		// 객체 배열 : 객체로 만드는 배열
		Game[] data = new Game[3];
		data[0] = new Game("홍");
		data[1] = new Game("길");
		data[2] = new Game("덩");

		/*
		while(true) {

			for(int i=0; i<data.length; i++) {
				if(!data[i].game(5)) {
					break; // 여기서의 break는 while이 아닌 for문에 대한 break임
					// break문 다음으로 제일 하위의 반복문을 break 해줌
				}
			}

		}
		*/

		// 첫 번째부터 마지막까지 돌아가면서
		// 순서대로 게임을 할 건데
		// 만약 패배했다면 종료
		// 언제 패배할지 모르니까 while
		// 처음부터 마지막까지니까 i=0
		// 한 명하면 다음 사람 해야하니까 i++

		int i=0;
		while(true) {

				if(!data[i++].game(5)) {
					break;
				}
				if(i==data.length) {
					i=0;
				}
			

		}
	}
}
