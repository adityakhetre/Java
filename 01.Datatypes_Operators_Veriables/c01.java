//datatypes 

class Demo{
	int g=10;                              //global variable access by creating object of class or static keyword

	public static void main(String[] args){

		int x=10;                      //datatype= integer size= 4byte
		long y=30;                     //datatype= long size= 8byte extension of integer
		float a=20.5f;                 //datatype= float size= 4byte
		double b=20.6;                 //datatype= double size= 8byte extension of float
		char c='A';                    //datatype= character size= 2byte
		byte d=54;                     //datatype= byte size= 1byte compresion of integer
		short e=50;		       //datatype= short size= 2byte compression of integer
                boolean o= x>y;                //datatype= boolean size= 1bit (prints true or false) 

		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(o);
	}
}
