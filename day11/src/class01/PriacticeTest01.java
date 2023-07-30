package class01;

// 포켓몬 클래스
//	- String name 이름
//	- int win 이긴 횟수
//	- void hello() 울음소리() : 각각의 포켓몬 마다 고유한 소리를 출력
//	- boolean game(Pokemon pokemon 상대포켓몬) 게임()s : 승패 여부
//		-> pokemonA.game(pokemonB);
//			홀홀, 작은 값이 이김
//			짝짝, 큰 값이 이김
//			홀짝/짝홀, 홀수가 이김


// class 생성 시 고려사항
// 1. abstract일까?
//		- 이 클래스의 객체가 필요한가?
//		- 추상 메소드가 있나? == 오버라이딩을 강제 해야하는 메서드가 있나?
//						  == 재정의 해야하는 매서드가 있나?
// 2. 멤버 변수 생성
//		- private
//		- getter, setter
// 3. 생성자
// 4. 메소드
//		- 오버라이딩(재정의)을 강제해야하나? => 추상 메소드를 만들어야 하나?
//		- '기능'을 보고, "INPUT, OUTPUT"을 생각하여 '메소드 시그니처' 작성

abstract class Pokemon{

	private String name;
	private int win;
	Pokemon(String name){ // 추상클래스 생성자 소유 가능
		this.name=name;
		this.win=0;
	}
	abstract void hello();
	boolean game(Pokemon pokemon) { 

		// 값이 같은 경우
		if(this.win == pokemon.win) {
			this.win++;
			this.thisWin(pokemon);
			}

		// A가 홀수고 B가 짝수인 경우
		else if(this.win%2!=0 && pokemon.win%2==0) {
			this.win++;
			this.thisWin(pokemon);
		}

		// A가 짝수고 B가 홀수인 경우
		else if(this.win%2==0 && pokemon.win%2!=0) {
			pokemon.win++;
			this.poWin(pokemon);
			return false;
		}

		// A랑 B랑 둘다 짝수인 경우
		else if(this.win%2==0 && pokemon.win%2==0) {
			// 더 큰값 찾기
			if(this.win > pokemon.win) {
				this.win++;
				this.thisWin(pokemon);
			}
			else {
				pokemon.win++;
				this.poWin(pokemon);
				return false;
			}
		}

		// A랑 B랑 둘다 홀수인 경우
		else if(this.win%2!=0 && pokemon.win%2!=0) {
			// 더 작은 값 찾기
			if(this.win > pokemon.win) {
				pokemon.win++;
				this.poWin(pokemon);
				return false;
			}
			else {
				this.win++;
				this.thisWin(pokemon);
			}
		}


		return true;
	}
	
	// 승패 출력
	public void thisWin(Pokemon pokemon) {
		System.out.println(this.name + "가 이겼습니다!");
		System.out.println(this.name + " : "+ this.win + "승  |  " + pokemon.name + " : "+ pokemon.win + "승");
	}
	
	public void poWin(Pokemon pokemon) {
		System.out.println(pokemon.name + "가 이겼습니다!");
		System.out.println(this.name + " : "+ this.win + "승  |  " + pokemon.name + " : "+ pokemon.win + "승");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWin() {
		return win;
	}
	public void setWin(int win) {
		this.win = win;
	}
}

// 1. 메서드 안만든거 있어~~ => 오버라이딩 강제되고있는 메서드(추상메서드)
//    => 1. 나도 추상클래스 하던지
//       2. 추상메서드 오버라이딩 해주던지 ◀
// 2. super()를 호출하는 중이야~~ => 부모클래스에게는 기본생성자가 현재 없음
//    => 1. 부모클래스에 기본생성자 만들던지
//       2. 부모클래스의 다른생성자를 사용하던지 ◀

class Pikachu extends Pokemon{

	// 생성자
	Pikachu(String name){
		super("피카츄");
	}

	// 추상메소드 재정의
	void hello() {
		System.out.println(this.getName() +"이 대화를 시도합니다!");
		System.out.println(this.getName() +": \" 피카피카~ \"");
	}
}

class Raichu extends Pokemon {

	// 생성자
	Raichu(String name){
		super("라이츄");
	}

	// 추상메소드 재정의
	void hello() {
		System.out.println(this.getName() +"이 대화를 시도합니다!");
		System.out.println(this.getName() +": \" 라이츄~ \"");
	}


}


public class PriacticeTest01 {
	public static void main(String[] args) {
		
		Pikachu pika = new Pikachu("피카츄");
		Raichu rai = new Raichu("라이츄");
		
		pika.game(rai);
		pika.game(rai);
		pika.game(rai);
		pika.game(rai);

		System.out.println();
		
		pika.hello();
		rai.hello();
		
	}
}



////////////////////////////////////////
// 1. 생성자 컨트롤 : 자식 생성자 잘 만드나
// 2. 추상메소드 오버라딩 : 가능한가
// 3. 인자로 객체를 받는 경우
////////////////////////////////////////
















