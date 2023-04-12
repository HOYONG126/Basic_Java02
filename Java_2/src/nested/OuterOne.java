package nested;

//중첩클래스(Nested Class) : 클래스(OuterClass) 내부에 클래스(InerClass)를 선언
//=> 두개의 클래스가 밀접한 관계에 있을 경우 사용 - 클래스의 캡슐화를 강화할 목적으로 선언

public class OuterOne {
	private int outerNum;


	public OuterOne() {
		// TODO Auto-generated constructor stub
	}
	public OuterOne(int outerNum) {
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
	//객체 내부(중첩)클래스=>컴파일 결과를[외부클래스$내부클래스.class] 파일로 제공
	public class InnerOne{
		private int innerNum;
		public InnerOne() {
			// TODO Auto-generated constructor stub
		}
		public InnerOne(int innerNum) {
			super();
			this.innerNum = innerNum;
		}
		public int getInnerNum() {
			return innerNum;
		}
		public void setInnerNum(int innerNum) {
			this.innerNum = innerNum;
		}
		
		public void innerDisplayInner() {
			System.out.println("innerNum="+innerNum);
		}
		
}
}
