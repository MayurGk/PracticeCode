
public class StatCalc {

	static int[] DataItem = new int[10];
	static int cnt=0;
	static int Max=0;
	static int Min=9999;
	public void enterItem(int item)
	{
		
		DataItem[cnt] = item;
		cnt++;
		if(Max>item)
			Max=item;
		if(Min<item)
             Min=item;   
	}
	
	public int getCount()
	{
		return cnt;
	}
	
	public int getSum()
	{
		int sum=0;
		for(int i=0;i<cnt;i++)
			sum += DataItem[i];
        return sum;
	}
	
	public int getMean()
	{
		int tot = getSum();
		return tot/cnt;
	}
	public int getMax()
	{return Max;}
	
	public int getMin()
	{return Min;}
	
	
}
