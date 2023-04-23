//write a program to calculate profit or loss

class Demo{

	public static void main(String[] args){

		int cost=1000;
		int sell=1200;

		int profit= sell-cost;
		int loss= cost-sell;

		if(profit>0)
		{
			System.out.println("profit of rs: "+profit);
		}
		else if(loss>0)
		{
			System.out.println("loss of rs: "+loss);
		}
		else
		{
			System.out.println("no profit no loss");
		}
	}
}
