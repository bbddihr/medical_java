package p0619;

public class C0619_02 {

	public static void main(String[] args) {
		//1-45까지 로또번호생성해서, 랜덤으로 섞은 후 출력하시오.
	
		int [] arr=new int[45];
		for(int i=0;i<45;i++) {
			arr[i]=i+1;
			
		}
		int no=0;
		int t_value=0;
		for(int i=0;i<300;i++) {
			no=(int)(Math.random()*45);
			t_value=arr[0];
			arr[0]=arr[no];
			arr[no]=t_value;
			
		}
		for(int i=0; i<45;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}

}
