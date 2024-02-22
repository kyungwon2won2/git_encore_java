package com.encore.generics;

/*
 
 타입 - <T> : Type  ,  <E> : Element  ,  <K> : Key  ,  <V> : Value  ,  <N> : Number 
 
 */

//1.
//public class ClassName<T, K> {
//
//}


//2.
//public class ClassName<T>{
//	
//}

//3.
//public class ClassName<E>{
//	private E element;
//
//	public E getX() {
//		return element;
//	}
//
//	public void setX(E element) {
//		this.element = element;
//	}	
//}

//4.
public class ClassName<K, V>{
	private K key;
	private V value;

	public void setX(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
}
