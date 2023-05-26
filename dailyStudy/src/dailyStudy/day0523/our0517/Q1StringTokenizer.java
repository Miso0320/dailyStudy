package dailyStudy.day0523.our0517;

import java.util.StringTokenizer;

public class Q1StringTokenizer {

	public static void main(String[] args) {
		String str = "I want to go home!";

		StringTokenizer st = new StringTokenizer(str, " ", false);
		// countTokens() : 남아있는 토큰의 수
		// nextToken() : 현재 토큰을 보여주고 다음 토큰으로 넘어감
		int tokenCnt = st.countTokens();

		for (int i = 0; i < tokenCnt; i++) {
			String result = st.nextToken();
			System.out.println(result);
		}
	}
}
