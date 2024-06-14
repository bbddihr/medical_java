package p0614;

public class C0614_07 {

	public static void main(String[] args) {
		
		//printf 의 출력
		//소수점 제한 출력 
		System.out.println(10.0/3);  //10.0은 double//3.333333333333335 15자리까지출력후
		System.out.printf("%.2f \n",10.0/3);  //printf //3.33  //줄단락을 입력해야함
		int x = 0X1a;   //16진수 표현 1a 값은? 1X16+0X160 =16
		System.out.println("x: "+x);  //26
		System.out.printf("%X \n", x);  //printf 16진수 출력 가능 //1A
		
//		double a = 10d;
		System.out.println("x: "+x);
		System.out.printf("%d \n", x);  //printf 16진수 출력 가능
		
		long a =10L;
		System.out.printf("%d \n", a);
		int b =20;
		System.out.printf("%d \n", b);
		
		int age = 10;
		int year= 2014;
		System.out.printf("나이 : %d 세, 년도: %d 년 \n",age,year);
		System.out.println("나이 : "+age+"세, 년도: "+year+" 년");
		
		System.out.printf("[%5d]]",10);
		System.out.printf("[%-5d]]",10);  //앞에서부터 출력
	}

}
