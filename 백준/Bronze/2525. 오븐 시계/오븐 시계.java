import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();
		
		if(Y + Z < 60) {
			System.out.print(X + " ");
			System.out.print(Y + Z);
		}else if(Y + Z == 60) {
			X = X + 1;
			if(X > 23) {
				X = X%24;
			}
			System.out.println(X  + " " + 0);
		}else if(Y + Z > 60) {
			X = X + (Y + Z)/60;
			if(X > 23) {
				X = X%24;
			}
			System.out.print(X  + " ");
			System.out.print((Y + Z)%60);
		}
	
	}//main
}