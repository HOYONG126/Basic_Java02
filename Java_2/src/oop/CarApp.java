package oop;

//클래스로 객체를 생성하는 방법
//형식) 클래스명 참조변수=new 클래스명();
//=> new 연산자로 클래스의 생성자를 호출하여 객체를 생성하고 생성된 객체의 메모리 주소를 참조변수에 저장
//주소를 참조변수에 저장
//=>참조변수에 저장된 객체는 연산자를 사용하여 필드 또는 메소드에 이용해 프로그램 작성




//Car 클래스를 객체로 생성하여 작성된 프로그램
public class CarApp {
	public static void main(String[] args) {
		//Car 클래스를 객체를 생성하여 참조변수에 저장
		// => 하나의 클래스로 사로 다른 객체를 여러개 생성 가능
		// => 클래스는 객체를 생성하기 위한 틀(Template)
		// => 객체를 생성하면 객체 필드에는 기본값(숫자형 : 0 , 논리형false, 참조형 null)이 초기값으로 자동 저장
		
		Car carOne=new Car();
		Car carOne2=new Car();
		Car carOne3=new Car();
		
		System.out.println(carOne);
		System.out.println(carOne2);   // 메모리주소 전부 다르다
		System.out.println(carOne3);
		System.out.println("=============================");
		//참조변수.필드명 : 참조변수에 저장된 객체로 필드에 접근하여 사용
		carOne.modelName="싼타페";
		carOne.engineStatus=false;
		carOne.currentSpeed=0;
		//객체의 필드값 사용하여 출력
		System.out.println("자동차 모델은:"+carOne.modelName+" 엔진 상태는:"+carOne.engineStatus+"현재속도는 :"+carOne.engineStatus);
		System.out.println("=============================");
		//참조변수 메소드 사용
		//참조변수.메소드명(값, 값, ...)
		carOne.startEngine();			//메소드를 호출하여 필드값 변경
		carOne.speedUp(40);
		carOne.speedUp(150);
		carOne.speedDown(300);
		carOne.moveStop();
		carOne.stopEngine();
		
		System.out.println("=============================");
		
		
}
}
	