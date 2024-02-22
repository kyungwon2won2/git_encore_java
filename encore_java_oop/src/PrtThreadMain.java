import com.encore.thread.Prt;
import com.encore.thread.PrtThread;

public class PrtThreadMain {

	public static void main(String[] args) {
		System.out.println("main thread start");
		
		Prt prt = new Prt();
//		prt.printChar('A');
//		System.err.println();
		
		PrtThread runnable01 = new PrtThread('A', prt);
		Thread thread01 = new Thread(runnable01);
		thread01.start();		
		
		PrtThread runnable02 = new PrtThread('B', prt);
		Thread thread02 = new Thread(runnable02);
		thread02.start();
		
		PrtThread runnable03 = new PrtThread('C', prt);
		Thread thread03 = new Thread(runnable03);
		thread03.start();
		
		System.out.println("main thread end");
	}

}
