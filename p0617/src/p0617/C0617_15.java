package p0617;

import java.util.Scanner;

public class C0617_15 {

	public static void main(String[] args) {
		
		//1-10 랜덤숫자생성해서, 숫자 1개를 입력받아 정답인지 아닌지 출력하시오. 같으면 당첨, 다르면 꽝 출력
		Scanner scan= new Scanner(System.in);
		int num=(int)(Math.random()*10)+1;
		
		System.out.println("숫자를 입력하세요>");
		int input=scan.nextInt();
		
		if(num==input) {
			System.out.println("당첨");
		}else {
			System.out.println("꽝");
		}
				
		
//		Math.random();  //0.0<= x && x <1.0
//		System.out.println(Math.random());
//		//1-100 숫자를 랜덤생성해서 출력
//		int number=(int)(Math.random()*100)+1;
//		System.out.println();
//		
//		//1-3 랜덤숫자
//		int number2=(int)(Math.random()*3)+1;
//		
//		//1-45
//		int number3=(int)(Math.random()*45)+1;
//		
//		//0-10 까지
//		int n =(int)(Math.random()*11);
//		
//		//2-10까지
//		int n2=(int)(Math.random()*10)+2;
//		
//		//1-10 까지 랜덤숫자 출력
//		int num = (int)(Math.random()*10)+1;
//		System.out.println(num);
//		
//		//0-9까지 랜덤  
//		int n3 =(int)(Math.random()*10);
//		
//		//1-100까지 랜덤생성 출력
//		int num2=(int)(Math.random()*100)+1;
//		System.out.println(n);
//		
//		//0-4까지 추력    
//		int num3=(int)(Math.random()*5);
//		//0-19
//		int num4 = (int)(Math.random()*20);
		
	}

}
