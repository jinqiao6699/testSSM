package test;

public class TestThread extends Thread {

	private String name;

	public TestThread(String name) {
		this.name = name;
	}
	
	private static int num = 5;
	
	@Override
	public void run() {
		while(true) {
			num--;
			System.out.println(name+":"+num);
			
			if(num==0){
				break;
			}
		}
//		try {
//			Thread.sleep(5000);
//			System.out.println("qiaoqiao");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
