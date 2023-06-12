package dailyStudy.day0612.our0612;

import java.util.Scanner;

//문제 1
//배열과 반복문을 이용하여 사용자에게 돈의 액수를 입력 받아
//오만원권, 만원권, 천원권, 500 원짜리 동전, 100 원짜리 동전, 50 원짜리 동전, 10 원짜리 동전, 1 원짜리 동전이
//각 몇 개로 변환되는지 출력하세요. ( Hint. 금액권의 종류를 배열로 저장하세요 )
public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 금액권의 종류를 배열의 값으로 선언
		int[] arr = { 50000, 10000, 1000, 500, 50, 10, 1 };

		// 사용자에게 돈의 액수를 입력받기
		System.out.print("금액을 입력하세요 >> ");
		int money = Integer.parseInt(sc.nextLine());
		// 입력받은 금액과 금액권을 연산할 변수 선언
		int result;

		for (int i = 0; i < arr.length; i++) {
			result = money / arr[i];
			System.out.println(arr[i] + "원 짜리 : " + result + "개");
			// 빠진 금액 만큼 money에서 차감
			money = money - result * arr[i];
		}
	}
}
