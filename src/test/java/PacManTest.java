import it.beantech.pacman.game.PacMan;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PacManTest {

    private static final int PACMAN_START_POINTS = 5000;
    private static final int PACMAN_START_LIFES = 3;

    @Test
    void testPacManInitializeCorrectly() {
        PacMan pacMan = new PacMan();
        assertEquals(PACMAN_START_LIFES, pacMan.getLifes());
        assertEquals(PACMAN_START_POINTS, pacMan.getPoints());
    }

    @Test
    void testPacManIsAlive() {
        PacMan pacMan = new PacMan();
        assertFalse(pacMan.isDead());
    }

    @Test
    void testPacManLosesLife() {
        PacMan pacMan = new PacMan();
        pacMan.chomped();
        assertEquals(PACMAN_START_LIFES - 1, pacMan.getLifes());
    }

    @Test
    void testPacManIsDead() {
        PacMan pacMan = new PacMan();
        pacMan.chomped();
        pacMan.chomped();
        pacMan.chomped();
        assertTrue(pacMan.isDead());
    }

    @Test
    void testPacManAddPoints() {
        PacMan pacMan = new PacMan();
        pacMan.addPoints(1000);
        assertEquals(PACMAN_START_POINTS + 1000, pacMan.getPoints());
    }

    @Test
    void testAddNewOneLife() {
        PacMan pacMan = new PacMan();
        pacMan.addPoints(5000);
        assertEquals(PACMAN_START_LIFES + 1, pacMan.getLifes());
        assertEquals(1, pacMan.getLifesGained());
    }

    @Test
    void testAddNewThreeLife() {
        PacMan pacMan = new PacMan();
        pacMan.addPoints(10000);
        pacMan.addPoints(10000);
        pacMan.addPoints(10000);
        assertEquals(PACMAN_START_LIFES + 3, pacMan.getLifes());
        assertEquals(3, pacMan.getLifesGained());
    }

}
