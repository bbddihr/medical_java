package p0618;

import java.util.Arrays;

public class C0618_06배열초기화 {

	public static void main(String[] args) {
		
		//int 배열 10개 선언해서 1,3,5,7,9 .... 10개 입력해서 출력하시오.
		
		int[] score = new int[10];
		for(int i =0; i<score.length;i++) {
			score[i] = 2*i+1;
		
		}
		System.out.println(Arrays.toString(score));
		
		
		
		
//		int [] score= new int[10];
//		System.out.println(Arrays.toString(score));
		//[0,0,0,0,0,0,0,0,0,0,0]

		
	
//		int[] score = new int[0];
//		for(int i=0; i<20; i++) {
//			score[i]=2*i+1;
//		}
//		System.out.println(Arrays.toString(score));
//				
		
		
//1.	int[] score = new int[10];
//		for(int i=0; i<10; i++) {
//			score[i]=2*i+1;
//		}
//		System.out.println(Arrays.toString(score));
//		
		
//		//배열 선언-주소 0부터 시작 ******************************
//		int [] score = new int[5];
//		//초기화
//		score[0] =1;
//		score[1] =2;
//		score[2] =3;
//		score[3] =4;
//		score[4] =5;
//		
//		//배열 선언 - 초기화**********************************
//		int[] sc = {1,2,3,4,5};   
//		
//		//위 두가지방법 많이 씀.
//		
//		
//		//배열선언 - 초기화
//		int[] sc2 = new int[] {1,2,3,4,5};
//		
//		//배열 선언 - 초기화
//		int[] s =new int[5];
//		for(int i=0;i<5;i++) {
//			score[i] = i+1;
//		}

	}

}
