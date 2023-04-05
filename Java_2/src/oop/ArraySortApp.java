package oop;
//객체지향 프로그램(OOP)은 객체 상호간 관계를 맺어 메소드를 호출하여 작동하는 프로그램
// 마치 레고블럭과 같습
// 객체의 요소를 사용하여 프로그램을 작성하는 방법
// => OOP 특징 : 추상화, 캡슐화, 다형성, 상속성
//객체 모델링(Object Modeling) : 현실에 존재하는 대상을 속성과 행위로 구분하여 설계

//★특징 1번 => 설계된 대상을 클래스(필드와 메소드)로 선언 - 추상화(Abstraction)
// 클래스 배포 가능 : 프로그램의 생산성 증가 및 유지보수의 효율성 증가
//배열에 저장된 모든 요소값을 오름차순 정렬하여 출력하는 프로그램 작성
import java.util.Arrays;

public class ArraySortApp {
	public static void main(String[] args) {
		//배열에 저장된 모든 요소값을 오름차순 정렬하여 출력하는 프로그램 작성
	/*	int[] array= {30,50,10,40,20};
		System.out.print("정렬 전 >>");
		for(int num: array) {
			System.out.print(num+"  ");
		}
		System.out.println("");
		//배열 요소값을 선택 정령 알고리즘을 사용하여 오름차순 정렬되도록 저장
		for(int i=0; i<array.length-1; i++) {
			for(int j=i+1; j<array.length; j++) {
				if(array[i]>array[j]) {
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.println("정렬 후");
		for(int temp: array) {
			System.out.print(temp+"\t");
		}
		*/
		int[] array= {30,50,10,40,20};
		//Arrays 클래스 : 배열의 요소를 제어하는 기능의 메소드를 제공하는 클래스
		//Arrays.toString(Object[] array):매개변수를 통해 배열을 전달받아 배열의 모든 요소값들을 문자열로 변환하여 반환하는 메소드 
		System.out.println("정렬 전 :"+ Arrays.toString(array));
		//Arrays.sort(Object[] array):배열을 전달받아 배열의 모든 요소값들을 오름차순 정렬하는 메소드
		//정렬하는 메소드
		Arrays.sort(array);
		System.out.println("정렬 후 :"+Arrays.toString(array));
}
}
