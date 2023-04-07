package oop;

public class StudentApp {

	public static void main(String[] args) {
/*		Student student=new Student();
		
		Student student1=new Student(1000,90,90,"홍길동");
		Student student2=new Student(2000,94,98,"임꺽정");
		Student student3=new Student(3000,91,80,"전우치");
		Student student4=new Student(4000,76,82,"일지매");
		Student student5=new Student(5000,84,86,"장길산");
		
	//	student1.calcTot();
	//	student2.calcTot();
	//	student3.calcTot();
	//	student4.calcTot();
	//	student5.calcTot();
		
		student1.display();
		student2.display();
		student3.display();
		student4.display();
		student5.display();
		System.out.println("=====================");
		//국어점수 수정
		student1.setKor(100);
		student1.display();
*/
		
		//객체를 저장할 수 있는 참조요소가 5개인 배열 생성
		//배열의 참조요소에는 기본적으로 [null]을 초기값으로 저장
	/*	Student[] student = new Student[5];
		
		//객체를 생성하여 배열의 참조요소에 객체의 메모리 주소 저장
		student[0]=new Student(1000,90,90,"홍길동");
		student[1]=new Student(2000,94,98,"임꺽정");
		student[2]=new Student(3000,91,80,"전우치");
		student[3]=new Student(4000,76,82,"일지매");
		 // student[4]=new Student(5000,84,86,"장길산");       
		for(int i=0; i<student.length; i++) {
			if(student[i]!=null) {
				student[i].display();
			}
		}
		
		//반복문을 사용하여 배열의 참조요소에 저장된 객체의 메소드를 일괄적으로 호출하여 처리
		//참조변수에 [null]이 저장된 상태에서 객체의 메소드를 호출할 경우 NullPointerException 발생 ------->무조건 배열 모든값 넣어야함
		for(int i=0; student.length>i; i++) {
			student[i].display();
		}
		System.out.println("======================================");
		*/
		Student[] student= {new Student(1000,90,90,"홍길동"),new Student(2000,94,98,"임꺽정"),new Student(3000,91,80,"전우치"),new Student(4000,76,82,"일지매"),new Student(5000,84,86,"장길산")};
		//배열의 참조요소에 저장된 객체의 메모리 주소를 차례대로 제공받아 변수에 저장하여 처리하는 향상된 for구문을 사용하여 일괄처리
		int total=0;
		for(Student students : student) {
			students.display();
			//정적 필드는 public 접근제한자로 설정된 경우 클래스를 이용하여 접근 가능
			//객체로 접근 가능하지만 경고 발생
			//students.total+=students.getTot();
			//정적 필드가 Private 접근 제한자로 설정된 경우 메소드를 이용하여 접근 가능
			//=>정적 메소드는 객체가 아닌 클래스를 이용하여 호출 가능
			Student.setTotal(Student.getTotal()+students.getTot());
		}
		System.out.println("====================");
		//모든 학생들의 점수들의 합계를 계산하여 출력
		System.out.println("총 합계 = "+total);
		System.out.println("====================");
}
}
