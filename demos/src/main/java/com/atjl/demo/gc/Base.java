package com.atjl.demo.gc;

/**
 * Created by async on 2018/1/27.
 */
public class Base {
	
	public Object instance = null;
	private static final int _1MB = 1024 * 1024;
	/**
	 * 这个成员属性的唯一意义就是占点内存，以便能在GC日志中看清楚是否被回收过
	 */
	private byte[] bigSize = new byte[2 * _1MB];
	
	/**
	 *  XX:+PrintGCTimeStamps
	 */
	public static void testGC() {
		Base objA = new Base();
		Base objB = new Base();
		objA.instance = objB;
		objB.instance = objA;
		objA = null;
		objB = null;        //假设在这行发生GC，objA和objB是否能被回收？
		System.gc();
	}
	
	
	public static void main(String[] args) {
		testGC();
		
		
	}
	
}
