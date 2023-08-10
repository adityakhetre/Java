
class Demo implements Runnable{

	public void run(){

		System.out.println(Thread.currentThread().getPriority());

		for(int i=0;i<5;i++){
		
			System.out.println(Thread.currentThread().getName());
		}
	}


	public static void main(String[] args){

		Demo obj = new Demo();

		Thread o  = new Thread(obj);

		o.start();

		System.out.println(Thread.currentThread().getName());

		obj.run();
	}
}

		
