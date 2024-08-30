import java.io.DataInputStream;
import java.io.FileInputStream;

public class ByteIOExam04 {
    public static void main(String[] args) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"))){
            // 파일에 저장된 순서대로 읽어 들여야한다.
            // int, boolean, double순서대로 저장하였기 때문에 읽어들일 때도 같은 순서로 읽어여야 한다.
            System.out.println(dis.readInt());
            System.out.println(dis.readBoolean());
            System.out.println(dis.readDouble());
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
