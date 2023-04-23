//write a program to print max of three numbers

class Demo{

	public static void main(String[] args){

		int a=4;
		int b=4;
		int c=3;

		if(a>b && a>c)
		{
			System.out.println(a+" is maximum number b/w "+a+","+b+" & "+c);
		}
		else if(b>a && b>c)
		{
			System.out.println(b+" is maximum number b/w "+a+","+b+" & "+c);
		}
		else if(c>a && c>b)
		{
			System.out.println(c+" is maximum number b/w "+a+","+b+" & "+c);
		}
		else if(a==b && a>c)
		{
			System.out.println(a+" & "+b+" is maximum & equal number b/w "+a+","+b+" & "+c);
		}
		else if(a==c && a>b)
                {
                        System.out.println(a+" & "+c+" is maximum & equal number b/w "+a+","+b+" & "+c);
                }
		else if(b==c && b>a)
                {
                        System.out.println(b+" & "+c+" is maximum & equal number b/w "+a+","+b+" & "+c);
                }
		else
		{
			System.out.println(a+","+b+" & "+c+" are equal");
		}
	}
}
