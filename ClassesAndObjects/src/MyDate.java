
public class MyDate { //the class MainClass will have access to this class if it's only in public not private

	public int year, month, day;
	
	public MyDate()
	
	{
		year = 2019;
		month = 0;
		day = 1;
	}

	public void setMonth(int monthIn)
	{
		if (monthIn >= 1 && monthIn <= 12)
		{
			month = monthIn;
		}
	}
		
		public int getMonth()
		{
			return month;
		}
	
	
	
}
