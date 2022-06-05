package characters;

import field.Field;

public class Player extends Character {

    public Player(Field field) {
        super(field);
        setLife(100);
        setSpeed(1);
        setPosX(field.getWidth()/2);
        setPosY(field.getHeight()/2);
        setDirection(Directions.RIGHT);
    }



}