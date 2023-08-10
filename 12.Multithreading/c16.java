//threadpool

import java.util.concurrent.*;

class MThread implements Runnable{

	public void run(){

		System.out.println("start: "+ Thread.currentThread());

		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
		}
		System.out.println("end: "+ Thread.currentThread());
	}
}

class Demo{

	public static void main(String[] args){

		ExecutorService es = Executors.newFixedThreadPool(2);

		for(int i=0;i<10; i++){

			MThread obj = new MThread();

			es.execute(obj);
		}

		es.shutdown();
	}
}


