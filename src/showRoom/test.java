package showRoom;

import java.util.Scanner;
import java.sql.*;

public class test {

	public static void main(String[] args) 
	{	
		checkOut co = new printCheckout();
		
		cars c = new cars();
		cars b = new bikes();
		
		Scanner sc = new Scanner(System.in);
		int n=0;
		int a=0;
		do {
		System.out.print("\t\t\t\t\t\t\t\t\tWelcome to My ShowRoom"
				+ "\n\n"
				+ "Press 1 to See Vehicle List with Price"
				+ "\nPress 2 to Purchase a Vehicle"
				+ "\nPress 0 to exit\n");
		n=sc.nextInt();
		switch(n)
		{
			case 1:
			{
				
				do 
				{
					System.out.print("\n\t\t\t\t\t\t\t\t\tSee Price List"
							+ "\n\n"
							+ "Press 1 to See Cars Price List"
							+ "\nPress 2 to See Bikes Price"
							+ "\nPress 0 to Go Back to Menu\n");
					a=sc.nextInt();
					switch(a)
					{
						case 1:
						{
							c.print();
							break;
						}
						case 2:
						{
							b.print();
							break;
						}
						case 0:{
							break;
						}
					}
				}while(a!=0);
			}
			case 2:
			{
				System.out.print("\t\t\t\t\t\t\t\t\tWelcome to My ShowRoom"
						+ "\n\n");
				System.out.println("Enter your Name:");
				String name = sc.next();
				System.out.println("\nEnter your CNIC:");
				String cnic = sc.next();
				System.out.println("\nEnter your Address:");
				String address = sc.next();
				System.out.println("\nEnter your Phone Number:");
				String phoneNumber = sc.next();
				System.out.println("\nEnter your Email:");
				String email = sc.next();
				user u = new user(name, cnic, address, phoneNumber, email);
				System.out.print("\nPress 1 to Buy a Car"+
				"\nPress 2 to Buy a bike"
				+"\nPress 0 to Go back to change choice\n");
				int ch = sc.nextInt();
				String product = " ";
				String price = " ";
				switch(ch)
				{
					case 1:
					{
						System.out.println("\n");
						for (int i = 0; i<c.cars.size(); i++) { 		      
							System.out.println("Press "+i+" to buy "+c.cars.get(i)+" which has price of "+c.price.get(i)+"/-PKR"); 		
						}
						int selection = sc.nextInt();
						product = c.cars.get(selection);
						price = c.price.get(selection);
						break;
					}
					case 2:
					{
						System.out.println("\n");
						bikes cd = new bikes();
						for (int i = 0; i<c.cars.size(); i++) { 		      
							System.out.println("Press "+i+" to buy "+cd.bikes.get(i)+" which has price of "+cd.price1.get(i)+"/-PKR"); 		
						}
						int selection = sc.nextInt();
						product = c.cars.get(selection);
						price = c.price.get(selection);
						break;
					}
					case 0:
					{
						break;
					}
					default:
					{
						System.out.println("Wrong input");
						continue;
					}
				}
				co.showOrder(u.getName(), u.getCnic(), u.getAddress(), u.getPhoneNumber(), u.getEmail(), product, price);
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/showroom","root","syed");
					PreparedStatement ps = con.prepareStatement("INSERT INTO `showroom`.`customer` (`Name`, `CNIC`, `Address`, `Phone Number`, `Email`, `Product`, `Price`) VALUES (?,?,?,?,?,?,?);");
					ps.setString(1, u.getName());
					ps.setString(2, u.getCnic());
					ps.setString(3, u.getAddress());
					ps.setString(4, u.getPhoneNumber());
					ps.setString(5, u.getEmail());
					ps.setString(6, product);
					ps.setString(7, price);
					int x = ps.executeUpdate();
					if(x>0)
					{
						System.out.println("\nYou're being redirected to our Menu Page.");
					}
					else
					{
						System.out.println("Insertion Failed");
					}
				}
				catch(Exception e1)
					{
						System.out.print(e1);
					}
			}
			case 0:
			{
				break;
			}
		}
		}while(n!=0);
		System.out.print("Thankyou for visiting our system!");
	}
}
