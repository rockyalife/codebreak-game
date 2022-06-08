package field;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Field {

    private static int CELL_SIZE = 5;
    private static int PADDING = 10;
    private int rows;
    private int cols;
    private float width;
    private float height;
    private Rectangle field;


    public Field(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
        this.width = cols * CELL_SIZE;
        this.height = rows * CELL_SIZE;
        init();

    }


    public void init() {
        this.field = new Rectangle(PADDING,PADDING,width,height);
        field.draw();
    }

    public void show() {
        field.draw();
    }

    public void setField(Rectangle field) {
        this.field = field;
    }

    public void deletePicture(){
        this.field.delete();
    }

    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }

    public int getCellSize() {
        return CELL_SIZE;
    }

    public float getWidth() {
        return this.field.getWidth();
    }

    public float getHeight() {
        return this.field.getHeight();
    }

    public int colsToX(int cols) {
        return PADDING + (cols * CELL_SIZE);
    }

    public int rowsToY(int rows) {
        return PADDING + (rows * CELL_SIZE);
    }
}