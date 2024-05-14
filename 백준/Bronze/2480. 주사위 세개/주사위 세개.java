import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();
		
		if(X == Y && Y == Z) {
			System.out.println(10000 + (X * 1000));
		}else if(X == Y || Y == Z ) {
			System.out.println(1000 + (Y * 100));
		}else if(X == Z) {
			System.out.println(1000 + (X * 100));
		}else if(X != Y && Y != Z && X != Z) {
			int max = Math.max(Z,Math.max(X, Y));
			System.out.println(max * 100);
		}
	}//main
}