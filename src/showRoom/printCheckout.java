package showRoom;

public class printCheckout implements checkOut{

	@Override
	public void showOrder(String name, String CNIC, String Address, String phoneNumber, String email, String product, String price) 
	{
		System.out.print("\n\t\t\t\t\t\t\t\t\tINVOICE!!"
				+ "\n\n"
				+ "Name: "+name
				+ "\nCNIC: "+CNIC
				+ "\nAddress :"+Address
				+ "\nPhone Number: "+phoneNumber
				+"\nEmail: "+email
				+"\nYou bought: "+product
				+"\nof Price: "+price);
	}

}
