package com.acorn._final;


// 상수 : 초기화 한번만 가능
// 상수 : final 데이터 타입 = 초기값
// 상수명 : 대문자로 만듬.
public class Main {
	
	private final static String NAME = "YSM";

	public static void main(String[] args) {
		int n = 1;
		final int M = 2; //파이널 변수는 대문자 사용하도록!!!!
		n = 2;
		
		System.out.println(n);
		System.out.println(M);
		
//		Main main = new Main();
		
//		System.out.println(main.NAME);		
		System.out.println(NAME);
	}

}
