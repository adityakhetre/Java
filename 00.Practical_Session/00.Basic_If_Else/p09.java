//write a program to check whether given numbers are pythagorean triplet or not

class Demo{

	public static void main(String[] args){

		int x=4;
		int y=3;
		int z=5;

		boolean p1=x*x==y*y+z*z;
		boolean p2=y*y==x*x+z*z;
		boolean p3=z*z==y*y+x*x;

		if(p1 || p2 || p3)
		{
			System.out.println("this is pythagorean triplet");
		}
		else
		{
                        System.out.println("this is pythagorean triplet");
                }
	}
}
