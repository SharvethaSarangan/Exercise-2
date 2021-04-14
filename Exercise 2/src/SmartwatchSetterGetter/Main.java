package SmartwatchSetterGetter;

public class Main {

	public static void main(String[] args) {
		Smartwatch Samsung = new Smartwatch();
		
		Samsung.setName("Samsung Gear Sport");
		Samsung.setColour("Blue");
		Samsung.setUSB('N');
		Samsung.setstorage(768);
		Samsung.setScreensize(1.2);
		
		System.out.println("Name : " + Samsung.getName());
		System.out.println("Colour : " + Samsung.getColour());
		System.out.println("USB Availability : " + Samsung.getUSB());
		System.out.println("Storage : " + Samsung.getstorage() + "mb");
		System.out.println("Screen Size: " + Samsung.getScreensize()+ "inch");
		
		Samsung.Notificationmessage();
		Samsung.Welcomemessage();
		Samsung.CalBMI();
		Samsung.Calcalorie();
		
		
		
		
		
		
				
				

	}

}
