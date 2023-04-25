//Write a program to check whether the number is a Palindrome number or not. (2332)
//Output: 2332 is a palindrome number

class Demo{

        public static void main(String[] args){

                int x= 2332,y=x;

                int rev=0;

                while(x!=0)
                {
                        int digit= x%10;

                        rev= rev*10+digit;

                        x=x/10;
                }
		if(rev==y)
		{	
                	System.out.println(rev+" is a palindrome number");
		}
		else
		{
			System.out.println(rev+" is not a palindrome number");
		}
        }
}
