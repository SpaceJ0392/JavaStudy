package threadAndSharingObjects;

public class MusicBox {
    //public synchronized void play(int type){
    public synchronized void play(int type){
        for (int i = 0; i <10; i++) {

            synchronized (this) { // 정말 필요한 부분만 동기화하여 효율 증대
                System.out.println(type + "번 음악");
            }

            try {
                Thread.sleep((int) (Math.random() + 1000));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
