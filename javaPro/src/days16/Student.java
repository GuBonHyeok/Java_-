package days16;

public class Student {
	
	private String name = "홍길동";
	private int age = 20;
	private boolean gender = true;
	private String genderStr;
	
	public Student () {
		
	}
	
	public Student (String name) {
		this.name = name;
	}
	public Student (int age) {
		this.age = age;
	}
	public Student (boolean gender) {		
		if (this.gender == true) genderStr = "남성";
		else genderStr = "여성";
	}
	
	
	public void dispInfo() {
		System.out.printf("학생 이름 : %s 나이 : %d 성별 : %s"
				, this.name
				, this.age
				, this.gender);
	}
}
