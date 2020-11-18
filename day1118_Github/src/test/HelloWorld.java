package test;

import org.junit.Test;

public class HelloWorld {
	public static void main(String[] args) {
		//打印一个helloworld!!!
		System.out.println("hello world!!!");
	}
	
	/**
	 * sayhi的方法
	 */
	public void sayhi(){
		System.out.println("sayhi的方法....!");
		System.out.println("aaabbbccc");
	}

	/**
	 * 这是个单元测试
	 */
	@Test
	public void fun1(){
		System.out.println("8889999");
	}
	
	public void fun1(){
		System.out.println("库中修改");
	}	
		
}
