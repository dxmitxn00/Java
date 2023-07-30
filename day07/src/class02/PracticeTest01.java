package class02;

import java.util.Random;

// Home 클래스
// name 인스턴스 변수로 사람 이름을 담음
// money 클래스 변수로 잔고 10,000원 통장 개설
// 생성자에는 이름 받을 인자를 생성하고 이름 초기화
// use(int used) 메소드에 사용한 돈을 인자로 받고
// 				통장에서 차감
//				돈 다쓰면 마지막에 돈 쓴 사람 이름 출력


// 클래스 선언
class Home{
	String name;
	static int money = 10000;
	
	// 생성자
	Home(String name){
		this.name = name;
	}
	
	// 돈 사용하는 메소드
	boolean use(int used) {
		money -= used;
		
		if(money <= 0) {
			System.out.println(this.name +"님이 돈 다썻대요 ~");
			return false; // 돈 다쓰면 false
		}
		
		System.out.println(this.name +"님이 "+ used +"원 사용하여 "+ money +"원 남았습니다.");
		
		return true; // 돈 남으면 true
	}
	
}

//main
//객체 배열 선언
//while문 활용
//쓸 돈을 변수 설정해서 랜덤 값으로 줌
//if문으로 boolean use에 반환된 값을 통해 break
//		인덱스가 잘 돌아가게 인덱스 길이값이 동일해지면 i=0 -> i++
//

public class PracticeTest01 {
	public static void main(String[] args) {
		
		// 객체 배열
		Home[] person = new Home[3];
		person[0] = new Home("홍");
		person[1] = new Home("길");
		person[2] = new Home("동");
		
		int used;
		int i = 0;
		
		while(true) {
			
			// 사용한 돈을 랜덤값으로
			Random rand = new Random();
			used = (rand.nextInt(1000)+1)*10;
			
			// 입력한 돈을 쓸 수 없으면 브레이크
			if(!person[i++].use(used)) {
				break;
			}
			
			// 인덱스값이 계속 돌도록 0을 줌
			if(i == person.length) {
				i = 0;
			}
			
		}
		
	}
}
