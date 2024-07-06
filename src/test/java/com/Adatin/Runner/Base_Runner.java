package com.Adatin.Runner;

import com.reusable.Base_Class;

public class Base_Runner extends Base_Class {
	
	public static void reuse() {
		launch();
		url("https://www.facebook.com");
		url("https://www.instagram.com");
	}
	public static void main(String[] args) {
		reuse();
	}

}
