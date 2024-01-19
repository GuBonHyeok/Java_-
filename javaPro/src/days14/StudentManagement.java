package days14;
/**
 * @author Bonggu
 * @date 2024. 1. 18.
 * @subject 학생 정보 (이름, 점수) 저장하는 클래스
 * @content
 */
public class StudentManagement {
	public static void procRank(Student[] students, int count){
		for (int i = 0; i < count; i++) {
			//students[i].tot; 점수 매길 학생의 총점
			students[i].rank=1;
			for (int j = 0; j < count; j++) {
				if(students[i].tot < students[j].tot) {
					students[i].rank++;
				}
			}
			
		}
	}
}
