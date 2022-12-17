package com.VirtualKey;

public class MenuOptions {
public static void printWelcomeScreen(String appName, String developerName) {
		
		String companyDetails = String.format("\n" + "Welcome to %s.com.\n " 
		+ "This application was developed by %s.\n",appName,developerName);
		
		String appFunction = "You can use this application to :-\n"
				+ " .List files in directory \n"
				+ " .Add, Delete or Search folder. \n";
		System.out.println(companyDetails);

		System.out.println(appFunction);
}
public static void displayMenu() {
    String menu = "\n Select any option number from below and press Enter \n"
            + "1) List files in directory \n" 
    		+ "2) Display menu for File operations\n"
            + "3) Exit program\n";
    System.out.println(menu);
}
public static void displayFileMenuOptions() {
	String fileMenu = "\n\n****** Select any option number from below and press Enter ******\n\n"
			+ "1) Add a file to \"main\" folder\n" + "2) Delete a file from \"main\" folder\n"
			+ "3) Search for a file from \"main\" folder\n" + "4) Show Previous Menu\n"
+ "5) Exit program\n";

	System.out.println(fileMenu);
}


}
