package dailyStudy.day0616.our0613.Q2;

public interface Stack {
	// 현재 스택에 저장된 개수 리턴
	int length();

	// 스택의 전체 저장 가능한 개수 리턴
	int capacity();

	// 스택에 저장된 문자열 리턴
	String pop();

	// 스택에 문자열 저장
	boolean push(String val);
}
