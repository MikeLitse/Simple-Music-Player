
import javax.sound.sampled.*;
import java.util.*;
void main() {

    String filePath= "src\\This_Love.wav";
    File file = new File(filePath);

    try(Scanner scanner = new Scanner(System.in);
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file)){

        //Clip object to start the audio
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);

        String response="";
        //While to display what the user can input
        while(!response.equals("Q")){
            System.out.println("P = Play");
            System.out.println("S = Stop");
            System.out.println("R = Reset");
            System.out.println("Q = Quit");

            response=scanner.next().toUpperCase();

            switch(response){
                case "P" -> clip.start();
                case "S" -> clip.stop();
                case "R" -> clip.setMicrosecondPosition(0);
            }

        }
        //switch to handle input


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
