package threads;

public class MainTimer {
	public static void main(String[] args) {
		int hours=0;
		int minutes=0;
		int seconds=0;		
		
		while(hours<24) {
			minutes=0;
			while(minutes<60) {
				seconds=0;
				while(seconds<60) {
					Timer timer=new Timer(hours,minutes,seconds);
					Thread t=new Thread(timer);
					t.start();
					seconds++;
				}
				minutes++;
			}
			hours++;
		}
	}
}
