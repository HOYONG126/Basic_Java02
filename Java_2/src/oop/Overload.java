package oop;

public class Overload {
	public void displayInt(int param) {
		System.out.println("정수값 = "+param);
	}
	public void displayBoolean(boolean param) {
		System.out.println("논리값 = "+param);
	}
	public void displayString(String param) {
		System.out.println("문자열 = "+param);
	}
	//메소드 오버로딩  : 클래스에서 동일한 기능을 제공하는 메소드가 매개변수에 의해 여러개 선언해야할 경우 메소드이름 같도록 선언하는 기능
	//같은 이름의 메소드를 사용할 때에는 자료형이나 개수 중 하나이상 달라야 사용 가능하다.(반환은 달라도 같은 메소드로 취급 -> 오류)
	public void display(int param) {
		System.out.println("정수값 = "+param);
	}
	public void display(int param,int param2) {
		System.out.println("정수값 = "+param);
	}
	public void display(boolean param) {
		System.out.println("논리값 = "+param);
	}
	public void display(String param) {
		System.out.println("문자열 = "+param);
	}
}
