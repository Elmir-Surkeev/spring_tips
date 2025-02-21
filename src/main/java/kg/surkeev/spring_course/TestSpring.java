package kg.surkeev.spring_course;

import org.springframework.context.support.ClassPathXmlApplicationContext;;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Music music = context.getBean("rockMusic", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(music);

        musicPlayer.playMusic();
        Music music2 = context.getBean("classicalMusic", Music.class);

        MusicPlayer musicPlayer2 = new MusicPlayer(music2);

        musicPlayer2.playMusic();

//        ClassicalMusic classicalMusic = (ClassicalMusic) context.getBean("classicalMusic");


//        KyrgyzMusic kyrgyzMusic = context.getBean("musicTaskBean", KyrgyzMusic.class);
//        KyrgyzMusic second_kyrgyzMusic = context.getBean("musicTaskBean", KyrgyzMusic.class);
//        System.out.println(kyrgyzMusic.getSong());
//        System.out.println(second_kyrgyzMusic.getSong());

//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer second_musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        //we use method comparison with boolean value, because we need to check bean by link (Object)
//        boolean comparison = musicPlayer == second_musicPlayer;
//        System.out.println(comparison);

        //Also we can check with hash code (when we use toString default value)
//        System.out.println(musicPlayer);
//        System.out.println(second_musicPlayer);

        ///////////////Check change value by link, when our scope = singleton

        //Before we changed default value singleton to prototype/z7
//        musicPlayer.setVolume(23);
//        System.out.println(musicPlayer.getVolume());
//        System.out.println(second_musicPlayer.getVolume());

//        musicPlayer.playMusic();
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
        context.close();
    }

}
