package p0624;

public class C0624_07_element {

	public static void main(String[] args) {
		int a= 10;
		int b= 5;
		int [] result=new int[4];
		
		//Element의 메소드를 활용해서
		//a와 b의 사칙연산 결과값을 출력하시오.
		//cal(a,b);
		

		Element e= new Element();
		e.allCal(a, b, result);
		
//		int add=e.cal(a, b);
//		int sub= e.cal2(a,b);
//		int multi= e.cal3(a,b);
//		int divide= e.cal4(a,b);
	
		

		System.out.println("더하기: "+result[0]);
		System.out.println("빼기: "+result[1]);
		System.out.println("곱하기: "+result[2]);
		System.out.println("나누기: "+result[3]);
		
		//더하기: 15
		//빼기: 5
		//곱하기: 50
		//나누기: 2

	}

}

//재귀호출 recursive call
//factorial 5! = 5*4*3*2*1
