import it.beantech.pacman.exception.GameElementNotFoundException;
import it.beantech.pacman.game.GameController;
import it.beantech.pacman.game.PacMan;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameControllerTest {

    private static GameController gameController;
    private static final int PACMAN_START_POINTS = 5000;
    private static final int PACMAN_START_LIFES = 3;

    @BeforeAll
    static void initializeController() {
        gameController = GameController.getInstance();
    }

    @Test
    void testThrowGameElementNotFoundException(){
        String gameElement = "PROVA";
        PacMan pacMan = new PacMan();
        assertThrows(GameElementNotFoundException.class, () -> gameController.play(gameElement, pacMan));
    }

    @Test
    void testInvincibilityGhostChompedPacman() throws GameElementNotFoundException {
        String gameElement = "INVINCIBLEGHOST";
        PacMan pacMan = new PacMan();
        gameController.play(gameElement, pacMan);
        assertEquals(PACMAN_START_LIFES - 1, pacMan.getLifes());
    }

    @Test
    void testPacManReceiveDotPoints() throws GameElementNotFoundException {
        String gameElement = "DOT";
        PacMan pacMan = new PacMan();
        gameController.play(gameElement, pacMan);
        assertEquals(PACMAN_START_POINTS + 10, pacMan.getPoints());
    }

    @Test
    void testPacManReceiveVulnerableGhostsPoints() throws GameElementNotFoundException {
        String gameElement = "VULNERABLEGHOST";
        PacMan pacMan = new PacMan();
        gameController.play(gameElement, pacMan);
        int points = PACMAN_START_POINTS + 200;
        assertEquals(points, pacMan.getPoints());
        gameController.play(gameElement, pacMan);
        points += 400;
        assertEquals(points, pacMan.getPoints());
        gameController.play(gameElement, pacMan);
        points += 800;
        assertEquals(points, pacMan.getPoints());
        gameController.play(gameElement, pacMan);
        points += 1600;
        assertEquals(points, pacMan.getPoints());
    }

    @Test
    void testPacManReceiveApplePoints() throws GameElementNotFoundException {
        String gameElement = "APPLE";
        PacMan pacMan = new PacMan();
        gameController.play(gameElement, pacMan);
        assertEquals(PACMAN_START_POINTS + 700, pacMan.getPoints());
    }

    @Test
    void testPacManReceiveBellPoints() throws GameElementNotFoundException {
        String gameElement = "BELL";
        PacMan pacMan = new PacMan();
        gameController.play(gameElement, pacMan);
        assertEquals(PACMAN_START_POINTS + 3000, pacMan.getPoints());
    }

    @Test
    void testPacManReceiveCherryPoints() throws GameElementNotFoundException {
        String gameElement = "CHERRY";
        PacMan pacMan = new PacMan();
        gameController.play(gameElement, pacMan);
        assertEquals(PACMAN_START_POINTS + 100, pacMan.getPoints());
    }

    @Test
    void testPacManReceiveGalaxianPoints() throws GameElementNotFoundException {
        String gameElement = "GALAXIAN";
        PacMan pacMan = new PacMan();
        gameController.play(gameElement, pacMan);
        assertEquals(PACMAN_START_POINTS + 2000, pacMan.getPoints());
    }

    @Test
    void testPacManReceiveKeyPoints() throws GameElementNotFoundException {
        String gameElement = "KEY";
        PacMan pacMan = new PacMan();
        gameController.play(gameElement, pacMan);
        assertEquals(PACMAN_START_POINTS + 5000, pacMan.getPoints());
    }

    @Test
    void testPacManReceiveMelonPoints() throws GameElementNotFoundException {
        String gameElement = "MELON";
        PacMan pacMan = new PacMan();
        gameController.play(gameElement, pacMan);
        assertEquals(PACMAN_START_POINTS + 1000, pacMan.getPoints());
    }

    @Test
    void testPacManReceiveOrangePoints() throws GameElementNotFoundException {
        String gameElement = "ORANGE";
        PacMan pacMan = new PacMan();
        gameController.play(gameElement, pacMan);
        assertEquals(PACMAN_START_POINTS + 500, pacMan.getPoints());
    }

    @Test
    void testPacManReceiveStrawberryPoints() throws GameElementNotFoundException {
        String gameElement = "STRAWBERRY";
        PacMan pacMan = new PacMan();
        gameController.play(gameElement, pacMan);
        assertEquals(PACMAN_START_POINTS + 300, pacMan.getPoints());
    }

}
