package p0618;

import java.util.Scanner;

public class C0618_10f랜덤숫자맞추기 {

	public static void main(String[] args) {
		// 1-100까지 랜덤숫자를 생성해서, 랜덤숫자를 맞추는 프로그램을 구현하시오.
		//숫자를 입력해서 큰수를 입력하세요/작은수를 입력하세요.
		//10번까지 입력가능하도록 구현.
		
		//랜덤숫자:45
		//입력한 숫자:1 2 3 4 5 6 45
		
		Scanner scan=new Scanner(System.in);
		int[] input=new int[10];
		int r_num =(int)(Math.random()*100)+1; //1-100까지 랜덤숫자
		System.out.println("랜덤번호:"+r_num);
		int count =0;
		int num=0;
		while(count<10) { 
			System.out.println("숫자를 입력하세요.>>");
			num=scan.nextInt();
			
			//유효값 확인 
			if(num<1 || num>100) {
				System.out.println("1-100까지 숫자를 입력하세요.다시입력하시요");
				continue;
			}
			
			input[count] = num; //입력한 번호 저장
			count++;
			
			if(num>r_num) {
				System.out.println("입력한 숫자보다 작은수를 입력하세요");
			}else if(num<r_num){
				System.out.println("입력한 숫자보다 큰수를 입력하세요");
				
			}else{
				System.out.println("정답");
				
				break;
			}
		}
		System.out.println("랜덤 번호: "+r_num);
		System.out.print("입력 번호: ");
		for(int j=0;j<count;j++) {
			System.out.print(input[j]+" ");
		}
		
		System.out.println();
		//정답이 없을때 가장 근사치의 값을 출력시키기
		//input[]
		//Math.abs(r_num-input[0]):절대값
		
		int temp=0;  //값을 저장
		int arr_no = 0; //저장위치
		
		
		if(count==10) {
			int[] no= new int[10];   //배열생성
			for(int i =0; i<10;i++) {   //랜덤값-입력값
				
					no[i] = Math.abs(r_num - input[i]);   //배열 no[i]에 저장
			}
			
		
			
//			for(int i =0; i<10;i++) {
//				if(i==0) {
//					if(no[0]>=no[i]) {//43>=42
//						arr_no = i;
//						temp = no[i];
//					}else {
//						arr_no = 0;
//						temp = no[0];
//					}
//					continue;
//				}
			arr_no=0;
			temp=no[0];
			for(int i =0; i<10;i++) {
				if(temp>=no[i]) {
					arr_no =i;
					temp = no[i];
			}
		}
		System.out.println("근사치 값 1개:"+input[arr_no]);
		
		
		
		
		System.out.println("근사치 값:");
		for(int i=0;i<10;i++) {
			System.out.print(no[i]+" ");
		}
		System.out.println();
							
		}
	}
}

