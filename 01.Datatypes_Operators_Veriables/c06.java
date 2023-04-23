// bitwise operators (&,|,^,<<,>>,>>>)

class Demo{

	public static void main(String[] args){

		{

			int x=5;                        //binary form= 00000101
			int y=7;                        //binary form= 00000111

			System.out.println(x & y);      //perform and operation 00000101 i.e. 5
			System.out.println(x | y);      //perform or operation 00000111 i.e. 7

		}

		{
			int x=8;                        //binary form= 00001000
			int y=10;                       //binary form= 00001010

			System.out.println(x & y);      //perform and operation 00001000 i.e. 8
			System.out.println(x | y);      //perform or operation 00001010 i.e. 10
			System.out.println(x ^ y);      //perform xor operation 00000010 i.e. 2

		}

		{
			int x=8;                        //binary form= 00001000
			int y=10;                       //binary form= 00001010
			
			System.out.println(x<<2);       //shift left by 2 bits 00100000 i.e. 32 
			System.out.println(y>>2);	//shift right by 2 bits 00000010 i.e. 2
		}

		{
                        int x=132;                      //binary form= 10000010
                        int y=75;                       //binary form= 01001011

                        System.out.println(x>>5);       //shift left by 2 bits 00000100 i.e. 4
                        System.out.println(y<<2);       //shift right by 2 bits 0100101100 i.e. 300
                
		}

		{
                        int x=7;                        //binary form= 00000111
                        int y=-7;                       //binary form= 1...0000111

                        System.out.println(x>>2);       //shift left by 2 bits 00000001 i.e. 1
                        System.out.println(x>>>2);      //shift right by 2 bits 00000001 i.e. 1
                        System.out.println(y>>2);       //shift left by 2 bits without sign bit  i.e. -2
                        System.out.println(y>>>2);      //shift right by 2 bits with sign bit i.e. 1073741822
	       
		}

	}
}


