package p0619;

public class C0619_05_5 {

	public static void main(String[] args) {
		// [5,5]배열을 생성해서 1-25 숫자를 입력하고 랜덤으로 섞은후 출력하시오.
		int [][] arr= new int[5][5];
		
		// 2차원 배열 번호 넣기
		for(int i=0;i<5;i++) {
			for(int j=0; j<5;j++) {
				arr[i][j]=5*i+(j+1);//
			}
		
		}
		//2차원 배열 섞기
		int no =0;
		int no2=0;
		int t_value =0;
		for(int i=0; i<300;i++) {
			no=(int)(Math.random()*5);
			no2=(int)(Math.random()*5);
			t_value=arr[0][0];
			arr[0][0]=arr[no][no2];  //랜덤값을 0번째 배열에 입력
			arr[no][no2]=t_value;
		}
		
		//2차원배열 출력
		for(int i=0; i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.println();
			}
			System.out.println();
		
		}

	}

}
