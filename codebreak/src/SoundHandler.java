
import java.io.IOException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class SoundHandler {

    Clip clip;
    // current status of clip
    String status;
    AudioInputStream audioInputStream;
    static String filePath ;
    boolean loop;

    // constructor to initialize streams and clip
    public SoundHandler(String filePath, boolean loop)
            throws UnsupportedAudioFileException,
            IOException, LineUnavailableException {
        // create AudioInputStream object
        this.loop = loop;

        URL path = getClass().getResource(filePath);
        audioInputStream = AudioSystem.getAudioInputStream(path);

        // create clip reference
        clip = AudioSystem.getClip();

        // open audioInputStream to the clip
        clip.open(audioInputStream);

        //clip.loop(Clip.LOOP_CONTINUOUSLY);
    }


    public void play()
    {
        //start the clip
        clip.stop();
        clip.setMicrosecondPosition(0);
        clip.start();
        if (loop){
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        }
        status = "play";
    } // end play method

    public void stop() throws UnsupportedAudioFileException,
            IOException, LineUnavailableException
    {
        clip.stop();
        clip.close();
    } // end stop method


}
