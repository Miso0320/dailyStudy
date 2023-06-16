package dailyStudy.day0616.our0613.Q2;

import java.util.Scanner;

public class StringStack implements Stack {
	private int top = 0;
	private String arr[];

	StringStack(int size) {
		arr = new String[size];
	}

	@Override
	public int length() {
		return top;
	}

	@Override
	public int capacity() {
		return arr.length;
	}

	@Override
	public String pop() {
		String val;
		if (top == 0) {
			val = "0";
		} else {
			top--;
			val = arr[top];
		}
		return val;
	}

	@Override
	public boolean push(String val) {
		if (top == arr.length) {
			return false;
		} else {
			arr[top] = val;
			top++;
			return true;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("스택의 총 저장 공간 크기를 입력하세요.");
		int size = sc.nextInt();
		StringStack st = new StringStack(size);
		while (true) {
			System.out.print("저장할 문자열을 입력하세요.");
			String val = sc.next();
			if (val.equals("끝")) {
				break;
			} else {
				boolean bool = st.push(val);
				if (bool == false) {
					System.out.println("스택에 공간이 없습니다.");
				}
			}
		}

		System.out.println("스택에 저장된 모든 문자열 출력 :");
		while (true) {
			String value = st.pop();
			if (value.equals("0")) {
				System.out.println();
				break;
			} else {
				System.out.println(value + " ");
			}
		}
	}
}
