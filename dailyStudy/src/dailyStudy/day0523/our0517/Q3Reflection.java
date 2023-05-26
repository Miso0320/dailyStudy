package dailyStudy.day0523.our0517;

import java.lang.reflect.Field;

public class Q3Reflection {
	public static void main(String[] args) throws Exception {

		Team2 team = new Team2("집에가지말조", 24, "자바마스터");
		Class clazz = Team2.class;
		Field[] fields = clazz.getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			System.out.println(field.getName() + " : " + field.get(team));
		}
	}
}

class Team2 {
	String teamName;
	int studyTime;
	String goal;

	public Team2() {
	}

	public Team2(String teamName, int studyTime, String goal) {
		super();
		this.teamName = teamName;
		this.studyTime = studyTime;
		this.goal = goal;
	}
}