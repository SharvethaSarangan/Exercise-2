package Quiz;

	import java.util.Scanner; 

public class Bankaccount {
	
	String username;
	String accountnumber;
	String address;
	
	Scanner d = new Scanner(System.in);
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber ; 
		
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public String getUsername() {
		return this.username ;
	}
	
	public String getAccountnumber() {
		return this.accountnumber;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	
	public void deposit () {
		System.out.println("Please enter the amount of deposit : ");
		int deposit = d.nextInt();
		System.out.println("Your deposit amount is : " + deposit);
		
	}
	

	public void withdrawalamount() {
		System.out.println("Please enter your withdrawal amount : ");
		int withdrawal = d.nextInt();
		System.out.println("Your withdrawal amount is : " + withdrawal);
		
	}

		
	}

