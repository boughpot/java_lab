package ch15;

public class Test {

	public static void main(String[] args) {

		Student studentH = new Student("Hannah", 25000);
		Student studentJ = new Student("James", 40000);
		Student studentG = new Student("Gram", 30000);
		Taxi taxiK = new Taxi(203, "īī��");
		Taxi taxiR = new Taxi(474, "����");
		Taxi taxiKa = new Taxi(603, "īī��");
		
		studentH.takeTaxi(taxiK);
		studentJ.takeTaxi(taxiR);
		studentG.takeTaxi(taxiR);
		
		studentH.showStudentInfo();
		studentJ.showStudentInfo();
		studentG.showStudentInfo();
		taxiK.showTaxiInfo();
		taxiR.showTaxiInfo();
		taxiKa.showTaxiInfo();
	}

}