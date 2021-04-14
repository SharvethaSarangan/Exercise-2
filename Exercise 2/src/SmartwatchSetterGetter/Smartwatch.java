package SmartwatchSetterGetter;

import java.util.Scanner;

public class Smartwatch {
	
	String name; 
	String colour;
	char USB;
	int storage;
	double screensize;
	
	Scanner c = new Scanner(System.in);
	
	//create Setter Method
	public void setName(String name) {
		this.name = name;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public void setUSB(char USB) {
		this.USB = USB;
	}
	
	public void setstorage (int storage) {
		this.storage = storage ; 
	}
	
	public void setScreensize (double screensize) {
		this.screensize = screensize ;
				
	}
	
	// Create Getter Method
	public String getName() {
		return this.name;
	}
	
	public String getColour() {
		return this.colour;
	}

	public char getUSB() {
		return this.USB;
	}
	
	public Integer getstorage() {
		return this.storage;
	}
	
	public double getScreensize() {
		return this.screensize;
	}
	
	// create method
	
	public void Notificationmessage () {
		System.out.print("\n----------You got a new notification----------");
	}
	
	
	public void Welcomemessage () {
		System.out.print("\n\nEnter your name : " );
		String n = c.nextLine();
		System.out.print("\nHi " + n +" Welcome! Let's explore Samsung Gear Sport ");
		
	}
	
	public void CalBMI ( ) {
		System.out.print("\n\nEnter your height in m^2 : " );
		double h = c.nextDouble();
		System.out.print("\nEnter your weight : ");
		double w = c.nextDouble();
		double BMI = (w/(h*h));
		System.out.print("\nYour BMI is : " + BMI);
		}
	
	public void Calcalorie() {
		System.out.print("\nState your gender : "
				        +"\n 1 - WOMEN  "
				        +"\n 2 - MEN" 
				        +"\n   ");
		int g = c.nextInt();
		System.out.print("\nHow many calories did you take for breakfast ? : ");
		double b = c.nextDouble();
		System.out.print("\nHow many calories did you take for lunch and teatime ? : ");
		double l = c.nextDouble();
		System.out.print("\nHow many calories did you take for dinner ? : ");
		double d = c.nextDouble();
		
		double totalcalories = b+l+d ;
		System.out.print("\nTotal Calories Intake of the day is : " + totalcalories + "Kcal");
		
		if(totalcalories == 2000 && g == 1) {
		System.out.print("Normal calorie intake"); }
		
		if(totalcalories == 2500 && g == 2 ) {
		System.out.print("\nNormal calorie intake"); }
		}
	}
		
		