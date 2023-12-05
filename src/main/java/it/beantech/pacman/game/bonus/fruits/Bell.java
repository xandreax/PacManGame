package it.beantech.pacman.game.bonus.fruits;

import it.beantech.pacman.game.bonus.BonusEntity;

public class Bell extends BonusEntity {
    private static final int BELL_POINTS = 3000;

    public Bell() {
        super(BELL_POINTS);
    }
}
