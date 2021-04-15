package Quiz;

public class Main {

	public static void main(String[] args) {
		Bankaccount cimb= new Bankaccount();
		
		cimb.setUsername("SHARVETHA");
		cimb.setAccountnumber("9864579");
		cimb.setAddress("JOHOR BAHRU");
		
		System.out.println("Name : " + cimb.getUsername());
		System.out.println("Account number : " + cimb.getAccountnumber());
		System.out.println("Address : " + cimb.getAddress());
		
		cimb.deposit();
		cimb.withdrawalamount();
		


	}

}
