import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME) // RUNTIME 시 어노테이션 감지 (JVM이 실행 시 감지)
public @interface Count100 {

}
