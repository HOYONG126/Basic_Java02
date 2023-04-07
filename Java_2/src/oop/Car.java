package oop;
		//클래스(class): 객체(object)를 생성하기 위한 자료형 -참조형
		// => java 에서는 객체(object)대신 인스턴스(instance)라는 용어 사용
		//=>현실에 존재하는 사물 또는 관념을 클래스라는 자료형으로 표현하여 프로그램에서 사용할 수 있도록 객체로 생성하여 사용
		
		//클래스 선언 형식
		/*형식) [public] class 클래스명{
		 * 		필드(field) : 표현대상의 속성(값)을 저장하기 위한 변수 - 멤버변수
		 * 		...
		 * 		생성자(ConStructor) : 클래스로 객체를 생성하기 위한 특별한 메소드
		 * 		...
		 * 		메소드(method) : 표현 대상의 행위를 명령으로 제공하기 위한 함수 - 멤버함수
		 * 		...
		 * }
		 */
	//=>모든 메소드는 필드를 사용한 명령으로 필요한 기능이 제공되도록 작성
	//=>클래스 내부에 선언된 모든 메소드는 필드 접근 가능


//자동차를 객체모델링하여 클래스로 작성
//=> 속성 : 모델명,엔진상태, 현재속도
//=> 행위:시동 온(on) ,시동끄기 off ,속도증가,속도 감소, 이동 중지
public class Car {
	//필드
	private String modelName; //모델명
	private boolean engineStatus; //엔진상태
	private int currentSpeed;  //현재속도
	//생성자 : 생성자를 선언하지 않으면 매개변수가 없는 기본 생성자(default constructor)가 자동으로 적용
	
	//메소드:필드를 사용하여 메소드의 명령으로 필요한 기능을 제공되도록 작성
	//시동on 메소드
	public void startEngine(){
		  engineStatus=true;
		  System.out.println(modelName+"의 시동을 켰습니다.");
	  }
	  //시동off 메소드
	  void stopEngine() { 
		  if(currentSpeed!=0) {
			  moveStop();
		  }
		  engineStatus=false;
		  System.out.println(modelName+"의 시동을 껐습니다.");
	  }
	  //속도증가
	  void speedUp(int speed) {
		  if(!engineStatus) {
			  System.out.println(modelName+"시동부터 걸어주세요 . ");
			  return;
		  }
		  if(currentSpeed+speed>150) {
			  speed=150-currentSpeed;
		  }
		  currentSpeed+=speed;
		  System.out.println(modelName+"의 속도가"+speed+"Km/h 증가되었습니다. 현재속도 : "+currentSpeed + "Km/h");
	  }
	  //속도감소
	  void speedDown(int speed) {
		  if(engineStatus==false) {
			  System.out.println(modelName+"시동부터 걸어주세요 . ");
			  return;
		  }
		  if(currentSpeed < speed) {
			  speed=currentSpeed;
		  }
		  currentSpeed-=speed;
		  System.out.println(modelName+"의 속도가"+speed+"Km/h 감소되었습니다. 현재속도 : "+currentSpeed + "Km/h");
	  }
	  //이동중지
	  void moveStop() {
		  currentSpeed=0;
		  System.out.println(modelName+"자동차가 멈추었습니다.");
	  }
	//필드에 다른 값이 들어가는 경우(다른 클래스에서 사용한값) 예방법
	//클래스를 작성할 때 필드와 메소드에는 접근 제한자를 사용하여 접근유무 설정가능
	//접근 제한자(Access Modifier):	private, package(default),protected,public
	//=> 클래스, 필드, 생성자, 메소드를 선언할 때 접근 허용을 설정하기 위한 키워드
	//private : 클래스 내부에서만 접근 가능하도록 허용하는 접근 제한자   
	//=>필드, 생성자, 메소드를 은닉화 처리하기 위해 사용 -> 클래스 외부에서 접근할 경우 에러발생
	//=>일반적으로 필드에 사용하는 접근제한자-객체로 필드에 직접적인 접근을 제한하기 위해 사용
	//데이터 은닉화 : 값을 숨겨 보호하기 위한 기능
	//public : 모든 패키지의 클래스에서 접근 가능하도록 허용하는 접근제한자 -> 일반적으로 메소드에 사용
//	  	   public 메소드 앞에 설정 안하면 다른 package에서 사용 안된다.
	//맨아랫줄로!
	//은닉된 필드를 사용하기 위해서는 public 메소드를 사용하여 접근해야한다.


//은닉화 처리된 필드를 위해 필드값을 반환하는 Getter 메소드와 필드값 변경하는 Setter 메소드 선언- 캡슐화
//캡슐화(Encapsulation) : 표현대상의 속성(필드)과 행위(메소드)를 하나의 자료형(클래스)로
//=>필드를 은닉화 처리하여 보호하고 메소드를 이용하여 처리되도록 설정
//Getter 메소드 : 클래스에 외부에서 필드값을 사용할 수 있도록 필드값을 반환하는 메소드
//=>필드의 자료형이 boolean인 경우에는 메소드의 이름을 is필드명 으로 작성
//형식) public 반환형 get필드명(){ return 필드명;}
public String getModelName() {//메소드 앞에 private가 아닌 public이 붙여지고 변수명앞에 get붙여 메소드 생성
	return modelName;
}
//Setter 메소드 : 매개변수로 값을 전달받아 매개변수에 저장된 값으로 필드값을 변경하는 메소드
//형식) public void set필드명(자료형 변수명){필드명=변수명;}
/* public void setModelName(String name) {
	//매개변수에 저장된 값에 대한 검증
	modelName=name;
}  */
public void setModelName(String modelName) {
	//매개변수에 저장된 값에 대한 검증
	this.modelName=modelName;      //필드랑 매개변수가 같을 땐 this를 붙여서 필드를 나타내준다. 
}


//이클립스에서는 은닉화 처리된 필드에 대한 Getter 메소드와 Setter 메소드를 생성하는 기능
//단축키 : [ALT]+[shift]+[s] >> 팝업메뉴 >> R >>필드선택>>GENERATE    (SOURCE -> GETTER AND SETTER)
public boolean isEngineStatus() {
	return engineStatus;
}
public void setEngineStatus(boolean engineStatus) {
	this.engineStatus = engineStatus;
}
public int getCurrentSpeed() {
	return currentSpeed;
}
public void setCurrentSpeed(int currentSpeed) {
	this.currentSpeed = currentSpeed;
}
}