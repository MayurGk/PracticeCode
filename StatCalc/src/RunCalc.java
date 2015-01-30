
public class RunCalc {

	
	public static void main(String[] args)
	{
		StatCalc calc = new StatCalc();
		System.out.println("Enter value:");
		int i = Integer.parseInt(System.console().readLine());
		while(i!=0)
		{
			i = Integer.parseInt(System.console().readLine());
			calc.enterItem(i);
		}
		
		System.out.println("Count:  "+ calc.getCount());
		System.out.println("Mean: " + calc.getMean());
		System.out.println("Min: " + calc.getMin());
		System.out.println("Max: " + calc.getMax());
		
		
		
	}
}
