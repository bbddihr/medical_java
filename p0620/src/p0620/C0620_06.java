package p0620;

public class C0620_06 {

	public static void main(String[] args) {
		int a = 10;
		int b = 5 ;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println((a+1)+(b+1));
		System.out.println((a+1)-(b+1));
		System.out.println((a+1)*(b+1));
		System.out.println((a+1)/(b+1));

		
		int num = 0;
		int num2 =10;
		num2=num;
		
		
		//객체선언
		Tv t1= new Tv();
		Tv t2= new Tv();
		// 0
		System.out.println("t2 ch: "+t2.channel);
//		t2 = t1;   //이렇게 복사하면 안됨
//		t1.channel=7;
		
		
		
		
		//Class는 객체선언꼭해야한다
//		Tv t = new Tv();
//		//참조변수명.변수명 값을 넣을 수 있음.
//		t.channel = 7;
//		t.channelUp();
//		System.out.println("현재채널: "+t.channel);//8
//		t.channelDown();  //7
//		t.channelDown();  //6
//		System.out.println("현재채널: "+t.channel);
	}

}

