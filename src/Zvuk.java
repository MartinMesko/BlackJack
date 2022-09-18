import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.net.URL;

public class Zvuk {
    Clip clip;

    URL zvukURL[] = new URL[10];

    /**
     * Zastresuje zvuky do URL aby to bolo vsetko na jednom mieste
     */
    public Zvuk() {
        zvukURL[0] = getClass().getResource("zvuky/ambientCasino.wav");
        zvukURL[1] = getClass().getResource("zvuky/bbb.wav");
        zvukURL[2] = getClass().getResource("zvuky/tada.wav");
        zvukURL[3] = getClass().getResource("zvuky/trombon.wav");

    }

    public void nastavSubor(int i){
        try {

            AudioInputStream ais = AudioSystem.getAudioInputStream(zvukURL[i]);
            clip = AudioSystem.getClip();
            clip.open(ais);

        }catch (Exception e){
        }
    }

    public void hraj(){
        clip.start();
    }
    public void loop(){
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }
    public void zastav(){
        clip.stop();
    }
}
