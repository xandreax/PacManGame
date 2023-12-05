import it.beantech.pacman.exception.GameElementNotFoundException;
import it.beantech.pacman.game.GameElement;
import it.beantech.pacman.game.bonus.BonusEntity;
import it.beantech.pacman.game.bonus.BonusEntityFactory;
import it.beantech.pacman.game.bonus.others.Dot;
import it.beantech.pacman.game.bonus.others.VulnerableGhost;
import it.beantech.pacman.game.bonus.fruits.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BonusEntityFactoryTest {

    private static BonusEntityFactory bonusEntityFactory;

    @BeforeAll
    static void initializeFactory() {
        bonusEntityFactory = BonusEntityFactory.getInstance();
    }

    @Test
    void testDotInstance() throws GameElementNotFoundException {
        BonusEntity bonus = bonusEntityFactory.getBonus(GameElement.DOT);
        assertEquals(Dot.class, bonus.getClass());
    }

    @Test
    void testVulnerableGhostInstance() throws GameElementNotFoundException {
        BonusEntity bonus = bonusEntityFactory.getBonus(GameElement.VULNERABLEGHOST);
        assertEquals(VulnerableGhost.class, bonus.getClass());
    }

    @Test
    void testKeyInstance() throws GameElementNotFoundException {
        BonusEntity bonus = bonusEntityFactory.getBonus(GameElement.KEY);
        assertEquals(Key.class, bonus.getClass());
    }

    @Test
    void testBellInstance() throws GameElementNotFoundException {
        BonusEntity bonus = bonusEntityFactory.getBonus(GameElement.BELL);
        assertEquals(Bell.class, bonus.getClass());
    }

    @Test
    void testAppleInstance() throws GameElementNotFoundException {
        BonusEntity bonus = bonusEntityFactory.getBonus(GameElement.APPLE);
        assertEquals(Apple.class, bonus.getClass());
    }

    @Test
    void testMelonInstance() throws GameElementNotFoundException {
        BonusEntity bonus = bonusEntityFactory.getBonus(GameElement.MELON);
        assertEquals(Melon.class, bonus.getClass());
    }

    @Test
    void testCherryInstance() throws GameElementNotFoundException {
        BonusEntity bonus = bonusEntityFactory.getBonus(GameElement.CHERRY);
        assertEquals(Cherry.class, bonus.getClass());
    }

    @Test
    void testOrangeInstance() throws GameElementNotFoundException {
        BonusEntity bonus = bonusEntityFactory.getBonus(GameElement.ORANGE);
        assertEquals(Orange.class, bonus.getClass());
    }

    @Test
    void testGalaxianInstance() throws GameElementNotFoundException {
        BonusEntity bonus = bonusEntityFactory.getBonus(GameElement.GALAXIAN);
        assertEquals(Galaxian.class, bonus.getClass());
    }

    @Test
    void testStrawberryInstance() throws GameElementNotFoundException {
        BonusEntity bonus = bonusEntityFactory.getBonus(GameElement.STRAWBERRY);
        assertEquals(Strawberry.class, bonus.getClass());
    }

    @Test
    void testThrowGameElementNotFoundException() {
        assertThrows(GameElementNotFoundException.class, () -> bonusEntityFactory.getBonus(GameElement.INVINCIBLEGHOST));
    }
}
