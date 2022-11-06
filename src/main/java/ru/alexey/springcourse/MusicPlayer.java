package ru.alexey.springcourse;

public class MusicPlayer {
    private Music music;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.printf("Playing: %s\n", music.getSong());
    }
}
