package oop;
public class RuntimeApp {
	public static void main(String[] args) {
//runtime 클래스 : java 프로그램과 운영체제(Operation System) 관련 기능을 제공하는 기능의 메소드가 선언된 클래스
//=>생성자가 은닉화 선언되어있어 new 연산자로 객체 생성 불가능
		//Runtime 클래스는 프로그램에 객체를 하나만 제공하기 위한 클래스 - 싱글톤 클래스
		//Runtime runtime=new Runtime();
		
		
		//Runtime.getRuntime() : Runtime 객체를 반환하는 메소드
		//=>정적 메소드이므로 클래스를 이용하여 호출 가능
		//=>getRuntime() 메소드를 여러번 호출해도 같은 객체를 반환
		Runtime runtime1=Runtime.getRuntime();
		Runtime runtime2=Runtime.getRuntime();
		
		System.out.println("runtime1="+runtime1);
		System.out.println("runtime2="+runtime2);
		System.out.println("=================================================");
		System.out.println("메모리를 정리하기 전 JVM 사용 메모리의 크기>>");
		//Runtime.totalMemoty():JVM이 사용가능한 전체 메모리의 크기를 반환하는 메소드
		//Runtime.freeMemoty():JVM이 사용가능한 여유 메모리의 크기를 반환하는 메소드
		System.out.println(runtime1.totalMemory()-runtime1.freeMemory()+"Byte");
		
		//Runtime.gc() : 메모리를 정리하는 Garbage collector 컬렉터를 실행하는 메소드
		runtime1.gc(); //System.gc();
		System.out.println("=================================================");
		System.out.println("메모리를 정리하기 전 JVM 사용 메모리의 크기>>");
		System.out.println(runtime1.totalMemory()-runtime1.freeMemory()+"Byte");
}
}
