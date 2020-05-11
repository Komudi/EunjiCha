import java.util.Scanner;

public class Example_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요(0~100)");
		int score = scanner.nextInt();
		if(score >= 90)
			grade = 'A';
		if(score >= 80)
			grade = 'B';
		if(score >= 70)
			grade = 'C';
		if(score >= 60)
			grade = 'D';
		else
			grade = 'F';
		
		System.out.println("학점은 " + grade + "입니다.");
		scanner.close();
		
		
	}

}
