package class03;

import java.util.Scanner;

class Point {
	String name; // 이름(색)
	int x; // x좌표
	int y; // y좌표

	// 생성자
	Point(){ // 기본생성자
		this(0, 0);
	}

	Point(int x) { // 인자 하나
		this(x, x);
	}

	Point(int x, int y) { // 인자 두개
		this.name = "점";
		this.x = x;
		this.y = y;
	}

	// 메소드
	void move() { // 1씩 이동
		this.x++;
		this.y++;

		System.out.println("1씩 이동합니다!");
		this.printPoint();
	}

	void move(int a) { // a씩 이동
		this.x += a;
		this.y += a;

		System.out.println(a +"씩 이동합니다!");
		this.printPoint();
	}	

	void move(int x, int y) { // x는 x씩, y는 y씩 이동
		this.x += x;
		this.y += y;

		System.out.println("x좌표는 "+ x +"씩, y좌표는 "+ y +" 이동합니다!");
		this.printPoint();						
	}
	// 색 변경 메소드
	void changeColor(String name) {

		this.printPoint();
	}

	void printPoint() {
		System.out.println(this.name+"("+ this.x +", "+ this.y +")");
	}
}

class ColorPoint extends Point { // Point클래스를 상속받음

	// 생성자
	ColorPoint(){
		this(0, 0);
	}

	ColorPoint(int x, int y) {
		this("검정",x, y);
	}

	ColorPoint(String color, int x, int y) {
		super(x, y);
		this.name = color;
	}

	// 색 변경 메소드
	void changeColor(String name) {
		this.name = name;

		System.out.println("색을 변경합니다!");
		this.printPoint();
	}
}

public class PracticeTest02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Point[] data = new Point[3]; // 객체 배열 생성
		String menu = "===== 메뉴 =====\n"
				+ "1. 점 생성\n"
				+ "2. 점 목록 출력\n"
				+ "3. 점 1개 출력\n"
				+ "4. 점 이동\n"
				+ "5. 색 변경\n"
				+ "6. 프로그램 종료\n";
		int action; // 메뉴 입력 받을 변수
		int num; // 사용자에게 입력 받은 번호 변수
		boolean isColor; // 사용자에게 입력 받을 색
		int index = 0; // 인덱스 값
		int xNum; // x 좌표 입력받기
		int yNum; // y 좌표 입력받기
		String color; // 입력 받을 색

		// 프로그램 시작
		while(true) {
			System.out.println(menu); // 화면 출력
			System.out.print("번호 입력 : ");
			action = sc.nextInt(); // 메뉴 입력 받음

			// 6) 프로그램 종료
			if(action == 6) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			// 1) 점 생성
			else if(action == 1) {
				if(index == data.length) {
					System.out.println("더이상 점을 생성할 수 없습니다!");
					continue;
				}
				System.out.println("색이 있는 점을 생성하시겠습니까?");
				System.out.println("1) 네   2) 아니요\n");
				System.out.print("번호 입력 : ");
				num = sc.nextInt();

				if(num == 1) { // 색이 있는 점 생성
					isColor = true;
					
					System.out.println("색을 설정하시겠습니까?\n설정하지 않으시면 '검정'으로 설정됩니다.");
					System.out.println("1) 네   2) 아니요\n");
					System.out.print("번호 입력 : ");
					num = sc.nextInt();

					if(num == 1) { // 색 입력받고 좌표 설정
						System.out.println("무슨 색으로 하시겠습니까?");
						System.out.print("색 입력 : ");
						color = sc.next(); // 색 입력 받음
						System.out.println("좌표를 입력해주세요.");
						System.out.print("x좌표 입력 : ");
						xNum = sc.nextInt();
						System.out.print("y좌표 입력 : ");
						yNum = sc.nextInt();

						data[index++] = new ColorPoint(color, xNum, yNum);
					}

					else if(num == 2) { // 색 안받고 좌표 설정 유무
						System.out.println("좌표를 설정하시겠습니까?");
						System.out.println("1) 네   2) 아니요\n");
						System.out.print("번호 입력 : ");
						num = sc.nextInt();

						if(num == 1) { // 색 안받고 좌표 설정
							System.out.print("x좌표 입력 : ");
							xNum = sc.nextInt();
							System.out.print("y좌표 입력 : ");
							yNum = sc.nextInt();

							data[index++] = new ColorPoint(xNum, yNum);
						}
						else if(num == 2) { // 색 안받고 좌표 설정 안함
							data[index++] = new ColorPoint();
						}
					}
				}

				else if(num == 2) { // 색이 없는 점 생성, 좌표 설정 유무
					isColor = false;
					
					System.out.println("좌표를 설정하시겠습니까?");
					System.out.println("1) 네   2) 아니요\n");
					System.out.print("번호 입력 : ");
					num = sc.nextInt();

					if(num == 1) { // 색 없고 좌표 설정
						System.out.print("x좌표 입력 : ");
						xNum = sc.nextInt();
						System.out.print("y좌표 입력 : ");
						yNum = sc.nextInt();

						data[index++] = new Point(xNum, yNum);
					}
					else if(num == 2) { // 색 없고 좌표 설정 안함
						data[index++] = new Point();
					}
				}
				System.out.println("점 생성 완료!");
				data[index-1].printPoint();
			}
			
			// 2) 점 목록 출력
			else if(action == 2) {
				if(index <= 0) {
					System.out.println("생성된 점이 없습니다!");
					continue;
				}
				for(int i=0; i<index; i++) {
					System.out.println(data[i].name + " (" + data[i].x +", "+ data[i].y + ")");
				}
			}
			
			// 3) 점 1개 출력
			else if(action == 3) {
				// 배열 출력해서 어떤 점 있는지 보여주기
				for(int i=0; i<index; i++) {
					System.out.println((i+1) +"번) "+ data[i].name + " (" + data[i].x +", "+ data[i].y + ")");
				}
				
				System.out.println("어떤 점을 출력하고 싶습니까?");
				System.out.print("번호 입력 : ");
				num = sc.nextInt();
				
				if(num < 0 || index < num) {
					System.out.println("생성된 점이 없습니다!");
					continue;
				}
				
				data[num-1].printPoint();
			}
			
			// 4) 점 이동
			else if(action == 4) {
				// 배열 출력해서 어떤 점 있는지 보여주기
				for(int i=0; i<index; i++) {
					System.out.println((i+1) +"번) "+ data[i].name + " (" + data[i].x +", "+ data[i].y + ")");
				}
				
				
				System.out.println("어떤 점을 이동시키겠습니까?");
				num = sc.nextInt()-1;
				
				if(num < 0 || index < num) {
					System.out.println("생성된 점이 없습니다!");
					continue;
				}
				
				System.out.println("어떤 이동을 원하십니까?");
				System.out.println("1) 1씩 이동   2) 둘 다 이동   3) 각자 이동");
				System.out.print("번호 입력 : ");
				int userNum = sc.nextInt();
				
				if(userNum == 1) { // 1씩 이동
					data[num].move();
				}
				
				else if(userNum == 2) { // 입력 받은 값으로 둘 다 이동
					System.out.println("이동하길 원하는 수를 입력해주세요.");
					System.out.print("번호 입력 : ");
					xNum = sc.nextInt();
					
					data[num].move(xNum);
				}
				
				else if(userNum == 3) { // 입력 받은 값으로 각자 이동
					System.out.println("x좌표가 이동하길 원하는 수를 입력해주세요.");
					System.out.print("번호 입력 : ");
					xNum = sc.nextInt();
					System.out.println("y좌표가 이동하길 원하는 수를 입력해주세요.");
					System.out.print("번호 입력 : ");
					yNum = sc.nextInt();
					
					data[num].move(xNum, yNum);
				}
				
			}
			
			// 5) 색 변경
			else if(action == 5) {
				
				// 배열 출력해서 어떤 점 있는지 보여주기
				for(int i=0; i<index; i++) {
					System.out.println((i+1) +"번) "+ data[i].name + " (" + data[i].x +", "+ data[i].y + ")");
				}
				
				System.out.println("어떤 점의 색을 바꾸고 싶습니까?");
				System.out.print("번호 입력 : ");
				num = sc.nextInt()-1;
				
				if(num < 0 || index < num) {
					System.out.println("생성된 점이 없습니다!");
					continue;
				}
				
				System.out.println("어떤 색으로 바꾸고 싶습니까?");
				System.out.print("색 입력 : ");
				color = sc.next();
				
				data[num].changeColor(color);
				
			}
		}
	}
}

