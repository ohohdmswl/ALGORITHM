import java.util.Scanner;

public class Main  {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		
		if(X >= 90) {
			System.out.println("A");
		}else if(X >= 80) {
			System.out.println("B");
		}else if(X >= 70) {
			System.out.println("C");
		}else if(X >= 60) {
			System.out.println("D");
		}else if(X < 60) {
			System.out.println("F");
		}
	}//main
}