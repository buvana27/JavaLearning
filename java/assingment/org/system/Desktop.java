package org.system;

public class Desktop extends Computer {
	
	public void desktopSize() {
		System.out.println("The desktopsize is");
	}
	
	public static void main(String[] args) {
		Desktop dp=new Desktop();
		dp.desktopSize();
		dp.computerModel();
		
	}

}
