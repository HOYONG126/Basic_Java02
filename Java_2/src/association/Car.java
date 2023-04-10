package association;

//클래스와 클래스의 관계-객체관계
//=>UML(Unified Modeling Language)를 사용하여 클래스 다이어그램(Class Diagram)을 표현
//1. 일반화관계  generalization: 상속관계-X is a Y
//=> 클래스를 선언할 때 기존 클래스를 상속받아 작성
//=>사원 클래스와 관리자 클래스의 관계 - 관리자는 사원이다. o 사원은 관리자다 x
//2. 실체화 관계 realization: 상속관계
//=> 클래스를 선언할 때 기존 인터페이스를 상속받아 작성
//=> 인터페이스 : 현실에 존재하는 대상을 클래스 보다 추상적으로 표현하기 위한 자료형
//3. 연관관계 association : 포함관계-X has a Y
//=> 직접 연관관계(direct Association) : 한 방향으로만 도구로써 기능을 제공하는 관계
//=> 컴퓨터 <<cpu + Main board + Memory
//4. 집합 연관 관계(AGGREGATION):포함 관계로 설정된 객체들의 생명주기가 다른 포함관계
//=> 컴퓨터<< 프린터
//5. 복합 연관 관계 (COMPOSITION): 포함 관계로 설정된 객체들의 생명주기가 같은 포함 관계
//=> 게임 << 캐릭터
//6. 의존 관계(Dependency):포함 관계로 설정된 객체를 변경돼도 다른 객체에 영향을 주지않는 객체
//=> TV << 리모컨
public class Car {
	//자동차 정보(모델명, 엔진정보)를 저장하기 위한 클래스
	private String modelName;
	private int productionYear;
	//엔진정보를 저장하기 위한 필드 - Engine 클래스를 자료형으로 선언된 필드
	//=> 필드에는 Engine 객체를 생성자 또는 Setter 메소드를 사용하여 Engine 객체를 제공받아 저장 - 포함관계
	private Engine carEngine;
	
	public Car() {
	}
	
	public Car(String modelName, int productionYear, Engine carEngine) {
		super();
		this.modelName = modelName;
		this.productionYear = productionYear;
		this.carEngine = carEngine;
	}
	
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public int getProductionYear() {
		return productionYear;
	}
	public void setProductionYear(int productionYear) {
		this.productionYear = productionYear;
	}
	public Engine getCarEngine() {
		return carEngine;
	}
	public void setCarEngine(Engine carEngine) {
		this.carEngine = carEngine;
	}
	public void display() {
		System.out.println("모델명 : "+modelName);
		System.out.println("생산년도 : "+productionYear);
		
		
		//System.out.println("엔진정보 : "+carEngine); //객체의 메모리 주소 출력
		//필드에 저장된 객체를 이용하여 메소드 호출
		//=>포함관계로 설정된 클래스(객체)의 메소드를 호출하여 원하는 기능 구현
		//System.out.println("연료타입 = "+carEngine.getFualType());
		//System.out.println("배기량 = "+carEngine.getDisplacement());
		carEngine.displayEngine();//코드 중복성 최소화
	}
	
	
}
