//anonnymous inner class

class Main {
	public static void main(String[] args) {
		
		Demo obj =new Demo(){
			
			Demo fun(){
				
				System.out.println("undefineDemo");
				
				return new Demo();
			}
		}.fun();
	}
}

class Demo{
	
	Demo fun( ){
		
		System.out.println("funDemo");
		
		return new Demo();
	}
}
