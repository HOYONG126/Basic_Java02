package inheritance;
//자동차 정보(모델명, 소유자명)를 저장하기 위한 클래스
//=>클래스 선언시 상속받은 부모클래스가 없는 경우 기본적으로 Object클래스를 자동으로 상속
//=>모든 Java 클래스는 무조건 Object 클래스를 상속받아 사용 가능
//Object 클래스 : 모든 Java 클래스의 최선조 클래스
//=>Object 클래스로 생성된 클래스 참조변수를 만들면 어떠한 객체든지 저장할 수 있다.
public class Car /*extends Object*/ {
	private String modelName;
	private String userName;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	public Car(String modelName, String userName) {
		super();  //Object클래스 상속
		this.modelName = modelName;
		this.userName = userName;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
