
class NewDemo{

	public static void main(String[] args){

		Demo obj = new Demo();			//object of class in another file in same folder

		System.out.println(obj.x);

		//System.out.println(obj.y);		//error accessing private variable in another class

		System.out.println(obj.z);

		System.out.println(obj.a);
	}
}
