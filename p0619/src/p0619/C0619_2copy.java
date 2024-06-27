package p0619;

public class C0619_2copy {

	public static void main(String[] args) {
		//1-25까지 번호넣고 랜덤으로 섞은후 출력
		//[5,5] 출력
		int[][] arr= new int[5][5];
		
		//2차원 번호넣기
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				arr[i][j] = 5*i+j;	
			}
		}
		//2차원 배열 섞기
		int no=0;
		int no2=0;
		int t_value=0;
		for(int i=0;i<300;i++) {
			no=(int)(Math.random()*45);
			t_value = arr[0][0];
			arr[0][0] = arr[no][no2];
			arr[no][no2]=t_value;
		}
		//-------------------
//		
//		int [] ball=new int[25];
//		for(int i=0;i<25;i++) {
//			ball[i]=i+1;
//		}
//		int no=0;
//		int t_value=0;
//		for(int i=0;i<300;i++) {
//			no=(int)(Math.random()*45);
//			t_value=ball[0];
//			ball[0]=ball[no];
//			
//		}
//		
//		
//		
		//1-45까지 로또번호생성해서, 랜덤으로 섞은 후 출력하시오.
	
//		int [] arr=new int[45];
//		for(int i=0;i<45;i++) {
//			arr[i]=i+1;
//			
//		}
//		int no=0;
//		int t_value=0;
//		for(int i=0;i<300;i++) {
//			no=(int)(Math.random()*45);
//			t_value=arr[0];
//			arr[0]=arr[no];
//			arr[no]=t_value;
//			
//		}
//		for(int i=0; i<45;i++) {
//			System.out.println(arr[i]+" ");
//		}
//		System.out.println();
	}

}
