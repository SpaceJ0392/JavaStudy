import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteIOExam02 {

    public static void main(String[] args) {
        // 파일로 부터 512byte씩 읽어들여 파일에 512byte씩 저장하는 프로그램을 작성 //
        // 1byte 가 아닌 512byte를 읽으므로 훨씬 효율적일 것.
        long startTime = System.currentTimeMillis();
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("src/ByteIOExam02.java");
            fos = new FileOutputStream("byte.txt");

            int readCnt = -1;
            byte[] buffer = new byte[512];
            while ((readCnt = fis.read(buffer)) != -1) { // 파일이 끝나면 -1 return.
                fos.write(buffer, 0, readCnt);
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
