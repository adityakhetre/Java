//print count of factors

class Demo{

	public static void main(String[] args){

		//print count of factors
                        
		System.out.println("print count of factors");
                        
		int n= 6,c= 0;
                
		for(int i=1;i<=n;i++){

                	if(n%i==0)
                        	c++;
              	}
		System.out.println("count of factors "+c);
	}
}
