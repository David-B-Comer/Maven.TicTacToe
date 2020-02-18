package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private Character[][] board;
    public Board(Character[][] matrix) {
        this.board = matrix;
    }

    public Boolean checkVertical(Character XO) {
        for (int i = 0; i <= 2; i++) {
            if ((board[0][i] == XO) && (board[1][i] == XO) && (board[2][i] == XO)) {
                return true;
            }
        }return false;
    }

    public Boolean checkHorizontal(Character XO) {
        for (int i = 0; i <= 2; i++) {
            if ((board[i][0] == XO) && (board[i][1] == XO) && (board[i][2] == XO)) {
                return true;
            }
        } return false;
    }

    public Boolean checkDiagonal(Character XO) {
        for (int i = 0; i <= 2; i++) {
            if ((board[0][0] == XO && board[1][1] == XO && board[2][2] == XO) || board[0][2] == XO && board[1][1] == XO && board[2][0] == XO)  {
                return true;
            }
        } return false;
    }

    public Boolean isInFavorOfX() {
        if (checkHorizontal('X') || checkVertical('X') || checkDiagonal('X')) {
            return true;
        } return false;
    }

    public Boolean isInFavorOfO() {
        if (checkHorizontal('O') || checkVertical('O') || checkDiagonal('O')) {
            return true;
        } return false;
    }

    public Boolean isTie() {
        return isInFavorOfX() == isInFavorOfO();
    }

    public String getWinner() {

    if (isInFavorOfO() == true) {
        return "O";
    }
    if (isInFavorOfX() == true) {
        return "X";
    }
    return "";
    }

}
