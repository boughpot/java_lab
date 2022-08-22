package ch15;

public class Taxi {

	int taxiNumber;
	String taxiName;
	int passengerCount;
	int money;
	
	public Taxi(int taxiNumber, String taxiName) {
		this.taxiNumber = taxiNumber;
		this.taxiName = taxiName;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showTaxiInfo() {
		System.out.println(taxiNumber + "번 " + taxiName + "택시의 승객 수는 " 
	+ passengerCount + "명이고, 수입은 " + money + "원 입니다.");
	}
}
