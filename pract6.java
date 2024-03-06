package hello_java;
import java.util.Scanner;
public class pract6 {
	public static void main(String[] args) {
        // 키보드 입력을 받기 위한 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 물건값 입력 받기
        System.out.print("물건값을 입력하세요: ");
        int itemPrice = scanner.nextInt();

        // 지불할 금액 입력 받기
        System.out.print("지불할 금액을 입력하세요: ");
        int payment = scanner.nextInt();

        // 거스름돈 계산
        int change = payment - itemPrice;

        // 거스름돈을 1000원, 500원, 100원, 50원, 10원으로 나누어 개수 계산
        int num1000 = change / 1000;
        int num500 = (change % 1000) / 500;
        int num100 = (change % 500) / 100;
        int num50 = (change % 100) / 50;
        int num10 = (change % 50) / 10;

        // 결과 출력
        System.out.println("거스름돈: " + change + "원");
        System.out.println("1000원 짜리: " + num1000 + "개");
        System.out.println("500원 짜리: " + num500 + "개");
        System.out.println("100원 짜리: " + num100 + "개");
        System.out.println("50원 짜리: " + num50 + "개");
        System.out.println("10원 짜리: " + num10 + "개");

        // Scanner 객체 닫기
        scanner.close();
    }
}
