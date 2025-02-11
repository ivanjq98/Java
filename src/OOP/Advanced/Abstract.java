package OOP.Advanced;

// Define the Playable interface
interface Playable {
    void play();
}

// Implement the interface in VideoPlayer class
class VideoPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Playing video...");
    }
}

// Implement the interface in MusicPlayer class
class MusicPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Playing music...");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Playable video = new VideoPlayer();
        Playable music = new MusicPlayer();

        video.play(); // Calls VideoPlayer's play()
        music.play(); // Calls MusicPlayer's play()
    }
}
