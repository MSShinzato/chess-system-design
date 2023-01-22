package boardgame;

public class Board {
    
    //#region variables
    private int rows;
    private int columns;
    private Piece[][] pieces;
    //#endregion


    //#region constructor
    public Board(int rows, int columnns){

        this.rows = rows;
        this.columns = columnns;
        pieces = new Piece[rows][columnns];

    }
    //#endregion

    //#region getter and setter row
    public int getRows(){
        return rows;
    }

    public void setRows(int rows){
        this.rows = rows;
    }
    //#endregion
    public int getColumns(){
        return columns;
    }
    
    //#region getter and setter column
    public void setColumns(int columns){
        this.columns = columns;
    }
    //#endregion

}
