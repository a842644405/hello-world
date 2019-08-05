package test;

import thread.Extends;

public class TestExtends {
	public static void main(String[] args) {
		Extends e = new Extends();
		e.start();
		for (int i = 0; i < 200; i++) {
			System.out.println("main...");
		}
		
	}
}
