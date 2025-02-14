package kg.surkeev.spring_course;

import javax.crypto.MacSpi;

//С архитектурой inversion of control
//IoC
public class MusicPlayer {
    private Music music;
    public MusicPlayer() {

    }
    //IoC //внедренная зависимость
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic(){
        System.out.println("Playing music " + music.getSong());
    }
}
