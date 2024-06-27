package p0618;

public class C0618_04loop {

	public static void main(String[] args) {
		// 구구단 4x4 =16 에서 멈추고싶다
		//반복문 for, while 에는 이름부여 가능.
		loop1:for(int i =2; i<=9;i++) {
			System.out.printf("[ %d단] \n",i);
			for(int j=1;j<=9; j++) {
				System.out.printf("%d X %d = %d \n", i,j,i*j);
				if(i ==4 && j==4) {
					break loop1;
				}
			}
		}

	}

}
