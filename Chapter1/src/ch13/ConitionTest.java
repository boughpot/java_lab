package ch13;

import java.util.Scanner;
//import는 스캐너가 이 라이브러리에 있는 놈이다 라고 알려줌

public class ConitionTest {
	public static void main(String[] args) {
	
	int max;
	System.out.println("두 수를 입력 받아서 더 큰 수를 출력하세요.\n");
	Scanner scanner = new Scanner(System.in);
	System.out.println("입력 1:");
	int num1 = scanner.nextInt();
	System.out.println("입력 2:");
	int num2 = scanner.nextInt();
	
	max = (num1 > num2)? num1 : num2;
	System.out.println(max);
	}
	
}
