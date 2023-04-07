package oop;

//static 키워드 : 객체가 아닌 클래스로 접근하기 위한 기능을 제공하는 제한자
//=>클래스(내부클래스), 필드 , 메소드 작성시 사용
//제한자 modifier:특별한 기능을 제공(제한)하기 위해 사용하는 키워드
//=>Access Modifier(private,package,protected,public), static, final, abstract

//학생 정보(학번, 이름, 국어, 영어, 총점)를 저장하기 위한 클래스-vo클래스
public class Student {
		//인스턴스 필드(instance field) : 객체가 생성될 때 메모리(heapArea)에 생성되는 필드
		private int hakbun,kor,eng,tot;
		private String name;
		
		//정적필드(static field): 클래스를 읽어 메모리(MethodArea)에 저장될 때 생성되는 필드
		//=>객체가 생성되기 전에 메모리에 하나만 생성되는 필드
		//=>생성자에 초기화 처리하지 않고 직접 초기값을 필드에 저장
		//=>클래스로 생성된 모든 객체가 정적 필드 사용가능 - 공유값 : 메모리 절약 및 필드값 변경 용이
		//=>클래스 외부에서는 객체가 아닌 클래스를 사용하여 접근 가능
		private static int total;//기본값을 초기값으로 사용할 경우 초기값 저장 생략 가능
		
		//생성자 Constructor : 객체를 생성하면서 인스턴스 필드에 원하는 초기값을 저장하기 위해 작성
		public Student() {
			this(0,0,0,"아무개");
		}
		
		public Student(int hakbun, int kor, int eng, String name) {
			super();
			this.hakbun = hakbun;
			this.kor = kor;
			this.eng = eng;
			this.name = name;
			//총점을 계산하여 필드에 저장하는 명령 작성 -메소드호출
			//tot=kor+eng;     //코드 작성보다 메소드 호출을 권장
			this.calcTot();
		}
		//인스턴스 메소드 : this 키워드가 제공되는 메소드
		// =>this 키워드를 이용하여 인스턴스 필드 및 메소드 접근 가능
		//=> 클래스를 사용하여 정적 필드 및 메소드 접근 가능-클래스 생략 가능
		public int getHakbun(){
			return hakbun;
		}
		public void setHakbun(int hakbun) {
			this.hakbun = hakbun;
		}
		public int getKor() {
			return kor;
		}
		public void setKor(int kor) {
			this.kor = kor;
			calcTot();
		}
		public int getEng() {
			return eng;
		}
		public void setEng(int eng) {
			this.eng = eng;
			calcTot();
		}
		public int getTot() {
			return tot;
		}
		public void setTot(int tot) {
			this.tot = tot;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		//은닉화 선언된 메소드-클래스 내부에서만 호출하여 사용하는 메소드
		//=>코드의 중복성을 최소화 하기 위한 기능을 제공하는 메소드
		
		// public void calcTot() { //총점을 계산하는 메소드
		private void calcTot() { // =>클래스내부에서만 사용하는 것 (다른 main에서 불러오기 불가)
			tot=kor+eng;
		}
		public void display() {
			System.out.print("이름 = "+ name);
			System.out.print(" 학번 = "+ hakbun);
			System.out.println("영어 = "+ eng+"  국어 = "+ kor+"\n 총점 = "+ tot);
		}
		
		//정적필드는 클래스를 통해 들어가는 것이다.
		//정적 메소드(Static Method):this 키워드를 제공하지 않는 메소드
		//=> this키워드가 없으므로 인스턴스 필드 및 메소드 접근 불가능
		//=> 클래스를 사용하여 정적 필드 및 메소드 접근 가능-클래스 생략 가능
		public static int getTotal() {
			return total;
		}
		public static void setTotal(int total) {
			Student.total = total;
		}
}
//객체에 상관없이 하나만 만들어서 모든 메소드가 값을 동일하게 사용가능