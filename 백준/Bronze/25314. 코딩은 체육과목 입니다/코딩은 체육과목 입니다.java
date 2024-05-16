import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();	
		int Y = 0;
		Y= X/4;
		
		for(int i = 0; i < Y; i++) {
			System.out.print("long ");
		}
		System.out.println("int");
		
	}//main
}