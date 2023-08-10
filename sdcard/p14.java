
class OverException extends RuntimeException{

	OverException(String str){

                super(str);
        }

}

class UnderException extends RuntimeException{

	UnderException(String str){

		super(str);
	}

}



class Emp{

	public int salary= 0;

	Emp(int salary){

		this.salary = salary;
	}

	public static void compDemo(Emp[] arr){

		for(int i=0;i<arr.length;i++){

			try{

				if(arr[i].salary <10000)
					throw new UnderException("less salary");
			}
			catch(UnderException e){

				e.printStackTrace();
			}
			try{

                                if(arr[i].salary >50000)
                                        throw new OverException("more salary");
                        }
                        catch(OverException e){

                                e.printStackTrace();
                        }
		}
	}

}



class client{


	public static void main(String[] args){

		Emp[] arr= new Emp[4];

		arr[0]= new Emp(1000);
		arr[1]= new Emp(5000000);
		arr[2]= new Emp(8000);
		arr[3]= new Emp(6000000);

		Emp.compDemo(arr);

	}
}




