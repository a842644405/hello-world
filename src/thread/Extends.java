package thread;

public class Extends extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("thread。。。");
		}
	}

}
