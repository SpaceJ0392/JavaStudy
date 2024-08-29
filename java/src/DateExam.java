import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExam {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        //SimpleDateFormat 제공
        SimpleDateFormat ft = new SimpleDateFormat("yyyy.MM.dd a hh:mm:ss zzz");
        //월은 대문자, 분은 소문자 (a : 오전, 오후 나타냄, zzz : 한국 표준시)

        System.out.println(ft.format(date));

        //현재 시간을 long 값으로 표현
        System.out.println(date.getTime());
        //혹은
        System.out.println(System.currentTimeMillis());

        //시간 차 구하기
        System.out.println(System.currentTimeMillis() - date.getTime());

    }
}
