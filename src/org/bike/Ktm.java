package org.bike;

public class Ktm implements Bike{

	@Override
	public void cost() {
		// TODO Auto-generated method stub
		System.out.println("KTM Bike Cost 1,00,000");
	}

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		System.out.println("KTM Bike Speed 220cc");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ktm ktm = new Ktm();
		ktm.cost();
		ktm.speed();
	}

}
