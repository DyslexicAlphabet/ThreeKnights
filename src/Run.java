import java.util.concurrent.ThreadLocalRandom;

public class Run {

    //MOVE MECHANIC

    public static void move(int a) {
        int movingKnightNumber = ThreadLocalRandom.current().nextInt(1, 4);
        String movingKnight;
        Knight knight;
        //THE TURN IS WHITE'S TURN
        if (a % 2 == 0) {
            movingKnight = "wKnight" + movingKnightNumber;
            System.out.println(movingKnight);
        }
        //THE TURN IS BLACK'S TURN
        if (a % 2 == 1) {
            movingKnight = "bKnight" + movingKnightNumber;
            System.out.println(movingKnight);
        }

    }

    public static void main(String[] args) {

        //A 3X3 2D ARRAY TO REPRESENT THE BOARD
        String[][] board = {{" ", " ", " "},
                {" ", " ", " "},
                {" ", " ", " "}};

        //CONSTRUCT 3 WHITE KNIGHTS AND 3 BLACK KNIGHTS

        Knight wKnight1 = new Knight(true, 1, 0, 0, board);
        Knight wKnight2 = new Knight(true, 2, 0, 1, board);
        Knight wKnight3 = new Knight(true, 3, 0, 2, board);

        Knight bKnight1 = new Knight(false, 1, 2, 0, board);
        Knight bKnight2 = new Knight(false, 2, 2, 1, board);
        Knight bKnight3 = new Knight(false, 3, 2, 2, board);


        //MAIN METHOD (RUN)

        int turn;

        for (turn = 0; turn < 9; turn++) {
           move(turn);
            }
        }

    }


