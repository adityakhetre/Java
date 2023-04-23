//write a program to print whether given number is 0 to 5 then print its spelling if greater than 5 print the number is greater than 5

class Demo{

	public static void main(String[] args){
		
		int num=4;

		if(num==0)
		{
			System.out.println("zero");
		}
		else if(num==1)
                {
                        System.out.println("one");
                }
		else if(num==2)
                {
                        System.out.println("two");
                }
		else if(num==3)
                {
                        System.out.println("three");
                }
		else if(num==4)
                {
                        System.out.println("four");
                }
		else if(num==5)
                {
                        System.out.println("five");
		}
		else if(num>5)
                {
                        System.out.println(num+" is greater than 5");
                }
		else
		{
			System.out.println("invalid input");
		}
	}
}



