package com.acorn;

public class VariableMain3 {

	public static void main(String[] args) {
		// ++, --
		int x = 10;
		x--;
		System.out.println(x);
		--x;
		System.out.println(x);
		int y = x++ + 5;
		System.out.println(y);
		y = ++x + 5;
		System.out.println(y);

	}

}
