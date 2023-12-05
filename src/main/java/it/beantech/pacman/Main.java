package it.beantech.pacman;

public class Main {
    public static void main(String[] args) {
        ApplicationManager applicationManager = new ApplicationManager();
        applicationManager.run("./src/main/resources/beanTech-seq.txt");
    }
}
