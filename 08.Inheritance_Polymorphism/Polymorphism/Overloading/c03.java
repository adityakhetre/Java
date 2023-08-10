//real time example overriding


class IPL{

	void matchInfo(String team1,String team2){				//matchInfo(String,String)

		System.out.println(team1+" vs "+team2);
	}

	void matchInfo(String team1,String team2,String venue){			//matchInfo(String,String,String)

                System.out.println(team1+" vs "+team2+" at "+venue);

        }
}

class User{

	public static void main(String[] args){

		IPL ipl2023 = new IPL();

		ipl2023.matchInfo("CSK","GT");					//call respective method signuature in referance ipl2023

		ipl2023.matchInfo("CSK","GT","NMSA");				//call respective method signuature in referance ipl2023
	}
}




