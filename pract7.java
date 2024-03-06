package hello_java;
import java.util.Scanner;

public class pract7 {



	    public static void main(String[] args) {
	        // 키보드 입력을 받기 위한 Scanner 객체 생성
	        Scanner scanner = new Scanner(System.in);

	        // 책권 값 입력 받기
	        int bookCount = 0;

	    
            System.out.print("보유하고 있는 책권 값: ");
            bookCount = scanner.nextInt();

            if (bookCount < 0) {
                System.out.println("잘못 입력했습니다.");
            } else if (bookCount == 0) {
                System.out.println("보유하고 있는 책 없음");
            } else {
                System.out.println(bookCount + " book" + (bookCount > 1 ? "s" : ""));
            }


	        // Scanner 객체 닫기
	        scanner.close();
	    }

}
