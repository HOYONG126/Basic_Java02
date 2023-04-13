package nested;

public class OuterThree {
	private int outerNum;
	public OuterThree() {
		// TODO Auto-generated constructor stub
	}
	public OuterThree(int outerNum) {
		super();
		this.outerNum = outerNum;
	}
	public int getOuterNum() {
		return outerNum;
	}
	public void setOuterNum(int outerNum) {
		this.outerNum = outerNum;
	}
	public void outerDisplay() {
		System.out.println("outerNum="+outerNum);
	}
	
	public void local() {
		//로컬클래스:메소드 내부에 선언된 클래스 - 메소드가 종료되면 자동 소멸
		//=> 클래스에 final 또는 abstract 제한자만 사용 가능
		class InnerThree{
			
		}
	}
	
	
}
