package myStore;

public class Thread {

	public Thread(MyThread t) {
		t.run();
	}

	public static void main(String[] args) throws InterruptedException {
		MyThread t = new MyThread();
		Thread obj = new Thread(t);
		obj.start();
		//t.run();
		
		obj.join();
		for (int i =0;i<10;i++)
		{
			System.out.println("main thread");
		}
	}

	private void join() {}
	private void start() {}

}


class MyThread implements Runnable
{
	public void run()
	{
		for (int i =0;i<10;i++)
	{
		System.out.println("child thread");
		
	}}}
