//Write a program to check whether the number is a Palindrome number or not. (2332)
//Output: 2332 is a palindrome number

class Demo{

        public static void main(String[] args){

                int x= 2332;

                int rev=0;

                for(int i=x;i!=0;i=i/10)
                {
                        int digit= i%10;

                        rev= rev*10+digit;
                }
                if(rev==x)
                {
                        System.out.println(rev+" is a palindrome number");
                }
                else
                {
                        System.out.println(rev+" is not a palindrome number");
                }
        }
}
