import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();	//총금액
		int Y = sc.nextInt();	//총 종류개수
		int total = 0;			//계산 합계
		
		for(int i = 0; i < Y; i++) {
			int A = sc.nextInt();	//각 물건 가격
			int B = sc.nextInt();	//각 물건 개수
			total += (A * B);
		}
		if(total == X) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}//main
}