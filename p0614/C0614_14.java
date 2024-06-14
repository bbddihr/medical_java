package p0614;
import java.util.Scanner;
public class C0614_14 {

	public static void main(String[] args) {
		//입력 숫자가 양수인지, 음수인지 출력하시오.
		
		Scanner s=new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int a=s.nextInt();
		if (a>=0) {
			System.out.println("양수");
		
		}else {
			System.out.println("음수");
		}
		
//		int a = 10;
//		if (a==10) {
//			System.out.println("10입니다.");
//		}else {
//			System.out.println("10이 아닙니다.");
//		}
//		
//		if (a>0) {
//			System.out.println("양수");
//		}else {
//			System.out.println("음수");
//		}
		
		public static void main(String[] args) {
			System.out.println((float)0.1d==0.1000000f);
			double num = 0.1d;
			System.out.println("double타입: "+num);
			
			double d=(double)0.1f;
			System.out.println("float타입변경: "+d);
		}

	}

}
