package class05;

public class Test02 {
	public static void main(String[] args) {
		
		// 변수 만들어보기
		// 1.공간 2.주소 3.이름
		int data; // 변수 생성완료된 모습
		// 여기까지가 변수의 필수 3요소
		
		// 이제, 변수가 생겼으니까
		// "데이터(값, value)" 저장
		data = -321;
		// = : 대입연산자
		
		System.out.println("data라는 이름의 변수에 저장된 값");
		System.out.println(data);
		// The local variable data may not have been initialized
		// 값이 저장된 것이 없습니다.
		// 초기화가 안됨
		// 초기화 : 변수에 최초로 값을 저장하는 작
		System.out.println("입니다.");
		}
}


		// [연습문제]
		// 문자열 "안녕하세요"를 저장하고 싶어요.
		// 저장된 공간의 이름을 hello라고 해주세요.
		// 이 변수 hello를 활용하여 console 창에 "안녕하세요"를 두번 출력해주세요
