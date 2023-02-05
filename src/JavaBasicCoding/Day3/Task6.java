package JavaBasicCoding.Day3;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert date in format [yyyy-MM-dd HH:mm:ss]: ");
        String inputDate = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        LocalDateTime nextLesson = LocalDateTime.parse(inputDate, formatter);

        LocalDateTime now = LocalDateTime.now();

        Duration duration = Duration.between(now, nextLesson);

        long day = duration.toDays();

        System.out.println("Time left to next lesson: " + day);
    }
}
