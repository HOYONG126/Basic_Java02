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
	String modelName; //모델명
	boolean engineStatus; //엔진상태
	int currentSpeed;  //현재속도
	//생성자 : 생성자를 선언하지 않으면 매개변수가 없는 기본 생성자(default constructor)가 자동으로 적용
	
	//메소드:필드를 사용하여 메소드의 명령으로 필요한 기능을 제공되도록 작성
	//시동on 메소드
	  void startEngine(){
		  engineStatus=true;
		  System.out.println(engineStatus+"의 시동을 켰습니다.");
	  }
	  //시동off 메소드
	  void stopEngine() { 
		  engineStatus=false;
		  System.out.println(modelName+"의 시동을 껐습니다.");
	  }
	  //속도증가
	  void speedUp(int speed) {
		  currentSpeed+=speed;
		  System.out.println(modelName+"의 속도가"+speed+"Km/h 증가되었습니다. 현재속도 : "+currentSpeed + "Km/h");
	  }
	  //속도감소
	  void speedDown(int speed) {
		  currentSpeed-=speed;
		  System.out.println(modelName+"의 속도가"+speed+"Km/h 감소되었습니다. 현재속도 : "+currentSpeed + "Km/h");
	  }
	  //이동중지
	  void moveStop(int speed) {
		  currentSpeed=0;
		  System.out.println(modelName+"자동차가 멈추었습니    다.");
	  }
	public static void main(String[] args) {
		
}
}
