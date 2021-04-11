package EmailScanner;

import java.util.Scanner;

public class Email {
	
	Scanner b = new Scanner(System.in);
	
	void enteremail() {
		System.out.println("Please enter your email address : ");
		String r = b.nextLine();
		System.out.println("Please enter your name : ");
		String n = b.nextLine();
		System.out.println("Hi and Welcome" 
		                  + "\n" + r 
		                  + "," + n 
		                  + "\nLet's calculate your email metrics " );
	}

	  void Caldeliverabilityrate ()  {
		  System.out.print("\nEnter the number of delivered emails : ");
		  int de= b.nextInt();
		  System.out.print("Enter the number of totalsent emails : ");
		  int ts = b.nextInt();
		  double dr = (de/ts)*100 ;
		  System.out.print("The deliverability rate is " + dr);
	}
	  
	  void Calbouncerate () {
		  System.out.print("Enter the number of bounced emails : ");
		  int be = b.nextInt();
		  System.out.print("Enter the number of sent emails : ");
		  int se = b.nextInt();
		  double br = (be/se)*100 ; 
		  System.out.print("The bounce rate is " + br );
		  
	  }
	  
	  void Openrate () {
		  System.out.print("State the number of opened emails : ");
		  int oe = b.nextInt();
		  System.out.print("State the number of sent emails : "  );
		  int se = b.nextInt();
		  System.out.print("Enter the number of bounced emails : ");
		  int be = b.nextInt();
		  double or = (oe/(se-be))*100 ;
		  System.out.print("The open rate is " + or );
	  }

	  
	  void Unsubscriberate () {
		  System.out.print("State the number total number of unsubscribes : ");
		  int u = b.nextInt();
		  System.out.print("Enter the number of delivered emails : ");
		  int de= b.nextInt();
		  double us = (u/de)*100 ;
		  System.out.print("The open rate is " + us);  
	  }

}
