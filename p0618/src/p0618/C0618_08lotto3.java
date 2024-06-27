package p0618;

import java.util.Scanner;

public class C0618_08lotto3 {

	public static void main(String[] args) {
		// 로또번호 생성
		//1-45 -6개 뽑기. 중복없이; 45개 숫자 섞은후 앞에서부터 6개
		
		Scanner scan=new Scanner(System.in);
	
		int [] lotto=new int[45];
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=i+1;
		}
		
		int no=0;
		int temp=0;
		
		for(int i=0;i<300;i++) {
			no=(int)(Math.random()*45);
			temp=lotto[0];
			lotto[0]=lotto[no];
			lotto[no]=temp;
				
		}
		int [] myArr=new int[6];
		for(int i=0;i<myArr.length;i++) {
			System.out.printf("%d번째 숫자를 입력하세요.(1-45까지 숫자입력)>>", i+1);
			myArr[i] = scan.nextInt();
		}
		System.out.print("입력한 숫자: ");
		for(int i=0; i<myArr.length;i++) {
			System.out.print(myArr[i]+" ");
		}
		System.out.println();
		
		System.out.print("로또번호: ");
		for(int i=0; i<6;i++) {
			System.out.print(lotto[i]+ " ");
		}
		System.out.println();
}
}
