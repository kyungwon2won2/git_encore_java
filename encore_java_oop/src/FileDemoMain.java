import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDemoMain {

	public static void main(String[] args) {
		FileReader reader = null ;
		try {
			//reader = new FileReader("C:\\Users\\Yeo\\git\\git_encore_java\\encore_java_oop\\src\\textReader.txt");
			//System.out.println(reader.read());
//			int data = 0;
//			while((data = reader.read()) != -1) {
//				System.out.print((char)data);
//			}
			System.out.println();
			// File 객체
			File file = new File("C:\\Users\\Yeo\\git\\git_encore_java\\encore_java_oop\\src\\textReader.txt");
			
			reader = new FileReader(file);
			
			char[] charAry = new char[(int)file.length()];
			reader.read(charAry);
			
			for(int idx=0; idx<charAry.length; idx++) {
				System.out.print(charAry[idx]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
