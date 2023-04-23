//write a program to implement if else ladder (real time example)

class Demo{
	
	public static void main(String[] args){

		int salary=1000000;

		if(10000<salary && salary<100001)
		{
			System.out.println("buy 1bhk flat");
		}
		else if(100000<salary && salary<500001)
                {
                        System.out.println("buy 2bhk flat");
                }
		else if(500000<salary && salary<1000001)
                {
                        System.out.println("buy 3bhk flat");
                }
		else if(salary>1000000)
                {
                        System.out.println("buy house");
                }
		else
                {
                        System.out.println("don't buy");
                }
	}
}
