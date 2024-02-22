import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

import com.encore.thread.SocketServerThread;

public class SocketServerMain {

	public static void main(String[] args) {
		ServerSocket   	server = null;
		Socket 			socket = null;
		BufferedReader 	reader = null;
		try {
			server = new ServerSocket(7777);
			System.out.println("Server Socket Ready...");
			while(true) {
				server.accept();
				System.out.println(socket.getRemoteSocketAddress()+"에서 접속됨");
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				System.out.println(reader.readLine());
				
				new Thread (new SocketServerThread(reader, socket)).start();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
