package p0614;

import java.util.Scanner;

//import java.util.Scanner;
public class C0614_09 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int sca = 0;
		
		//두 숫자를 입력받아, 덧셈,뺄셈, 곱셈,나눗셈을 출력하시오.
		System.out.println("숫자1를 입력하세요.");
		int number = scan.nextInt();
		System.out.println("숫자2를 입력하세요");
		int number2 = scan.nextInt();
		
		System.out.println("덧셈: "+(number+number2));
		System.out.println("뺄셈: "+(number-number2));
		System.out.println("곱셈: "+(number*number2));
		System.out.println("나눗셈: "+(number/number2));

	}

}
