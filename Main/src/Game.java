import field.Field;
import characters.Player;

import java.util.LinkedList;

public class Game {

    private Field field;
    private Player player;
    //private LinkedList<characters.NPC> npcs = new LinkedList<>();

    public Game(int cols, int rows) {
        this.field = new Field(cols, rows);
        this.player = new Player(this.field);
    }

    public void init() {
        //this.field.init();
        //this.player.init();
    }

    public void start() {
        this.field.show();
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public Player getPlayer() {
        return player;
    }

    public Field getField() {
        return field;
    }


}