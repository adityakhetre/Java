//threadgroup


class MThread extends Thread{

	MThread(ThreadGroup tg,String str){

		super(tg,str);
	}
	
	public void run(){

		System.out.println(Thread.currentThread());
	}
}
class User{

	public static void main(String[] args){

		ThreadGroup tg = new ThreadGroup("core2web");

		MThread ob1 = new MThread(tg,"java");

		MThread ob2 = new MThread(tg,"java");

		MThread ob3 = new MThread(tg,"python");

		ThreadGroup tgc = new ThreadGroup(tg,"incubeter");

		MThread ob4 = new MThread(tgc,"c");

                MThread ob5 = new MThread(tgc,"java");

                MThread ob6 = new MThread(tgc,"python");

		ob1.start();

		ob2.start();

		ob3.start();

		ob4.start();

		ob5.start();

		ob6.start();
	}
}
