package threads;

public class Timer implements Runnable{
	int h;
	int m;
	int s;

	public Timer() {
		super();
	}

	public Timer(int h, int m, int s) {
		super();
		this.h = h;
		this.m = m;
		this.s = s;
	}

	@Override
	public void run() {
		try {
			System.out.println(h+" : "+m+" : "+s);
			Thread.sleep(10000);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		
	}
}
