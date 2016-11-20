import java.util.Scanner;

public class HighestNumber {
public static void main(String[] args) {
	
	int max12;
	int max;
	
	System.out.println("Give 3 number: ");
	Scanner s = new Scanner(System.in);
	
	int num1 = s.nextInt();
	int num2 = s.nextInt();
	int num3 = s.nextInt();
	
	if (num1 > num2) {
		max12 = num1;
	}
	else{
		max12 = num2;
	}
	
	if (max12 > num3) {
		max = max12;
	}
	else{
		max = num3;
	}
	System.out.println("Highest number is : " +max);
}
}
