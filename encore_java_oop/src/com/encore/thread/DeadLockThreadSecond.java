package com.encore.thread;

public class DeadLockThreadSecond implements Runnable{
	
	private StringBuffer sb01, sb02;
	
	public DeadLockThreadSecond() {
		
	}
	
	public DeadLockThreadSecond(StringBuffer sb01, StringBuffer sb02) {
		this.sb01 = sb01;
		this.sb02 = sb02;
	}
	
	@Override
	public void run() {
		
		synchronized (sb01) {
			sb01.append("encore");		
		}
		
		try {
			Thread.sleep(1000);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		synchronized (sb02) {
			sb02.append("hanwha");		
			System.out.println("second thread >>> "+sb01.toString() + sb02.toString());
		}
	}
}
