package class01;

import java.io.IOException;
import java.util.Iterator; // 이터레이터는 자바 유틸

import org.jsoup.Connection;
import org.jsoup.Jsoup; // 따로 .jar 파일 다운받아서 import해야함
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

// 웹 크롤링
public class Test01 {
	public static void main(String[] args) {
		
		// 1. 웹 페이지 코드를 JAVA로 가져오기
		final String url = "https://www.melon.com/";
		// a) 해당 url의 페이지 코드를 받아오기 위해, 연결통로(스트림)을 open해야함
		//		connect()해야함
		Connection conn = Jsoup.connect(url);
		// b) connect()가 정상적으로 수행되었다면, get()(getter)을 통하여
		// 		해당 페이지의 코드를 받아옴
		// Scanner, Random, ArrayList, ... => JAVA에서 기본적으로 제공하는 클래스
		// Jsoup은 JAVA에서 기본제공해주는 클래스가 아님
		
		Document doc = null;
		try {
			doc=conn.get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 2. 페이지 스크랩핑 완료
//		System.out.println(doc);
		
		// 3. 페이지 코드를 분석
		//   a) DOM 문서를 분석
		//		<></> 태그(요소, element) 단위로 분석
		//		속성(property)을 가질 수 있으며,
		//		분석할 때에 가장 대표적으로 활용되는 속성이
		//	 	id(유일한 요소), class(여러개의 공통점을 가진 요소들)
		Elements elems = doc.select("a.ellipsis");
		// html 표기법
		// 태그명#id명
		// 태그명.class명
		// 상위 태그 > 하위 태그 
		//  => 파싱
		//	파싱을 통해 분석해서 데려옴
		
		// 4. 코드를 분석하여 추출(파싱)완료한 데이터를 console 화면에 출력
		// Iterator 이터레이터
		//	: 거대한 컬렉션(elems)에 이쓴ㄴ 데이터를
		//	  작은 단위의 컬렉션으로 나눠 저장할 수 있도록 해주는 컬렉션
		Iterator<Element> itr = elems.iterator();
		// itr는 hasNext(), next()
		//		다음 요소가 있어? 그럼 다음 거(==내거, <제네릭>에 해당하는 자료형) 보여줘~
		while(itr.hasNext()) {
			String str = itr.next().toString();
			
			// 5. 데이터를 가공
			int index = str.indexOf(">"); // 286에 ">" 가 있음 -> 앞 자를 위치
			str = str.substring(index+1); // 앞 자름
			index = str.indexOf("<"); // 뒤 자를 위치
			str = str.substring(0, index);
			
			System.out.println(str);
		}
		

	}
}
