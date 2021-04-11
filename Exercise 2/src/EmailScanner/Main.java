package EmailScanner;

public class Main {

	public static void main(String[] args) {
	   Email gmail = new Email();
	   gmail.enteremail();
	   gmail.Caldeliverabilityrate();
	   gmail.Calbouncerate();
	   gmail.Openrate();
	   gmail.Unsubscriberate();

	}

}
