package boardgame;

public class Position {
    
    //#region variables
    private int row;
    private int column;
    //#endregion

    //#region constructor
    public Position(int row, int column){
        this.row = row;
        this.column = column;
    }
    //#endregion

    //#region getter and setter row
    public int getRow(){
        return row;
    }

    public void setRow(int row){
        this.row = row;
    }
    //#endregion
    public int getColumn(){
        return column;
    }
    
    //#region getter and setter column
    public void setColumn(int column){
        this.column = column;
    }
    //#endregion

    //#region toString
    @Override
    public String toString(){
        return row +", "+ column;
    }
    //#endregion

}
