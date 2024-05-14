import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();

		for(int i = 1; i<=X ; i++) {
			
			int Y = sc.nextInt();
			int Z = sc.nextInt();
			
			
			System.out.println(Y + Z);
		}
	}//main
}