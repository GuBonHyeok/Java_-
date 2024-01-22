package days16;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor //default 생성자 추가
@AllArgsConstructor //모든 필드 생성자 추가
@Getter					//모든 getter 추가
@Setter					//모든 setter 추가
public class EmployeeLombok {
	//필드
	private String name; //사원명
	private String adrr; //사원 주소
	private String tel; //사원 연락처
	private String hiredate; //입사 일자

}//class
