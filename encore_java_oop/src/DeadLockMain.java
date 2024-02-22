import com.encore.thread.DeadLockThreadFirst;
import com.encore.thread.DeadLockThreadSecond;

public class DeadLockMain {

	public static void main(String[] args) {
		StringBuffer sb01 = new StringBuffer();
		StringBuffer sb02 = new StringBuffer();
		
		new Thread (new DeadLockThreadFirst(sb01, sb02)).start();;
		new Thread (new DeadLockThreadSecond(sb01, sb02)).start();;
	}

}
