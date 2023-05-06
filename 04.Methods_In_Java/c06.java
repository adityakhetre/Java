//return values

class Demo{

	int fun(int x){					//return value and method name is compalsory, argument is optional

		System.out.println("in fun");

		x= x*100;

		return x;
	}
	public static void main(String[] args){

		Demo obj= new Demo();
		
		System.out.println(obj.fun(5));		//if fun gives return then it call from sop is valid otherwise invalid

		int x= obj.fun(29);			//store return value in same datatype 

		System.out.println(x);
	}
}
