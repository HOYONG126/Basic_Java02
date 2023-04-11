package inheritance;
//학원인적자원(강사, 학생, 직원) 관리 프로그램
public class AcademyApp {
	public static void main(String[] args) {
		/*
		//학생정보(AcademyStudent 객체)를 저장하기 위한 요소들이 존재하는 배열 생성
		AcademyStudent[] students=new AcademyStudent[300];
		
		//강사 정보(AcademyInstructor 객체)를 저장하기 위한 요소들이 존재하는 배열 생성
		AcademyInstructor[] instructors=new AcademyInstructor[50];
		
		//직원정보를 저장하기 위한 요소들이 존재하는 배열 생성
		AcademyStaff[] staffs=new AcademyStaff[100];
		*/
		
		//사람정보(AcademyPerson 객체)를 저장하기 위한 요소들이 존재하는 배열 생성
		//=>배열 요소에 학생정보, 강사정보, 직원정보 저장가능
		//부모클래스의 참조변수에 자식클래스의 생성자로 객체를 생성하여 저장 가능
		//=>부모클래스의 참조변수에 자식클래스의 생성자로 부모클래스의 객체를 생성하여 저장가능
		AcademyPerson[] persons=new AcademyPerson[5];
		
		
		persons[0]=new AcademyStudent(1000,"홍길동","웹개발자 과정");
		persons[1]=new AcademyInstructor(2000,"임꺽정","Java 과정");
		persons[2]=new AcademyStaff(3000,"전우치","운영관리팀");
		persons[3]=new AcademyStudent(4000,"일지매","웹디자인 과정");
		persons[4]=new AcademyStaff(5000,"장길산","경영회계");
		
		//배열 요소에 저장된 객체를 하나씩 제공받아 참조변수에 저장하여 일괄처리
		for(AcademyPerson person:persons) {
			//오버라이드 선언되지 않은 자식클래스의 메소드를 호출하기 위해 명시적 객체 형변환을 이용하여 참조변수에 자식클래스객체 일시저장
			// [명시적 객체형변환]
			//문제점) 상속관계가 아닌 클래스로 명시적 객체 형변환 할 경우 ClassCastException 발생
			//해결법) 참조변수로 객체 형변환 가능한 클래스를 확인한 후 명시적 객체 형변환 이용
			//=> instanceof 연산자를 사용하여 참조변수의 객체 형변환 가능 클래스 검사
			//형식) 참조변수 instanceof 클래스
			//=> 참조변수로 참조 가능한 클래스를 확인하여 [false] 또는 [true]를 제공하는 연산자      
			if(person instanceof AcademyStudent) {
				System.out.println(((AcademyStudent)person).getCourse());
			}else if(person instanceof AcademyStudent) {
				System.out.println(((AcademyInstructor)person).getSubject());
			}else if(person instanceof AcademyStaff) {
				System.out.println(((AcademyStaff)person).getDepart());
			}
			
			//오버라이드 선언된 메소드는 묵시적 객체 형변환에 의해 부모클래스의 메소드를 호출하지 않고 자식클래스의 메소드 호출
			//참조변수에 저장된 자식클래스의 객체에 의해 자식클래스의 메소드가 선택 호출
			//=> 오버라이드에 의한 다형성
			//[묵시적 객체형변환]
			person.display();  //오버라이드로 인해 각자 개인정보까지 출력
			System.out.println("===============================================");
		}
}
}