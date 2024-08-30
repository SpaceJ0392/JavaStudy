package threadAndSharingObjects;

public class MusicPlayer extends Thread {
    private final int type;
    private final MusicBox musicBox;

    public MusicPlayer(int type, MusicBox musicBox) {
        this.type = type;
        this.musicBox = musicBox;
    }

    public void run(){
        MusicBox musicBox = this.musicBox;
        musicBox.play(type);
    }
}
