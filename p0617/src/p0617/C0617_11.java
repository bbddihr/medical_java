package p0617;

import java.util.Scanner;

public class C0617_11 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("프로그램을 종료할까요?(종료:X)");
		String str=scan.next();
		if(str.equalsIgnoreCase("x")) {
//		if(str.equals("x")||str.equals("X")) {
			System.out.println("프로그램을 종료합니다.");
		}else {
			System.out.println("프로그램을 계속 실행합니다.");
		}
		
		//if(str==str): 에러	
//	//	String str=null;
//		String str="";
//		if(str != null && !str.equals(""))
//			str.charAt(0);
//		else
//			System.out.println("빈문자입니다.");

	}

}
