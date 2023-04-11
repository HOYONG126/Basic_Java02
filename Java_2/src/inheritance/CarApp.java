package inheritance;

public class CarApp {
	public static void main(String[] args) {
		Car car=new Car("싼타페","홍길동");
		
		System.out.println("모델명 : "+ car.getModelName());
		System.out.println("소유자 : "+ car.getUserName());
		System.out.println("=========================================================================================");
		//Object.toString() : 참조변수에 저장된 객체를 참조하여 "클래스명@메모리주소"형식의 문자열로 변환하여 반환하는 메소드
		System.out.println("모델명 : "+ car.toString());
		System.out.println("=========================================================================================");
		
}
}
