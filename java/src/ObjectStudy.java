import java.util.Objects;

public class ObjectStudy {

    private String name;
    private int number;
    private int birthYear;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectStudy that = (ObjectStudy) o;
        return number == that.number;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(number);
    }

    @Override
    public String toString() {
        return "ObjectStudy{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", birthYear=" + birthYear +
                '}';
    }

    public static void main(String[] args) {
        ObjectStudy obj = new ObjectStudy();
        obj.name = "홍길동";
        obj.number = 1234;
        obj.birthYear = 1990;

        ObjectStudy obj2 = new ObjectStudy();
        obj2.name = "홍길동";
        obj2.number = 1234;
        obj2.birthYear = 1990;

        if (obj.equals(obj2)) System.out.println("obj == obj2");
        else System.out.println("obj != obj2");

        System.out.println(obj.hashCode() + " " + obj2.hashCode());
        System.out.println(obj); //obj.toString()도 호출 가능
    }
}