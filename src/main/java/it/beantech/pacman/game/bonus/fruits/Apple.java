package it.beantech.pacman.game.bonus.fruits;

import it.beantech.pacman.game.bonus.BonusEntity;

public class Apple extends BonusEntity {
    private static final int APPLE_POINTS = 700;

    public Apple() {
        super(APPLE_POINTS);
    }
}
