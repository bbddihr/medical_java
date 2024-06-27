package p0619;

public class C0619_lotto_copy {

	public static void main(String[] args) {
		//로또 프로그램 구현
		//1-45개 배열에서 랜덤으로 섞어, 그 가운데 6개를 가져오면 로또번호
		//입력한 입력번호 6개
		//당첨번호개수 배열, 카운트 변수
		//모든배열을 출력
		
		//1.ball배열 1-45까지
		int[] ball = new int[25]; //0-44
		for(int i=0;i<25;i++) {
				ball[i] = i+1; //1-5
		}
		for(int i=0; i<25; i++) {
			System.out.println(ball[i]+" ");
		}
		System.out.println();
		
		//입력
		int[][] arr=new int[5][5];    //1-25
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=5*i+(j+1);    //1,
			}
		}
			//출력
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
			System.out.println(arr[i][j]+ "\t");
			}
			
	}

}
}