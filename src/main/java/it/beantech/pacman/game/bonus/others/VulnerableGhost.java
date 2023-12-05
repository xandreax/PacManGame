package it.beantech.pacman.game.bonus.others;

import it.beantech.pacman.game.bonus.BonusEntity;

public class VulnerableGhost extends BonusEntity {
    private static final int VULNERABLE_GHOST_POINTS = 200;
    private static int counter = VULNERABLE_GHOST_POINTS;

    public VulnerableGhost() {
        super(counter);
        counter *= 2;
    }
}
