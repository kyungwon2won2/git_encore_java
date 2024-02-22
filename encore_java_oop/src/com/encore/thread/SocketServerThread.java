package com.encore.thread;

import java.io.BufferedReader;
import java.net.Socket;

public class SocketServerThread implements Runnable{
	
	private BufferedReader reader;
	private Socket socket;
	
	public SocketServerThread() {
		
	}
	
	public SocketServerThread(BufferedReader reader, Socket socket) {
		this.reader = reader;
		this.socket = socket;
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				String msg = reader.readLine();
				System.out.println(msg);
				System.out.println("from "+ socket.getRemoteSocketAddress()+">> "+msg);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
