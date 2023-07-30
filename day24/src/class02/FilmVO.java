package class02;

public class FilmVO {
	int num; // PK
	String name; // 영화제목
	String odate; // 개봉날짜
	
	// 생성자
	FilmVO(int num, String name, String odate){
		this.num = num;
		this.name = name;
		this.odate = odate;
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
	public String getOdate() {
		return odate;
	}
	public void setOdate(String odate) {
		this.odate = odate;
	}
	@Override
	public String toString() {
		return this.num +". "+ this.name +" [ "+ this.odate +" 개봉 ]";
	}
	
	
}
