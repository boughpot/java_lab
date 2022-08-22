package ch14;

public class Student {

	String name;
	int money;
	
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -= 10000;
	}
	
	public void showStudentInfo() {
		System.out.println(name + "���� ���� ���� " + money + "�� �Դϴ�.");
	}
}
