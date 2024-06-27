package p0619;

import java.util.Scanner;

public class C0619_01lotto {

	public static void main(String[] args) {
		//로또 프로그램 구현
		//1-45개 배열에서 랜덤으로 섞어, 그 가운데 6개를 가져오면 로또번호
		//입력한 입력번호 6개
		//당첨번호개수 배열, 카운트 변수
		//모든배열을 출력
		
		Scanner scan=new Scanner(System.in);
		
		//1.ball배열 1-45까지
		int[] ball = new int[45]; //0-44
		for(int i=0;i<45;i++) {
				ball[i] = i+1; //1-45
		}
		
		//2. ball 배열섞기
		int no =0;   //0번째 배열과 바꿀 배열번호
		int t_value =0;  //임시적으로 저장하는 공간
		for(int i=0; i<300;i++) {
			no=(int)(Math.random()*45);  //0-44
			t_value = ball[0];
			ball[0]=ball[no]; //랜덤값을 0번째 배열에 입력
			ball[no]=t_value;
		}
		
		//3.my_ball 입력-6개
		int[] my_ball = new int[6];
		for(int i=0;i<6;i++) {
			System.out.printf("%d번째 로또번호를 입력하세요.>>",i+1);
			my_ball[i] = scan.nextInt();
		}
		System.out.println();
		System.out.println("     [로또번호현황]");
		System.out.println("--------------------");
	
		System.out.println("입력번호: ");
		for(int i=0;i<6;i++) {
			System.out.printf("%3d",my_ball[i]);
		}
		System.out.println();
		
		
		
		//5. ball 배열 출력
		System.out.print("로또번호: ");
		for(int i=0; i<6; i++) {
			System.out.printf("%3d",ball[i]);
		}
		System.out.println();
		
		
		//6.당첨개수
		//2개 for문 사용- ball[] my_ball[] 비교
		int[] lotto = new int[6];
		int count=0;
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if (ball[i] == my_ball[j]){
					lotto[count] = ball[i];
					count++;
					break;
				}
			}
		}
		System.out.printf("당첨갯수: %d \n",count);
		
		
		
		//7.당첨번호 출력
		System.out.printf("당첨번호: ");
		for(int i=0; i<count;i++) {
			System.out.printf("%4d",lotto[i]);
		}
		if(count ==0) {
			System.out.println("없음");
		}
		System.out.println();
		
//		//입력
//		int[][] arr=new int[5][5];    //1-25
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				arr[i][j]=5*i+(j+1);    //1,
//			}
//		}
//			//출력
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//			System.out.println(arr[i][j]+ "\t");
//			}
//			
//	}

}
}