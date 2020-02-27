public class Knight {

    private boolean color;
    private int knightNumber;
    private int row;
    private int column;

    //CONSTRUCTOR METHOD FOR KNIGHT, COLOR "TRUE" = WHITE, COLOR "FALSE" = BLACK
    public Knight(boolean color, int knightNumber, int row, int column, String[][] chessboard) {
        this.color = color;
        this.knightNumber = knightNumber;
        this.row = row;
        this.column = column;

        if(color == true) {
            chessboard[row][column] = "W" + knightNumber + " ";
        }
        if(color == false) {
            chessboard[row][column] = "B" + knightNumber + " ";
        }


    }
}
