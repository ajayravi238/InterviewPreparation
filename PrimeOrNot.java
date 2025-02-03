import java.util.Scanner;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num == 0 || num == 1) {
			System.out.println(num + " is not a prime number");
		}
		int flag = 0;
		for(int i=2; i<num; i++) {
			if(num%i == 0) {
				System.out.println(num + " is not a prime number");
				flag = 1;
				break;
			}
		}
		if(flag == 0) {
			System.out.println(num + " is prime number");
		}
		
	}

}
