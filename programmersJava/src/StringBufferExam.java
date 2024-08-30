public class StringBufferExam {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");

        String sbString = sb.toString();
        System.out.println(sbString);

        StringBuffer sb2 = new StringBuffer();
        StringBuffer sb3 = sb2.append("Hello");

        if (sb2 == sb3) System.out.println("sb2 == sb3"); // == 으로 같은 객체인지 비교.


        //Method Chaining 방식을 통한 StringBuffer 활용
        String ex1 = new StringBuffer().append("hello").append(" ").append("world").toString();
        System.out.println(ex1);
    }
}
