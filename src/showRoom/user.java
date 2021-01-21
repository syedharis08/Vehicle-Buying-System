package showRoom;

public class user {
	private String name;
	private String cnic;
	private String address;
	private String phoneNumber;
	private String email;
	
	public user(String name, String cnic, String address, String phoneNumber, String email)
	{
		this.name = name;
		this.cnic = cnic;
		this.address= address;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	

	public String getName() {
		return name;
	}

	public String getCnic() {
		return cnic;
	}


	public String getAddress() {
		return address;
	}
	

	public String getPhoneNumber() {
		return phoneNumber;
	}

	
	public String getEmail() {
		return email;
	}

	
	void printData()
	{
		System.out.println("name:"+getName()+"/nphoneNumber:"+getPhoneNumber());
	}
}