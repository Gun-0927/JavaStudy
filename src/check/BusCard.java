package check;

import java.util.Scanner;

public class BusCard {
	/*
	 성인: 만 18세 이상
	 청소년: 만 13세 이상
	 어린이: 만 6세 이상
	 유아: 만 5세 이하
	 */
	public static String getRole(int age) {
		String role = "";
		if(age<=5) {
			role = "유아";
		}
		else if(age<13)
		{
			role = "어린이";
		}
		else if(age<18) {
			role = "청소년";
		}
		else {
			role = "성인";
		}
		
		return role;
		
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("나이 입력: ");
		int age = input.nextInt();
		String role = getRole(age);
		System.out.println(role);
		input.close();

	}

}
