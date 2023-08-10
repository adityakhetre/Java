
import java.util.concurrent.*;

class MThread implements Runnable{

	public void run(){

		System.out.println("start: "+ Thread.currentThread());

		try{
			Thread.sleep(1233);
		}
		catch(InterruptedException e){
		}
		System.out.println("end:"+ Thread.currentThread());
	}
}

class Demo{

	public static void main(String[] args){

		ThreadPoolExecutor tpe = (ThreadPoolExecutor)Executors.newCachedThreadPool();

		for(int i=0;i<15;i++){

			MThread obj = new MThread();

			tpe.execute(obj);
		}
		tpe.shutdown();
	}
}
