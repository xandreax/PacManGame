package it.beantech.pacman.game;

import it.beantech.pacman.exception.GameElementNotFoundException;
import it.beantech.pacman.game.bonus.BonusEntity;
import it.beantech.pacman.game.bonus.BonusEntityFactory;

public class GameController {
    private static GameController instance;
    private final BonusEntityFactory bonusEntityFactory;

    private GameController() {
        bonusEntityFactory = BonusEntityFactory.getInstance();
    }

    public static GameController getInstance() {
        if (instance == null) {
            instance = new GameController();
        }
        return instance;
    }

    public void play(String element, PacMan pacMan) throws GameElementNotFoundException {
        //parse
        try {
            GameElement gameElement = GameElement.valueOf(element);
            //do operation
            if (gameElement.equals(GameElement.INVINCIBLEGHOST)) {
                pacMan.chomped();
            } else {
                BonusEntity bonus = bonusEntityFactory.getBonus(gameElement);
                pacMan.addPoints(bonus.getPoints());
            }
        } catch (IllegalArgumentException exception){
            throw new GameElementNotFoundException("Parsing error: game element not found");
        }
    }
}
