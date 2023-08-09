package study.maintosub1;

public class Div {
	//  필드(속성) 영역
	
	///////////////////////////////////////////////////////////////////////////////	
	// 생성자 영역: public  클래스명(): 기본생성자/인자가 있는 생성자
	public Div() {}
	
	///////////////////////////////////////////////////////////////////////////////
	// Getters/Setters 메소드 영역
	

	///////////////////////////////////////////////////////////////////////////////
	// 일반 메소드 영역: 정적/동적	
	// 정적 메소드 영역
	
	public static int divOperation(int iAddFirstNum, int iAddSecondNum) {
		int iAddResultValue = 0;
		// + 연산: 결과값 할당연산자 좌항 연산자 우항(example:변수3=변수1+변수2)
		iAddResultValue = iAddFirstNum / iAddSecondNum;		
		return iAddResultValue;			
	}
	///////////////////////////////////////////////////////////////////////////////
	
	// 동적 메소드 영역
	public int divOperation(int iAddFirstNum, int iAddSecondNum, String sMsg) {
		int iAddResultValue = 0;
		// + 연산: 결과값 할당연산자 좌항 연산자 우항(example:변수3=변수1+변수2)
		iAddResultValue = iAddFirstNum / iAddSecondNum;		
		return iAddResultValue;			
	}	
	///////////////////////////////////////////////////////////////////////////////
	// 메서드 오버로딩 영역
}