package test;

import java.util.Queue;

public class Test02 {
	public static void main(String[] args) {
//		Runnable a = new Runnable() {
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				System.out.println("jinqiao");
//			}
//		};
//		Thread aa = new Thread(a);
//		aa.start();
		Thread th1 = new TestThread("A");
		TestThread th2 = new TestThread("B");
		th1.start();
		th2.start();
//		System.out.println(new Test02().qiao("success"));
		
		Runnable th3 = new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		};
		
	}
	
	public String qiao(String msg){
		Thread th1 = new TestThread("A");
		th1.start();
		return msg;
	}
	
}
