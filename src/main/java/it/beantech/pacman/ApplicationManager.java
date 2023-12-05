package it.beantech.pacman;

import it.beantech.pacman.exception.GameElementNotFoundException;
import it.beantech.pacman.game.GameController;
import it.beantech.pacman.game.PacMan;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ApplicationManager {
    private static final Logger logger = LogManager.getLogger(ApplicationManager.class);

    public void run(String filename) {
        try (Scanner parser = new Scanner(new File(filename))){
            parser.useDelimiter(",");
            PacMan pacMan = new PacMan();
            GameController gameController = GameController.getInstance();

            while (!pacMan.isDead() && parser.hasNext()) { //pacman dead or element list is empty
                gameController.play(parser.next().toUpperCase(), pacMan);
            }

            System.out.printf("Game Ended.%nPacman points: %d%nPacman lifes: %d%nLifes gained: %d",
                    pacMan.getPoints(), pacMan.getLifes(), pacMan.getLifesGained());

        } catch (FileNotFoundException | GameElementNotFoundException exception){
            logger.error(exception.getMessage());
        }
    }
}
