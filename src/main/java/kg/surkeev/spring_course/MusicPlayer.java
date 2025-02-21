package kg.surkeev.spring_course;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
//С архитектурой inversion of control
//IoC

@Component
public class MusicPlayer {

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }


    public String playMusic(){
      return "Playing" + classicalMusic.getSong() ;
    }
}
