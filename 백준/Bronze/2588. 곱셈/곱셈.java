import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		int A = Y%10;
		int B = Y/10%10;
		int C = Y/100;
		
		int AA = X*A;
		int BB = X*B;
		int CC = X*C;
		int DD = X*Y;
		
		System.out.println(AA);
		System.out.println(BB);
		System.out.println(CC);
		System.out.println(DD);

	}
}