package ch16;

import java.util.Scanner;

public class SwitchCaseTest {

	public static void main(String[] args) {

		System.out.println("���� �Է����ּ���.");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		int day = switch(month) {
		
			case 1, 3, 5, 7, 8, 10, 12 ->
				31;
			case 2->
				28;
			case 4,6,9,11->
				30;
			default->{
				System.out.println("�������� �ʴ� ���Դϴ�.");
				yield -1;//yield�� ��ȯ��;
			}
		};
		
		System.out.println(month + "���� " + day + "�� �Դϴ�.");
	}

}