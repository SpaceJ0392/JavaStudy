import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class ByteIOExam03 {
    public static void main(String[] args) {
        //try-with-resources
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt"))) {
            dos.writeInt(100);
            dos.writeBoolean(true);
            dos.writeDouble(50.1);
        }catch (Exception e) {e.printStackTrace();}
    }
}
