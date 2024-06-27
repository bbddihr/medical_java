package p0617;

public class C0617_02 {
	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		System.out.print(a/(double)b);
		System.out.println(10/3.0);   
		System.out.printf("%.2f \t",10/3.0);  //3.33 //  \n,\t
		System.out.println("aaa");
		
		System.out.printf("%x  \n",15);  //16진수
		System.out.printf("%o  \n",15);  //8진수
		System.out.printf("%s  \n",Integer.toBinaryString(15));  //2진수=문자열변경
	}
}
