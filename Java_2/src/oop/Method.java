package oop;

public class Method {
	//객체 생성(참조)만 목적인 클래스-main 메소드 미작성
	
		//메소드 : 클래스 내부에 선언된 함수 - 멤버함수
		//=> 필드(멤버변수)를 이용하여 필요한 기능을 제공하기 위한 명령의 모임
		//=> 명령은 메소드 내부에서만 작성 가능
		
		//함수   : 매개변수로 값을 제공받아 계산하여 결과를 반환하는 명령의 모임-기능
		
		//  ★ 1) 메소드 선언하는 방법
		/*형식) 반환형 메소드명(자료형 변수명,자료형 변수명,(매개변수) ...){   
		 *   			명령;
		 *   			...
		 *   	}
		 */
		//=>반환명(ReturnType) : 메소드를 호출하여 얻을 수 있는 결과값에 대한 자료형
		//=> void 자료형(무반환형) : 메소드를 호출하여 얻을 수 있는 결과값이 없는 경우 사용하는 자료형
		//메소드의 ()기호에는 변수를 나열하여 선언자료형 - ★매개변수(Parameter-Argument)
		//메소드에 작성된 명령을 실행하기 위해 필요한 값을 메소드 호출시 전달받아 저장하기 위한 변수
		//매개변수는 자료형이 같은 매개변수를 여러개 사용해도 앞 자료형을 생략해서 쓰면 안된다.(int a,b) X (int a, int b)O
		//메소드에 작성된 명령을 실행하기 위해 필요한 값을 메소드 호출시 전달받아 저장하기 위한 매개변수
		//메소드에 작성된 명령을 실행하기 위한 값이 필요없는 경우 매개변수 생략가능
		
		//메소드 호출(method invoke): 메소드에 작성된 명령들을 실행하여 필요한 기능 제공
		//호출방법형식) 객체, 메소드명(값, 값, ...)
		// =>객체가 저장된 참조변수를 사용하여 객체의 메소드 호출
		// =>메소드 호출시 매개변수에 차례대로 값을 전달하여 메소드 호출
		// =>매개변수에 값이 정상적으로 전달되지 않으면 메소드 호출 불가능 - 오류발생
		
		//return 키워드 : 메소드를 강제로 종료하기 위한 키워드
		//형식-1) if(조건식) return;
		//=> 메소드의 반환형을 [void]로 작성
		//형식-2) return 반환값;
		//=>메소드를 종료하면서 반환값(변수 또는 연산식)을 반환하여 메소드를 호출하는 명령에게 제공
		//=>메소드의 반환형을 대상의 자료형과 반드시 같도록 작성 - 같지않으면 오류발생 
	
		//호출된 메소드안에서는 입.출력을 하지 않는다. 왜냐하면 메소드를 여러 곳에서 사용할 수 있기 때문이다. 
		void displayOne() {
			System.out.println("Method 클래스의 displayOne() 메소드 호출");
		}	
		void displayTwo() {
			System.out.println("Method 클래스의 displayTwo() 메소드 호출");
		}	
		void printOne() {
			int total=0;
			for(int i=1; i<=100; i++) {
				total+=1;
			}
			System.out.println("1~100 범위의 정수들의 합계 = " + total);
		}
		void printTwo(int num) {
			int total=0;
			//매개변수에 저장된 값에 대한 검증
			if(num<0) {
				System.out.println("[에러]매개변수에는 0보다 큰 값이 저장되어야합니다.");
				return; //메소드 종료
			}
			for(int i=1; i<=num; i++) {
				total+=i;
			}
			System.out.println("1~"+num+" 범위의 정수들의 합계 = " + total);
		}
		void printThree(int one, int two) {
			if(two<one) {
				System.out.println("[에러]초기값이 마지막값보다 작게 해주세요.");    
				return;    //에러 표시 안해도되고 큰값과 작은값을 바꿔서 작은수~큰수로 더해도된다.(temp 사용 치환)
			}
			int sum=0;
			for(int i=one; i<=two; i++) {
				sum+=i;
			}
			System.out.println(one+"부터 "+two+"까지의 합은 :"+sum+"입니다.");
		}
		int returnTotal(int num1, int num2) {
			int total=0;
			for(int i=num1; i<=num2; i++) {
				total+=i;
			}
			return total; //변수에 저장된 값을 메소드를 종료하며 메소드를 호출하는 명령에게 반환
						  //=>반환되는 값의 자료형과 메소드의 반환형이 반드시 동일
		}
		
		//매개변수로 정수값을 전달받아 홀수와 짝수를 구분하여 반환하는 메소드
		// =>false 반환 : 홀수 ,  true 반환: 짝수
		boolean isChecked(int num) {
			if(num%2==0) {
				return true;
			}
			else {
				return false;
			}
		}
}
