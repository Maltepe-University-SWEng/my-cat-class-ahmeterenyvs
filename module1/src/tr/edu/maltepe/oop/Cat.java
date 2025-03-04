package tr.edu.maltepe.oop;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

class Cat {
    private String name;
    private int age;

    // Constructor
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method to play the meow sound
    public void meow() {
        System.out.println(name + " is meowing...");

        try {
            // Ses dosyasını yükle
            File soundFile = new File("C:\\Users\\PC\\IdeaProjects\\my-cat-class-ahmeterenyvs\\module1\\src\\tr\\edu\\maltepe\\oop\\cat_meowing_1_ZAj_Dgz (1).wav"); // Ses dosyanı proje klasörüne koymalısın
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start(); // Ses çalmaya başlar

            // Sesin tamamen çalmasını bekle
            Thread.sleep(clip.getMicrosecondLength() / 1000);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e) {
            System.out.println("Ses çalınırken hata oluştu: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Creating objects
            Cat cat1 = new Cat("Whiskers", 3);
        Cat cat2 = new Cat("Mittens", 2);

        // Calling the meow method
        cat1.meow();
        cat2.meow();
    }
}
