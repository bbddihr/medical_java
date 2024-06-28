package p0620;

import java.util.Scanner;

public class C0620_04 {

	public static void main(String[] args) {
		// 객체 =인스턴스 object =instance
		// 객체를 선언해야지만 클라스를 쓸수있다.
		// 클라스는 객체를 정의한것.
		// 배열은 같은 타입만 담을수있다
		// 클래스는 묶음. 
		// 객체 지향언어의 특징
		//1.코드의 재사용성이 높다
		//2.접근권한을 말들수있다 (데이터보호)
		
		
		//변수 선언
		Scanner scan=new Scanner(System.in);

		String tvColor = "white";
		boolean power = false;
		int channel = 0;
		
		String tvColor2 = "white";
		boolean power2 = false;
		int channel2 = 0;
		
		String tvColor3 = "white";
		boolean power3 = false;
		int channel3 = 0;
		
		//타입 변수명 = 0
		int a = 0;
		//객체 선언
		//클라스타입  참조변수명 =new 클라스타입()
		
		Tv tv1;         //객체를 다루기 위한 참조변수가 선언인 됨
		tv1= new Tv();  //객체생성 후 , 생성된 객체의 주소를 참조변수에 저장시켜줌.
		System.out.println("tv1 : "+tv1);
		
		Tv tv2=new Tv();
		
		
		int[] num;          //배열을 다루기 위한 참조변수가 선언
		num= new int[5];    //배열 생성 후, 생성된 배열의 주소를 참조변수에 저장
		System.out.println("num: "+num);
		
		
		
		
	
	
//		String color ="white";
//		boolean power = false;
//		int channel= 0;
		//volume, size,......
		
//		while(true) {
//			System.out.println("1. Tv 켜기");
//			System.out.println("2. Tv 끄기");
//			System.out.println("_________________");
//			System.out.println("TV 상태를 선택>>");
//			int choice = scan.nextInt(); 
//		}
	}

}
