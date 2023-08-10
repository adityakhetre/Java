//object parameter can accept any type of argument because object class is the parent class of all datatypes and some classes


class Demo{

	void fun(Object ob){

		System.out.println("fun(Object)");
	}
}

class User{

	public static void main(String[] args){


		Demo obj = new Demo();

		obj.fun('a');

		obj.fun(10);

		obj.fun(10l);

		obj.fun(10.5f);

		obj.fun(10.5);

		obj.fun("adi");

		obj.fun(new StringBuffer("adi"));

		obj.fun(obj);

	}
}


