package p0618;

import java.util.Scanner;

public class C0618_13 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String[] name=new String[3];
		int[][] score= new int[3][3];
		String[] title = {"이름","국어","영어","수학"};
		
		for(int i=0; i<score[i].length;i++) {
			System.out.println(title[0]+"을 입력하세요");
			name[i]=scan.next();
			for(int j=0;j<score[j].length;j++) {
				System.out.println(title[i]+"점수를 입력하세요.");
				score[i][j] = scan.nextInt();
			}
		}
		
		for(int i=0;i<3;i++) {
			System.out.println(title[i]+"\t");
		}
		System.out.println();
		System.out.println("-----------------------");
		
		for(int i=0;i<2;i++) {
			System.out.print(name[i]+"\t");
			for(int j=0;j<3;j++) {
				System.out.println(score[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	}

}
