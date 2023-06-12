package dailyStudy.day0612.our0612;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 사용자에게 정수의 개수를 입력 받기
		System.out.print("생성할 정수의 개수를 입력하세요: ");
		int size = Integer.parseInt(sc.nextLine());

		// 사용자에게 입력받은 정수 크기만큼의 배열 생성
		int[] arr = new int[size];
		// 전체 합계를 저장할 변수 선언
		int sum = 0;

		System.out.print("생성된 정수들 : ");
		for (int i = 0; i < arr.length; i++) {
			// 배열에 들어갈 랜덤값 생성
			arr[i] = (int) (Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");
			// 랜덤으로 들어간 값의 합계
			sum += arr[i];
		}
		System.out.println();

		double avg = (double) sum / arr.length;
		System.out.println("평균: " + avg);
	}
}
