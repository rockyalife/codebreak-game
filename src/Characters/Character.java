package characters;

import field.Field;

public class Character {
    private float posX;
    private float posY;
    private Directions direction;
    private Field field;
    private int life;
    private int speed;

public Character(Field field) {
        this.field = field;
        this.direction = Directions.RIGHT;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public void setDirection(Directions direction) {
        this.direction = direction;
    }

    public Directions getDirection() {
        return direction;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getLife() {
        return life;
    }

    public void setPosX(float posX) {
        this.posX = posX;
    }

    public float getPosX() {
        return posX;
    }

    public void setPosY(float posY) {
        this.posY = posY;
    }

    public float getPosY() {
        return posY;
    }

    public void move() {
        switch (direction) {
            /*
            case UP:
                moveUp();
                break;
            case DOWN:
                moveDown();
                break;

             */
            case LEFT:
                moveLeft();
                break;
            case RIGHT:
                moveRight();
                break;
        }
    }

    public void moveUp() {
        posY -= speed;
    }

    public void moveDown() {
        posY += speed;
    }

    public void moveLeft() {
        posX -= speed;
    }

    public void moveRight() {
        posX += speed;
    }

}