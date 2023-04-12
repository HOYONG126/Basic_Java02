package enumerate;
public enum Compass {
	//열거형에 선언된 상수필드는 기본적으로 정수형으로 설정
	//=>상수필드를 선언하면 열거형의 기본 생성자를 이용하여 초기값이 상수필드에 저장
	//=>상수필드에는 0부터 1씩 증가되는 정수값이 기본값으로 저장
	EAST,WEST,SOUTH,NORTH;
	//상수필드의 자료형 또는 저장값을 변경하기 위한 필드 선언
	//=> private final 제한자를 사용하여 필드선언
	//상수필드의 자료형 또는 저장값을 변경하기 위한 필드 선언
	//private final int value; //상수필드값을 변경하기 위한 필드
}