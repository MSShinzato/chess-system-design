package boardgame;

public class Piece {
    
    //#region variables
    protected Position position;
    private Board board;
    //#endregion

    //#region constructor
    public Piece(Board board){
        this.board = board;
        position = null;
    }
    //#endregion

    //#region getter board
    protected Board getBoard(){
        return board;
    }
    //#endregion

}
