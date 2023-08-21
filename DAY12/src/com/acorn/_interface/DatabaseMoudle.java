package com.acorn._interface;

public interface DatabaseMoudule {
	int DB_VERSION = 1;
	
	int insert(String s);
	
	String select();
}
	
