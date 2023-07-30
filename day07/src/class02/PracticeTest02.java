package class02;

import java.util.Random;
import java.util.Scanner;

// [ 포켓몬 문제 ]
//
// - 포켓몬클래스
// string 변수 : 3마리 포켓몬 받을
// int 변수 : 레벨 받을
// 최대 경험치 변수(클래스 변수) : 100
// 경험치 변수 : 0-10 랜덤
// 
// 생성자)
// 인자값 받은 포켓몬 이름 초기화
// 인자값 받은 레벨 초기화
// 경험치 랜덤 값 초기화
// 
// 정보메소드)
// 포켓몬 이름, 레벨, 경험치/최대경험치 출력
//
// 게임 메소드)
// 성공 실패 랜덤 값 초기화
// 성공 경험치 변수 랜덤 값 초기화
// 랜덤으로 돌려서 성공인지 실패인지 -> if
// 성공이면, 경험치에 성공변수 더해줌
// 실패면, 경험치에 10 더해줌
//	경험치가 최대 경험치랑 같거나 많아지면 -> if
//	레벨은 1 증가 하고, (경험치-최대)를 경험치에 넣음
//	"포켓몬, 레벨업!" 출력
//
// - main
// 포켓몬 이름, 레벨 입력받을 변수 선언
// 스캐너로 받음
// 

// 클래스
class Pokemon {

	String name; // 입력받을 포켓몬 이름
	int level; // 입력받을 레벨
	static int maxExp = 100; // 최대 경험치
	int exp; // 경험치

	// 생성자
	Pokemon(String name, int level){
		Random rand = new Random();

		this.name = name;
		this.level = level;
		this.exp = rand.nextInt(10); // 경험치 0~10 랜덤값

	}

	// 정보 메소드
	void printInfo() {
		System.out.println(this.name +" "+"LV."+ this.level +" [ "+ this.exp + " / " + maxExp + " ]" );
	}

	// 게임 메소드
	void game() {

		Random rand = new Random();

		boolean isSuc = rand.nextBoolean(); // 성공 실패 랜덤 받을 변수
		int sucExp = rand.nextInt(101)+50; // 성공시 더해줄 경험치 랜덤 값 

		// 성공이냐 실패냐
		if(isSuc) {

			this.exp += sucExp; // 경험치에 성공한 랜덤 경험치 더해줌

			System.out.println("배틀에서 이겼습니다. \n축하드립니다!");
			System.out.println(this.name+" 포켓몬이 경험치 "+ sucExp +"를 얻었습니다.");


		}
		else {

			this.exp += 10; // 경험치에 실패하면 10을 더해줌

			System.out.println("배틀에서 졌습니다.");
			System.out.println(this.name+" 포켓몬이 경험치 10을 얻었습니다.");

		}

		// 레벨업
		while (this.exp >= maxExp) {

			this.level++;
			this.exp -= maxExp;

			System.out.println(this.name +", 레벨업!\n");
			System.out.println("현재 경험치 : "+" [ "+ this.exp + " / " + maxExp + " ]\n");
		}

	}
}

public class PracticeTest02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Pokemon[] poInfo = new Pokemon[3]; // 입력받은 포켓몬 정보 배열

		String name; // 입력받을 이름
		int level; // 입력받을 레벨

		System.out.println("게임 시작 전, 포켓몬 세 마리를 설정해주세요!");

		// 포켓몬 3마리 입력
		for (int i = 0; i < poInfo.length; i++) {
			while(true) {
				int isName;
				System.out.print("포켓몬 이름 입력: ");
				name = sc.next();
				System.out.println("'"+name+"'"+"으로 결정하시겠습니까?(정수로 입력하세요) \n 1)네   2)아니오");
				isName = sc.nextInt(); // 이름 결정여부 입력받음

				if(isName < 1|| 2 <= isName) { // 이름 검사
					System.out.println("다시 입력하세요.");
					continue;
				}
				else {
					break;
				}
			}

			while(true) {
				System.out.print("포켓몬 레벨 입력(1~100중에 입력): ");
				level = sc.nextInt();

				if(level<=0 || 100<level) {
					System.out.println("잘못된 입력입니다. 다시 입력하세요");
					continue;
				}
				else {
					break;
				}
			}
				poInfo[i] = new Pokemon(name, level);
			

			System.out.println("LV."+ level +" "+ name +"이 저장되었습니다.\n");


		}

		int select; // 어떤 포켓몬으로 게임할 지 선택받을 변수
		int reStart; // 게임 이어서 할 지 입력받을 변수
		while(true) {
			System.out.println("게임을 하시겠습니까?(정수로 입력하세요) \n 1)네   2)아니오");
			int start = sc.nextInt(); // 게임 할 지 여부 입력받음

			if(start == 2) {
				System.out.println("게임을 종료합니다.");
				break; // 게임 종료
			}
			else if(start < 1|| 2 < start) {
				System.out.println("다시 입력하세요.");
				continue; // 유효성 검사
			}
			else {
				// 포켓몬 선택
				poInfo[0].printInfo();
				poInfo[1].printInfo();
				poInfo[2].printInfo();

				System.out.print("세 마리 포켓몬 중 어떤 포켓몬으로 게임하시겠습니까?(1, 2, 3으로 입력) : ");
				select = sc.nextInt();

				if(select<1 || 3<select) { // 유효성 검사
					System.out.println("잘못 입력하셨습니다.\n메인화면으로 넘어갑니다.");
					continue;
				}
				
				// 게임 돌리기
				int i = select-1;
				poInfo[i].printInfo();
				System.out.println(" 포켓몬으로 게임합니다.");

				boolean flag;
				while(true) {

					poInfo[i].game();

					// 게임 계속 하나
					System.out.println("이어서 게임하시겠습니까? (정수로 입력하세요) \n1)네   2)아니오");
					reStart = sc.nextInt();

					if(reStart<1 || 3<reStart) { // 유효성 검사
						System.out.println("잘못 입력하셨습니다.\n다시 선택하세요.");
						continue;
					}
					if(reStart==2) {
						System.out.println("게임을 종료합니다.");
						flag = true; // 게임 종료
					}
					else {
						continue; // 게임 이어서 함
					}

					if(flag) {
						break;
					}


				}

			}

		}

	}

}

