package armstrong;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		double number=scanner.nextDouble();
		System.out.println("Enter the number of digits: ");
		double digit=scanner.nextDouble();
		double temp=number;
		int sum=0;
		
		do {
			int digitValue=(int) (temp%10);
			temp=temp/10;
			
			sum=(int) (sum+ Math.pow(digitValue, digit));
		} while(temp>0);
		if (number==sum) {
			System.out.println("Armstrong number!");
		}
		else {
			System.out.println("Not an armstrong number!");
		}
	}

}
