package p0620;

import java.util.Arrays;
import java.util.Scanner;

public class C0620_01학생성적 {

	public static void main(String[] args) {
		// lotto, 학생성적프로그램
		Scanner scan=new Scanner(System.in);
		String[] score= new String[45];
		for(int i=0; i<score.length;i++) {
			score[i] =i+1+"";
		}
		System.out.println(Arrays.toString(score));
		
		//2차원 배열 생성값 입력
		String[][] arr=new String[5][5];
		//1-25까지의 숫자를 넣고 배열을 섞기하고, for문으로 출력하시오.
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=5*i+j+1+"";
			}
		}
		
		//2차원 배열 섞기
		int no=0, no2=0;
		String t_value="";
		for(int i=0;i<500;i++) {
			no=(int)(Math.random()*5);
			no2=(int)(Math.random()*5);
			//
			t_value = arr[0][0];
			arr[0][0]=arr[no][no2];
			arr[no][no2]=t_value;
			
		}
		int count=0;  //번호입력 횟수
		
		//2차원 배열 출력
		while(true) {
			System.out.println("        [2차원배열출력]");
			System.out.println("----------------------------");
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++) {
					System.out.print(arr[i][j]+"\t");
				}
				System.out.println();
			}
			System.out.println("-----------------------------------");
			
			if(count==25) {
				System.out.println("25번의 x표시가 완료되었습니다.");
				System.out.println("[프로그램 종료]");
				break;
			}
			System.out.println("1-25사이 숫자를 입력하세요>>");
			int input = scan.nextInt();
			//입력숫자가 1-25벗어나면 잘못입력했습니다 출력하기 
			if(input<0||input>25) {
				System.out.println("1-25 까지의 숫자만 입력가능합니다. 다시입력하세요.>");
				System.out.println();
				continue;
			}
			
			//1-25까지의 숫자를 넣으면 x표시가 나타나도록 구현하기
			String input_str=input+"";
			int temp=0;
			for(int i=0;i<arr.length;i++) {
				for(int j=0; j<arr[i].length;j++) {
					if(arr[i][j].equals(input_str)) {
						arr[i][j] = "X";
						temp=1;
						count++;
					}
				}
			}
			if(temp==0) {
				System.out.printf("%s번은 입력된 숫자입니다. 다시 입력하세요.",input_str);
				System.out.println();
			}
			System.out.println();
		}
	}
}
