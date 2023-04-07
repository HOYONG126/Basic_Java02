package oop;

//학생 정보(학번, 이름, 국어, 영어, 총점)를 저장하기 위한 클래스-vo클래스
public class Student {
		private int hakbun,kor,eng,tot;
		private String name;
		
		public Student() {
			this(0,0,0,"아무개");
		}
		//생성자 Constructor
		public Student(int hakbun, int kor, int eng, String name) {
			super();
			this.hakbun = hakbun;
			this.kor = kor;
			this.eng = eng;
			this.name = name;
			//총점을 계산하여 필드에 저장하는 명령 작성 -메소드호출
			//tot=kor=eng;     //코드 작성보다 메소드 호출을 권장
			this.calcTot();
		}
		public int getHakbun() {
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
}
