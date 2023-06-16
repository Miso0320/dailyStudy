package dailyStudy.day0616.our0613.Q1;

import java.util.Scanner;

abstract class Exchange {
	abstract protected double Exchange(double kmoney);

	abstract protected String getKMoneyString();

	abstract protected String getUMoneyString();

	protected double ratio; // 비율

	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("환전할 금액을 " + getKMoneyString() + "으로 입력하세요.");
		double don = sc.nextDouble();
		double result = Exchange(don);
		System.out.println("환전 결과 : " + result + getUMoneyString() + "입니다!");
		sc.close();
	}
}
