package com.VirtualKey;
public class MainRunner {


	public static void main(String[] args) {
		
		FileOperations.createMainFolderIfNotPresent("main");
		MenuOptions.printWelcomeScreen("VirtualKey","Sandeep Reddy");
		HandleOptions.handleWelcomeScreenInput();
	}
}

