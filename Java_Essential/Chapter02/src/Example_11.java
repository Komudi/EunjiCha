import java.util.Scanner;

public class Example_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���̸� �Է��Ͻÿ�:");
		int age = scanner.nextInt();
		if((age>=20) && (age<30)) {
			System.out.print("20���Դϴ�.");
			System.out.println("20��� �ູ�մϴ�.");
			
		}
		else
			System.out.println("20�밡 �ƴմϴ�.");
		
		scanner.close();
		
		
	}

}
