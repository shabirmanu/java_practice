package hello_java;
import java.util.Scanner;

public class pract4 {
	public static void main(String[] args) {
        // 키보드 입력을 받기 위한 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 정수 입력 받기
        System.out.print("정수를 입력하세요: ");
        int dividend = scanner.nextInt();

        // 나눌 수 입력 받기
        System.out.print("나눌 수를 입력하세요: ");
        int divisor = scanner.nextInt();

        // 몫과 나머지 계산
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        // 결과 출력
        System.out.println("몫: " + quotient);
        System.out.println("나머지: " + remainder);

        // Scanner 객체 닫기
        scanner.close();
    }
}
