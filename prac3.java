package hello_java;
import java.util.Scanner;

public class prac3 {
	public static void main(String[] args) {
        // 키보드 입력을 받기 위한 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 반지름 입력 받기
        System.out.print("반지름을 입력하세요: ");
        double radius = scanner.nextDouble();

        // 원의 면적 계산
        double area = calculateCircleArea(radius);

        // 결과 출력
        System.out.println("원의 면적: " + area);

        // Scanner 객체 닫기
        scanner.close();
    }

    // 원의 면적을 계산하는 메소드
    public static double calculateCircleArea(double radius) {
        // 원의 면적 공식: π * r^2
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
}
