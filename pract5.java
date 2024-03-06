package hello_java;
import java.util.Scanner;

public class pract5 {
	public static void main(String[] args) {
        // 환율 상수 설정 (1달러 = 1,092.50원)
        final double EXCHANGE_RATE = 1092.50;

        // 키보드 입력을 받기 위한 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 달러 입력 받기
        System.out.print("달러를 입력하세요: ");
        double dollars = scanner.nextDouble();

        // 원화로 변환
        double won = dollars * EXCHANGE_RATE;

        // 결과 출력
        System.out.println(dollars + "달러는 " + won + "원 입니다.");

        // Scanner 객체 닫기
        scanner.close();
    }
}
