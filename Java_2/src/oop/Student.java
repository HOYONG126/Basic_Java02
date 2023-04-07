package oop;

//학생 정보(학번, 이름, 국어, 영어, 총점)를 저장하기 위한 클래스-vo클래스
public class Student {
		private int hakbun,kor,eng,tot;
		private String name;
		
		public Student() {
			this.(0,0,0,"아무개");
		}
		//생성자 Constructor
		public Student(int hakbun, int kor, int eng, String name) {
			super();
			this.hakbun = hakbun;
			this.kor = kor;
			this.eng = eng;
			this.name = name;
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
		}
		public int getEng() {
			return eng;
		}
		public void setEng(int eng) {
			this.eng = eng;
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
		
		public void display() {
			System.out.println("이름 = "+ name);
			System.out.println("학번 = "+ hakbun);
			System.out.println("영어 = "+ eng+"+t국어 = "+ kor+"\n 총점 = "+ tot);
		}
		
		
}
