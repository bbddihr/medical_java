package p0614;

public class C0614_01 {

	public static void main(String[] args) {
		
		//논리형
		boolean bol = true;
		boolean bol2 = false;
		
		//문자형
		char ch1 = 'a';
		//char ch2= 'xx'; // char는 문자 1개만 저장가능
		char ch3=' '; // 빈공백은 저장가능 
		char ch4 = '';//에러
		
		
		//정수형 - byte,short,int,long 접미사L을 붙여햐함.
//		byte a = 128; //byte 127까지 입력가능 
		short b = 2;
	//	int c = 2147483648; //2147483647까지 입력가능
		long d = 2147483648L;  //long은 L을 붙여줘야함.
		
		
		//실수형 -float: 접미사F를 붙여야함., double
		float e = 3.14F;
		double f = 3.14D;  접미사D,d 붙여도 됨.
		//정수형 byte,short,int,long 타입
//		int num = 10;
//		System.out.println(num);
		//print(num);

	}//main

}//class
