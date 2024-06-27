package p0619;

import java.util.Scanner;

public class C0619학생성적 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//3명 학생 - 국어,영어,수학
		String[] stuNo = new String[3]; //학번
		String[] name = new String[3];  //이름
		int[][] score = new int[3][4];  //국어,영어,수학,합계
		double[] avg = new double[3];   //평균
		int[] rank = new int[3];        //등수
		String[] title = {"학번","이름","국어","영어","수학","합계","평균","등수"};
		
		//----- 프로그램 실행 -----
		Loop1:while(true) {
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("0. 프로그램 종료");
			System.out.println("-------------------------");
			System.out.println("원하는 번호를 입력하세요.>> ");
			int choice = scan.nextInt(); // 1  enter키
			scan.nextLine();
			int s_count = 0;
			switch(choice) {
			case 1:
				System.out.println("[ 성적입력 ]");
				// 학번-stu0001 S,이름-S,국어-i,영어-i,수학-i,합계-i,평균-d,등수-i
				System.out.println("학번을 입력하세요.>> ");
				stuNo[s_count] = scan.nextLine();
				System.out.println("이름을 입력하세요.>> ");
				name[s_count] = scan.nextLine();
				//점수입력
				for(int i=0;i<3;i++) {
					System.out.printf("%s 점수를 입력하세요.>> ",title[i+2]);
					score[s_count][i] = scan.nextInt();
				}
				
				//합계,평균
				score[s_count][3] = score[s_count][0]+score[s_count][1]+score[s_count][2];
				avg[s_count] = score[s_count][3]/3.0;
				
				
				
				// 학생입력한 데이터출력
				for(int i=0;i<title.length;i++) {
					System.out.print(title[i]+"\t");
				}
				System.out.println();
				System.out.println("-----------------------------------------------------------");
				System.out.print(stuNo[s_count]+"\t");
				System.out.print(name[s_count]+"\t");
				System.out.printf("%d\t%d\t%d\t",score[s_count][0],score[s_count][1],score[s_count][2]);
				System.out.printf("%d\t%.2f\t",score[s_count][3],avg[s_count]);
				System.out.printf("%d\n",rank[s_count]);
				System.out.println();
				s_count++;
				break;
				
				
			case 2:
				System.out.println("[ 성적출력 ]");
				
				
				System.out.println();
				break;
				
			case 0:
				System.out.println("[ 프로그램 종료 ]");
				System.out.println("프로그램을 종료합니다!!");
				break Loop1;
			}//switch
		}//while
		
		
		
	}//main
}//class