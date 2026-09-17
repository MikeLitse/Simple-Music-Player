
import javax.sound.sampled.*;
import java.util.*;
void main() {

    String filePath= "src\\This_Love.wav";
    File file = new File(filePath);

    try(AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file)){

        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);

        System.out.println("Not Problem detected");

    }
    catch(UnsupportedAudioFileException e){
        System.out.println("Unsupported Audio File");
    }
    catch(IOException e){
        System.out.println("IO Exception");
    }
    catch(LineUnavailableException e){
        System.out.println("Line Unavailable");
    }
    finally {
        System.out.println("Program Terminated");
    }

}
