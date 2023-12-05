package it.beantech.pacman.game.bonus;

import it.beantech.pacman.exception.GameElementNotFoundException;
import it.beantech.pacman.game.GameElement;
import it.beantech.pacman.game.bonus.fruits.*;
import it.beantech.pacman.game.bonus.others.Dot;
import it.beantech.pacman.game.bonus.others.VulnerableGhost;

public final class BonusEntityFactory {
    private static BonusEntityFactory instance;

    private BonusEntityFactory() {
    }

    public static BonusEntityFactory getInstance() {
        if (instance == null) {
            instance = new BonusEntityFactory();
        }
        return instance;
    }

    public BonusEntity getBonus(GameElement gameElement) throws GameElementNotFoundException {
        switch (gameElement) {
            case DOT -> {
                return new Dot();
            }
            case VULNERABLEGHOST -> {
                return new VulnerableGhost();
            }
            case KEY -> {
                return new Key();
            }
            case BELL -> {
                return new Bell();
            }
            case APPLE -> {
                return new Apple();
            }
            case MELON -> {
                return new Melon();
            }
            case CHERRY -> {
                return new Cherry();
            }
            case ORANGE -> {
                return new Orange();
            }
            case GALAXIAN -> {
                return new Galaxian();
            }
            case STRAWBERRY -> {
                return new Strawberry();
            }
            default -> throw new GameElementNotFoundException("Game element not recognized");
        }
    }
}
