//print factorial of n

class Demo{

	public static void main(String[] args){
        
		System.out.println("print factorial of n");

		int n= 7,mult= 1;

		for(int i=1;i<=n;i++){

			mult= mult*i;
		}
                        
		System.out.println("factorial of "+n+" is "+mult);
	}
}
