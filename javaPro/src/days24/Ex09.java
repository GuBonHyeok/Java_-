package days24;

public class Ex09 {
	// 								0			1			2			3
	// enum Direction {EAST, SOUTH, WEST, NORTH}
	// 							100		101		200		300
	// enum Direction {EAST, SOUTH, WEST, NORTH}
	
	enum Direction {
		EAST(100, "▶"), SOUTH(200, "▼"), WEST(300, "◀"), NORTH(400,"▲") ; // 이렇게 하려면 매개변수 2개짜리 생성자를 만들어주면 된다
		
		private final int value;
		private final String symbol;
		
		 
		
		Direction(int value, String symbol){
			this.value = value; //상수이기 때문에 한 번 setter 하면 더이상 할 필요 없기 떄문에 getter만 자동 생성됨
			this.symbol = symbol;
		}

		public int getValue() {
			return value;
		}

		public String getSymbol() {
			return symbol;
		}
		
		
		/*
		Direction(int value){
			this.value = value; //상수이기 때문에 한 번 setter 하면 더이상 할 필요 없기 떄문에 getter만 자동 생성됨
		}
		public int getValue() {
			return value;
		}
		*/
		
	}
	/*
	* 2. 컴파일러가  클래스 변환
    *    class Direction extends Enum{
    *       static final Direction EAST = new Direction("EAST");
    *       static final Direction SOUTH = new Direction("SOUTH");
    *       static final Direction WEST = new Direction("WEST");
    *       static final Direction NORTH = new Direction("NORTH");
    *       
    *       private String name;
    *       public int namename(){
    *         return this.name;
    *       }
    *       private int ordinal
    *       public int ordinal(){
    *         return this.ordinal;
    *       }
    *       private Dirction(String name){
    *          this.name = name;
    *       }
    *    }
    */    
	

	public static void main(String[] args) {
		Direction[] dirArr = Direction.values();
		for (Direction dir : dirArr) {
			System.out.println(
					dir.name() +"/"
				+	dir.ordinal() +"/"
				+	dir.getSymbol()+"/"
				+ dir.getValue());
			
		}

	}

}
