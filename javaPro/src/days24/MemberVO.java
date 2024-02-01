package days24;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Bonggu
 * @date 2024. 2. 1.- 오전 10:18:53
 * @subject 복습문제 1번
 * @content
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class MemberVO {
	private String name; //개인 이름
	private String position; //팀장, 팀원

	public static void main(String[] args) {



	}

}
