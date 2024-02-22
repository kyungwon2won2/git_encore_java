package com.encore.compare;

import java.util.Comparator;

public class EncoreInteger implements Comparable<EncoreInteger> {

	private int data;
	
	public EncoreInteger() {
		
	}

	public EncoreInteger(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	

	@Override
	public int compareTo(EncoreInteger o) {
		// 이미 구현되어 있어서.. 그냥 빼기만 하면됨  -> 음수, 양수, 0 리턴
		return this.data - o.data;
	}
	
}
