//Write a program to reverse the given number.
//Input: 942111423
//Output: 324111249

class Demo{

        public static void main(String[] args){

                int x= 942111423;

                int rev=0;

		for(int i=x;i!=0;i=i/10)
		{
			int digit= i%10;

                        rev= rev*10+digit;
		}
		System.out.println(rev);
	}
}
