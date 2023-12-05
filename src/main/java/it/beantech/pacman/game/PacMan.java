package it.beantech.pacman.game;

public class PacMan {

    private static final int START_POINTS = 5000;
    private static final int START_LIFES = 3;
    private static final int NEW_LIFE = 10000;

    private int points;
    private int lifes;
    private int newLifeLimit;

    public PacMan() {
        this.points = START_POINTS;
        this.lifes = START_LIFES;
        this.newLifeLimit = NEW_LIFE;
    }

    public boolean isDead() {
        return lifes <= 0;
    }

    public void addPoints(int points) {
        this.points += points;
        checkNewLife();
    }

    private void checkNewLife() {
        if (points >= newLifeLimit) {
            lifes++;
            newLifeLimit += NEW_LIFE;
        }
    }

    public void chomped() {
        lifes--;
    }

    public int getPoints() {
        return points;
    }

    public int getLifes() {
        return lifes;
    }

    public int getLifesGained() {
        return points / NEW_LIFE;
    }
}
