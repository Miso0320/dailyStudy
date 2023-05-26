package dailyStudy.day0522.universe0522;

public class Pasta {
	private String guest;
	private PastaOption option;
	private int price;
	private boolean isNoodleAdd;
	private boolean isGarlicAdd;

	public Pasta(String guest, PastaOption option) {
		super();
		this.guest = guest;
		this.option = option;
		System.out.println("주문자 : " + guest);
		if (option.equals(PastaOption.TOMATO)) {
			price = 8000;
		} else if (option.equals(PastaOption.CREAM)) {
			price = 9000;
		} else if (option.equals(PastaOption.ROSE)) {
			price = 10000;
		}
	}

	public void addNoodle() {
		if (!isNoodleAdd) {
			System.out.println("면이 추가되었습니다.(+1000원)");
			price += 1000;
			isNoodleAdd = true;
		}
	}

	public void addGarlic() {
		if (!isGarlicAdd) {
			System.out.println("마늘이 추가되었습니다.(+2000원)");
			price += 2000;
			isGarlicAdd = true;
		}
	}

	public void orderInfo() {
		System.out.println("파스타 가격 : " + price);

	}
}
