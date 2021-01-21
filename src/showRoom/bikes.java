package showRoom;

import java.util.ArrayList;

public class bikes extends cars
{
	ArrayList<String> bikes = new ArrayList<String>()
	{
		{
			add("Honda cd 70");
			add("Harley Davidson");
			add("Yamaha R1");
			add("Suzuki Hayabusa");
			add("Honda Prider");
			
		}
	};
	
	ArrayList<String> price1 = new ArrayList<String>()
	{
		{
			add("70,000");
			add("25,00,000");
			add("19,00,000");
			add("22,00,000");
			add("1,10,000");
		}
	};
	
	void print()
	{
		for(int i = 0; i < bikes.size() && i < price1.size(); i++)
		    System.out.println(bikes.get(i) + ", " + price1.get(i));
	}
}