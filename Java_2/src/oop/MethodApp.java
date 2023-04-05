package oop;
//싱행이 목적인 클래스 - main 메소드를 반드시 작성
public class MethodApp {
	//프로그램 실행시 JVM(Java Virtual Machine)이 자동 호출하는 특별한 메소드
	public static void main(String[] args) {
		//클래스로 객체를 생성하여 객체의 메모리 주소를 참조변수에 저장
		//=>같은 패키지에 작성된 클래스는 패키지 표현없이 클래스 사용 가능
		//=>참조변수를 사용하여 객체의 필드 또는 메소드 접근 가능
		Method method=new Method();
		//참조변수를 출력할 경우 "자료형@메모리주소" 형식의 문자열을 제공받아 출력
		System.out.println("method = "+ method);
		System.out.println("====================================================");
		//메소드 호출 : 객체를 이용하여 메소드를 호출하면 프로그램의 흐름(스레드)은 객체의 메소드로 이동하여 메소드의 명령을 실행하고 메소드가 종료되면 다시 되돌아와 이어서 실행된다.
		method.displayOne(); //매개변수를 보내면 오류발생. displayOne의 method는 매개변수가없는 method이기때문이다.
		System.out.println("====================================================");
		method.printOne();
		System.out.println("====================================================");
		method.printTwo(54);    
		method.printTwo(-30);    
		System.out.println("====================================================");
		method.printThree(28, 39);
		method.printThree(45, 55);
		method.printThree(80, 42);
		System.out.println("====================================================");
		//메소드를 호출하면 반환되는 값이 존재하는 메소드이다.
		//메소드의 반환값을 지속적으로 사용하고자 할 경우 반환값을 변수에 저장
		int longSum_30_50 = method.returnTotal(30, 50);
		System.out.println("합계(메소드 호출의 반환값)="+longSum_30_50);
		System.out.println("합계(메소드 호출의 반환값)="+method.returnTotal(30, 50));
		System.out.println("====================================================");
		boolean isChecked=method.isChecked(10);
		if(isChecked==true) {
			System.out.println("매개변수로 전달된 값은 [짝수]입니다.");
		}
		else {
			System.out.println("매개변수로 전달된 값은 [홀수]입니다.");
		}
		System.out.println("====================================================");
		if(method.isChecked(10)) {
			System.out.println("매개변수로 전달된 값은 [짝수]입니다.");
		}
		else {
			System.out.println("매개변수로 전달된 값은 [홀수]입니다.");
		}
		System.out.println("====================================================");
		//배열의 메모리 주소를 반환하는 메소드를 호출하면 반환된 메모리 주소를 참조변수에 저장
		//=> 참조변수에 저장된 메모리 주소를 사용하여 배열 참조 가능
		int[] array=method.returnArray();
		for(int num: array) {
			System.out.print(num+" ");
		}
		System.out.println("");
		System.out.println("====================================================");
		System.out.println("합계 : "+method.sumOne(10, 20, 30)); //method받는 객체의 받는 갯수, 자료형 꼭 맞추어줘야함
		System.out.println("====================================================");
		//System.out.println(method.sumTwo(10,20,30)); 오류
		System.out.println(method.sumTwo(new int[] {10,20,30,40,50}));   //method로 배열 보낼 땐 이런 형식으로 보내야한다.
		System.out.println("===================================");
		System.out.println("합계:"+method.sumThree(10,20,30,40,50));
}
}
