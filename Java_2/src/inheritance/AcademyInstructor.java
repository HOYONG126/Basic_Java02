package inheritance;

//강사정보(강사번호, 강사이름, 강의과목)를 저장하기 위한 클래스
public class AcademyInstructor extends AcademyPerson {
	private String subject;

	public AcademyInstructor() {
	}
	public AcademyInstructor(int num, String name, String subject) {
		super(num, name);
		this.subject = subject;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public void display() {
		System.out.println("강사번호 : "+getNum());
		System.out.println("강사이름 : "+getName());
		System.out.println("과목 : "+getSubject());
		
	}
}
