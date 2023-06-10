


class Demo{



	Demo(Demo th){
		System.out.println("in constructor");
	}

	public static void main(String[] args){

		//Demo obj = new Demo(obj);		//error: variable obj might not have been initialized

		Demo obj1 = null;

		Demo obj2 = new Demo(obj1);
		}
}
