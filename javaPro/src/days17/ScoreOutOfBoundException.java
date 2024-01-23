package days17;

//사용자가 정의한 예외 클래스
// ㄴ checked 예외
// ㄴ unchecked 예외 <<< 
public class ScoreOutOfBoundException extends RuntimeException{
	
	//예외 코드 번호 : 필드로 선언
	private final int ERROR_CODE;
		
	public int getERROR_CODE() { //코드번호를 가져오는 getter
		return ERROR_CODE;
	}

	public ScoreOutOfBoundException(String message) { //에러 코드 번호가 안 넘어오면 고정으로 1000을 주겠다.
//		super(message); //부모 생성자 호출
//		this.ERROR_CODE = 1000; //생성자에서 final 변수 한 번 초기화 시킴
		this(1000, message); //아래 매개변수 2개짜리 생성자를 호출해서 고정 값 1000 입력 
	}
	
	public ScoreOutOfBoundException(int error_code, String message) {
		super(message); //부모 생성자 호출
		this.ERROR_CODE = error_code; //생성자에서 final 변수 한 번 초기화 시킴
	}
	
	
	
}
