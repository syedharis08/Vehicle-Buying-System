package showRoom;

import java.util.ArrayList;

public class cars 
{
	ArrayList<String> cars = new ArrayList<String>()
	{
		{
			add("Mehran");
			add("Fx");
			add("Khyber");
			add("Cultus");
			add("Alto");
			
		}
	};
	
	ArrayList<String> price = new ArrayList<String>()
	{
		{
			add("8,00,000");
			add("4,00,000");
			add("2,00,000");
			add("22,00,000");
			add("15,00,000");
		}
	};	
	
	void print()
	{
		for(int i = 0; i < cars.size() && i < price.size(); i++)
		    System.out.println(cars.get(i) + ", " + price.get(i));
	}
}