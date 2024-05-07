import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		
		if(X%4 == 0 && (X%100 != 0 || X%400 == 0)) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}//main
}
