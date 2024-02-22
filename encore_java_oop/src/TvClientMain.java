import com.encore.tv.domain.LgTV;
import com.encore.tv.domain.SamsungTV;
import com.encore.tv.factory.TvBeanFactory;
import com.encore.tv.util.TV;

public class TvClientMain {

	public static void main(String[] args) {
		/*
		SamsungTV tv = new SamsungTV();
		tv.powerOn();
		*/
		
		/*
		LgTV tv = new LgTV();
		tv.turnOn();
		*/
		
		/*
		TV tv = new LgTV();
		tv.turnOn();
		*/
		
		TvBeanFactory factory = TvBeanFactory.getInstance();
		
		TV tv = factory.getBean("samsung");
		tv.turnOn();
		
	}

}
