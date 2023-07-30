package model;

// 상품 데이터에 관한 VO
public class ProductVO {
	private int num; // PK 변수 선언
	private String name; // 상품 이름 변수 선언
	private int price; // 상품 가격 변수 선언
	private int cnt; // 상품 재고 변수 선언
	
	
	// 생성자
	public ProductVO(int num,String name,int price,int cnt) {
		this.num=num; // PK 변수 초기화
		this.name=name; // name 변수 초기화
		this.price=price; // price 변수 초기화
		this.cnt=cnt; // cnt 변수 초기화
	}
	
	// getter, setter
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	// toString 오버라이딩
	@Override
	public String toString() {
		String msg=num+". "+name+" "+price+"원 ["+cnt+"]";
		return msg;
	}
}
