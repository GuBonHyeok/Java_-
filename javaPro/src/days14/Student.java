package days14;
/**
 * @author Bonggu
 * @date 2024. 1. 18.
 * @subject 학생 정보 (이름, 점수) 저장하는 클래스
 * @content
 */
public class Student {
	
	public Student() {	}

	public Student(String name, int kor, int eng, int mat, int tot, double avg, int rank, int wrank) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.tot = tot;
		this.avg = avg;
		this.rank = rank;
		this.wrank = wrank;
	}
	//field
	public String name;

	public int kor, eng, mat, tot;
	public double avg;
	public int rank, wrank;

	// method
	public void dispInfo() {
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%.2f\t%d등\t%d등\n"
				, name
				, kor
				, eng
				, mat
				, tot
				, avg
				, rank
				, wrank);
	
	} //disInfo

} //Student
