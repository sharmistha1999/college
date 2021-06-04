package Lab8.com.capgemini;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 
 * @author Sharmistha Roy
 *
 */

public class Exercise2ThreadTimer implements Runnable {
	public synchronized void display() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		System.out.println(sdf.format(date));
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.print("Present time : ");
		while(true) {
			try {
				display();
				Thread.sleep(10000);
				System.out.print("Time after 10 seconds : ");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise2ThreadTimer threadtimer=new Exercise2ThreadTimer();
		Thread thread=new Thread(threadtimer);
		thread.start();
	}
}
