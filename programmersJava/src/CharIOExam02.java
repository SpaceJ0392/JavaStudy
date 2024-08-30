import java.io.*;

public class CharIOExam02 {
    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter pw = null;
        try {
            br = new BufferedReader(new FileReader("src/CharIOExam02.java"));
            pw = new PrintWriter(new FileWriter("test.txt"));
            // PrintWriter는 FileWriter에 대한 생성자를 제공해 이 경우는 그냥 출력할 파일 이름만 지정해 줘도 된다.

            String line = null;
            while((line = br.readLine()) != null) {
                pw.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try { // 만약 close()하지 않으면, test.txt는 작성되지 않을 것!
                br.close();
                pw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
