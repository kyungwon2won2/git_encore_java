import com.encore.thread.ShareObj;

/*
   자바에서 쓰레드의 대상이 되는 객체를 정의하고 싶다면?
   1.extends Thread -> 단일 extneds만 가능
   2.implement Runnable -> 현업에서 권장하는 방식 (다중 implement가 가능하기때문에)
 */
public class ThreadDemoMain {

	public static void main(String[] args) {
		System.out.println("main thread start");
		
		ShareObj obj = new ShareObj();
		Thread thread01 = new Thread(obj);
		thread01.start();
		
		ShareObj obj02 = new ShareObj();
		Thread thread02 = new Thread(obj);
		thread02.start();
		
		//obj.running();
		//obj.running();
		
		System.out.println("main thread end");
	}

}
