package dailyStudy.day0522.universe0517;

public class Pasta {

	private String guest;
	private int price;

	public Pasta(String guest) {
		super();
		this.guest = guest;
		this.price = 8000;
	}

	public void orderInfo() {
		System.out.println("주문자 : " + guest);
		System.out.println("기본 파스타 가격 : " + price);

	}

	public void addNoodle() {
		price += 1000;
		System.out.println("면이 추가 되었습니다.(+1000원)");

	}

	public void addGarlic() {
		price += 2000;
		System.out.println("마늘이 추가 되었습니다.(+2000원)");
	}

}