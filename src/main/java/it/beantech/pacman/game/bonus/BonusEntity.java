package it.beantech.pacman.game.bonus;

public abstract class BonusEntity {
    private final int points;

    protected BonusEntity(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

}