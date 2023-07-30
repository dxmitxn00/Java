package class03;

import java.util.Random;

// 사용자 클래스
class Player {
	Random rand = new Random();
	final static int maxIndex = 3;
	private int preIndex;
	private Pokemon[] data = new Pokemon[maxIndex];
	// data[0] = new 피카츄();

	// 생성자
	Player() {
		this.data[0] = new Pikachu("피카츄");
	}

	
	
	@Override
	public boolean equals(Object obj) {
		
		Player player = (Player) obj;
		
		return false;
	}



	// 플레이 메소드
	boolean play() {
		int index1 = rand.nextInt(3); // 첫 번째 포켓몬 인덱스
		int index2 = rand.nextInt(3); // 두 번째 포켓몬 인덱스
		
		if(this.data[index1].equals(this.data[index2])) {
			return true; // 포켓몬이 같을 때
		}
		return false; // 포켓몬이 다를 때
	}
	
	public void getData() {
		
	}
}

// 포켓몬 클래스
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

// 피카츄 클래스
class Pikachu extends Pokemon {

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

public class PracticeTest02 {

	public static void main(String[] args) {

		Player p = new Player();
		
		
		
	}
}
