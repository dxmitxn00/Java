package class01;

class Family extends Thread {
	
	Account a = new Account();
	

	@Override
	public void run() {
		
		a.pay();
		
	}
}

class Account {
	
	static int money = 10000;
	
	synchronized void pay() {
		
		if(money > 0) {
			System.out.println("결제 성공!");
			System.out.println(Thread.currentThread().getName()+"님이 5,000원 사용하셨습니다!");
			money -= 5000;
		}
		else {
			System.out.println("결제 실패...");
			System.out.println(Thread.currentThread().getName()+"님, 잔액이 부족합니다!");
		}
		
		System.out.println("남은 잔액 : "+ money);
		System.out.println();
		
	}
	
}

public class PracticeTest01 {
	public static void main(String[] args) {

		Family f = new Family();
		Thread t1 = new Thread(f, "papa");
		Thread t2 = new Thread(f, "mama");
		Thread t3 = new Thread(f, "dauther");
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}
}
