import java.util.Scanner;

public class SecondsToTime {
    public static void main(String[] args) {
        // 초 입력 받기
        Scanner scanner = new Scanner(System.in);
        System.out.print("초를 입력하세요: ");
        int totalSeconds = scanner.nextInt();
        scanner.close();

        // 시간, 분, 초 계산
        int hours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;

        // 결과 출력
        System.out.println(totalSeconds + "초는 " + hours + "시간 " + minutes + "분 " + seconds + "초입니다.");
    }
}