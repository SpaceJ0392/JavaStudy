import java.util.Calendar;

public class CalendarExam {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance(); // 추상 클래스임
        //추상화를 통해 다른 형식의 달력이 나타났을 경우, 쉽게 기존 코드를 활용할 수 있게 구현

        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH) + 1); //0부터 시작
        System.out.println(cal.get(Calendar.DATE));

        System.out.println(cal.get(Calendar.HOUR));
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));
        // HOUR : 12시로 표현, HOUR_OF_DAY : 24시로 표현

        System.out.println(cal.get(Calendar.MINUTE));
        System.out.println(cal.get(Calendar.SECOND));

        cal.add(Calendar.DATE, -29); //시간에 연산 가능
        System.out.println("cal.DATE : " + cal.get(Calendar.DATE));
    }
}
