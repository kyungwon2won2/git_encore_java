import java.io.IOException;

import com.encore.stream.EncoreException;
import com.encore.stream.IODemo;

public class IODemoMain {

	public static void main(String[] args) {
		IODemo demo = new IODemo();
		
		// case01.
//		String msg = null;
//		try {
//			msg = demo.inputStr();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(msg);
//		String [] strAry = msg.split(" ");
//		System.out.println("length : "+strAry.length);
//		
//		int sum = 0;
//		for(String data : strAry) {
//			sum += Integer.parseInt(data)
//		}
		
		// case02.
//		int data = demo.inputInt();
//		System.out.println(data);
//		System.out.println();
//		System.out.println(">>> main end <<<");
		
		// case03.
//		try {
//			demo.first(0);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(">>> main end <<<");
		
		// case04.
//		boolean flag = demo.outputFile();
//		String msg = (flag == true) ? "저장성공" : "저장실패" ;
//		System.out.println(msg);
	
		// case05.
//		boolean flag = demo.outputObjFile();
//		String msg = (flag == true) ? "저장성공" : "저장실패" ;
//		System.out.println(msg);
		
		//demo.outputSerializable();
		demo.inputserializable();
	}

}
