package dailyStudy.day0612.our0612.q3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 사용자에게 두 정수와 연산자 입력받기
		System.out.print("두 정수와 연산자를 입력하세요: ");
		String value = sc.nextLine();

		// 입력받은 값을 띄어쓰기를 구분자로 각각의 값에 대입
		String[] arr = value.split(" ");
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		String symbol = arr[2];

		// 연산자 종류에 따른 객체 생성
		if (symbol.equals("+")) {
			Add add = new Add();
			add.setValue(a, b);
			System.out.println(add.calculate());
		} else if (symbol.equals("-")) {
			Sub sub = new Sub();
			sub.setValue(a, b);
			System.out.println(sub.calculate());

		} else if (symbol.equals("*")) {
			Mul mul = new Mul();
			mul.setValue(a, b);
			System.out.println(mul.calculate());
		} else {
			Div div = new Div();
			div.setValue(a, b);
			System.out.println(div.calculate());
		}
	}
}
