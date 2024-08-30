import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TimeExam {
    public static void main(String[] args) {
        LocalDateTime timePoint = LocalDateTime.now(); //현재 시간
        System.out.println(timePoint);

        LocalDate timePoint2 = LocalDate.of(2024, Month.JANUARY, 1);
        System.out.println(timePoint2);

        LocalTime timePoint3 = LocalTime.of(0,0);
        System.out.println(timePoint3);

        LocalTime timePoint4 = LocalTime.parse("00:00:00");
        System.out.println(timePoint4);

        //Getter 활용
        System.out.println(timePoint.toLocalDate());
        System.out.println(timePoint.getMonth().getValue());
        System.out.println(timePoint2.getMonth());
    }
}
