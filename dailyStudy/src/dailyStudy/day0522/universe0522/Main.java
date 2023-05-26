package dailyStudy.day0522.universe0522;

public class Main {
	public static void main(String[] args) {
		System.out.println();
		// 토마토파스타 가격 : 8000, 크림파스타 가격 : 9000, 로제파스타 가격:10000
		Pasta pasta1 = new Pasta("오우주", PastaOption.TOMATO);

		pasta1.addNoodle();
		pasta1.addNoodle();
		pasta1.addGarlic();
		pasta1.addGarlic();
		pasta1.orderInfo();
		System.out.println();

		Pasta pasta2 = new Pasta("유승주", PastaOption.CREAM);

		pasta2.addNoodle();
		pasta2.orderInfo();
		System.out.println();

		Pasta pasta3 = new Pasta("성유진", PastaOption.ROSE);

		pasta3.addGarlic();
		pasta3.orderInfo();
	}
}
