import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		if( Y > 44 && Y < 60) {
			System.out.print(X + " ");
			System.out.print(Y - 45);
		}else if(Y > -1  && Y < 45) {
			if(X == 0) {
				X = 24;
			}
			System.out.print((X-1) + " ");
			System.out.print(60-(45-Y));
		}
	}//main
}