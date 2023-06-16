package dailyStudy.day0616.our0613.Q1;

public class ChangeMoney extends Exchange {
	ChangeMoney(double ratio) {
		this.ratio = ratio;
	}

	protected double Exchange(double kmoney) {
		return kmoney / ratio;
	}

	@Override
	protected String getKMoneyString() {
		return "원";
	}

	@Override
	protected String getUMoneyString() {
		return "달러";
	}

	public static void main(String[] args) {
		ChangeMoney wTod = new ChangeMoney(1200); // 1달러는 1200원
		wTod.run();
	}
}
