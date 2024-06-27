package p0618;
import java.util.Random;
import java.util.Scanner;

public class C0618_11GPT근사치 {

	public static void main(String[] args) {
	

		        Random rand = new Random();
		        int randomNumber = rand.nextInt(100) + 1; // 1부터 100까지의 랜덤 숫자 생성
		        Scanner scan = new Scanner(System.in);
		        int attempts = 10;
		        int closestGuess = -1;
		        int closestDifference = 100;

		        System.out.println("1-100 사이의 숫자를 맞춰보세요!");

		        for (int i = 0; i < attempts; i++) {
		            System.out.print((i + 1) + "번째 시도: ");
		            int userGuess = scan.nextInt();

		            if (userGuess == randomNumber) {
		                System.out.println("정답입니다! " + (i + 1) + "번째 시도에서 맞췄습니다.");
		                return;
		            } else {
		                if (userGuess > randomNumber) {
		                    System.out.println("작은 수를 입력하세요.");
		                } else {
		                    System.out.println("큰 수를 입력하세요.");
		                }

		                int difference = Math.abs(randomNumber - userGuess);
		                if (difference < closestDifference) {
		                    closestDifference = difference;
		                    closestGuess = userGuess;
		                }

		                if (i == attempts - 1) {
		                    System.out.println("기회를 모두 사용하였습니다. 정답은 " + randomNumber + "였습니다.");
		                    System.out.println("가장 근사치 값은 " + closestGuess + "입니다.");
		                }
		            }
		        }
		        
		        scan.close();
		    }

	}

