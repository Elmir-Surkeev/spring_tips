package kg.surkeev.spring_course;

import javax.crypto.MacSpi;
import java.util.ArrayList;
import java.util.List;

//С архитектурой inversion of control
//IoC
public class MusicPlayer {
    //    private List<Music> musicList = new ArrayList<>();
    private Music music;
//    private String name;
//    private int volume;

//    public MusicPlayer(Music music) {
//    }
//
//    public int getVolume() {
//        return volume;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setVolume(int volume) {
//        this.volume = volume;
//    }
//    public void setMusicList(List<Music> musicList) {
//        this.musicList = musicList;
//    }
//    public Music getMusic() {
//        return music;
//    }
//
//    public void setMusic(Music music) {
//        this.music = music;
//    }
    public MusicPlayer(Music music) {
        this.music = music;
    }

    //IoC //внедренная зависимость с помощью сеттера
//    public void setMusic(Music music) {
//        this.music = music;
//    }
    //IoC //внедренная зависимость с помощью конструктора
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }

    public void playMusic(){
        System.out.println("Playing music "+ music.getSong() );
//        for (Music music : musicList) {
//            System.out.println(music.getSong());
//        }
    }
}
