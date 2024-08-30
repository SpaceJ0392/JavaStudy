import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteIOExam01 {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("src/ByteIOExam01.java");
            fos = new FileOutputStream("byte.txt");

            int readData = -1;
            // FileInputStream의 경우 read() 메소드는 데이터를 1byte씩 읽어들인다.
            // read()는 정수형을 반환하므로, 정수형 4byte 중 마지막 1byte에 읽어들인 값을 반환한다.
            // byte를 리턴한다면 끝을 나타내는 값을 표현할 수가 없기 때문에, byte가 아닌 int를 리턴한다.
            // 음수의 경우 맨 좌측 비트가 1이 된다. 읽어들일 것이 있다면 항상 양수를 리턴한다고 볼 수 있다.
            while ((readData = fis.read()) != -1) { // 파일이 끝나면 -1 return.
                fos.write(readData);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
                fos.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
        // 운영체제상 기본적으로 512Byte의 데이터를 읽어온다. 근데 1Byte을 읽게 하면, 512를 가져와 1만 쓰고,
        // 버리길 반복하기 때문에 당연히 효율이 떨어진다.
    }
}
