package p0618;

import java.util.Arrays;

import java.util.Scanner;

public class C0618_05배열입력출력2 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
	//	int score[] = new int[5];
		int[] score = new int[5];
//		score[0] = 1;
//		score[1] = 2;
//		score[2] = 3;
//		score[3] = 4;
//		score[4] = 5;
		
		//배열에 입력
		for(int i =0;i<5;i++) {
			score[i]=i+1;
		}
//		for(int i =0;i<5;i++) {
//			System.out.println("숫자를 입력하세요.");
//			score[i] = scan.nextInt();
//		}
		
		//(toString() 을 사용하면) 배열의 내용이 아니라 배열의 주소값이 출력된다. 
		//[I@5f2050f6
		
		//배열의 내용출력하려면 Arrays.toString(score)
		System.out.println(score);  //score 주소값 
		System.out.println(Arrays.toString(score));  //배열의 모든 데이터 확인 메소드
		
		//배열출력
		for(int i =0;i<5;i++) {
			System.out.println(score[i]); 
		}    //1,2,3,4,5
		
		
		// 5개의 숫자를 모두 입력 받을 후, 출력을 모두 하시오?
		// 3번째 숫자만 출력?
//		Scanner scan = new Scanner(System.in);
//		int n=scan.nextInt("숫자를 입력하세요");
//		int n2=scan.nextInt("숫자를 입력하세요");
//		int n3=scan.nextInt("숫자를 입력하세요");
//		int n4=scan.nextInt("숫자를 입력하세요");
//		int n5=scan.nextInt("숫자를 입력하세요");
//		
//		for(int i=0; i<6;) {
//			System.out.println(input);
			
//		}
		
	}
}

