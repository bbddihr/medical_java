package p0614;

public class C0614_05 {

	public static void main(String[] args) {
		//정수의 오버플로우(Overflow)
		byte b = 127;
//		byte b2= 128; //에러표시해줌.
		b = (byte)(b+10) ;
		
		System.out.println(b);
		int num = 2147483647;
		num=num + 1;
		System.out.println(num);
//		char ch = 'A';
////		char ch2 = 'AA';  //2개 이상 문자 안됨.
//		char ch3 = ' ';   //사이띄우기 가능
//		char ch4 = ' ';   //null 안됨.
//		String str = "AA";
//		String str2 = "";
//		String str3= null;
//		
//		String s1 = "A" + "B";
//		System.out.println(s1); //AB
//		System.out.println(""+7+7+7);  //777 //문자열+어떤타입 = 문자열타입으로 변경
//		System.out.println(7+7+7+""); 	//21 
//		System.out.println(7+7+7+""+7);  //21+7=217 //
	}

}
