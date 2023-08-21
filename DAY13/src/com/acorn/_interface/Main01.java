package com.acorn._interface;

public class Main01 {

	public static void main(String[] args) {
		DatabaseMoudule db = 
				new OracleDatabaseMoudule();
		int iRet = db.insert("test");
		System.out.println(iRet);

	}

}