
import javax.management.monitor.GaugeMonitor;

class TTT{
    // Aufgabe 1
    int[] board = new int[9];
    int turn = 1;

    // Aufgabe 2
    boolean makeMove(int pos){
        assert pos >= 0;
        assert pos <= 8;

        //if (!(board[pos] == 0))
        if (board[pos] != 0)
            return false;

        board[pos] = turn;
        turn = - turn;
        return true;

    }

    // Aufgabe 3
    public String toString(){
        String res = "";
        for(int i = 0; i < board.length; i++){
            if(i % 3 == 0){
                res  = res+ "\n";
            }

            if(board[i] == 0)
                res = res + ".";
            if(board[i] == -1)
                res = res + "O";
            if(board[i] == 1)
                res = res + "X";

        }
        return res;
    }

    int threeInARow(){
        int[][] winning = {{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
        for(int[] row: winning){
            int winner = board[row[0]] + board[row[1]] +board[row[2]];
            if(winner == -turn * 3)
                return winner/3;
        }

        return 0;
    }

    int threeInARowA(){
        int[][] winning = {{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
        for(int i = 0; i < winning.length; i++){
            int winner = board[winning[i][0]] + board[winning[i][1]] +board[winning[i][2]];
            if(winner == -turn * 3)
                return winner/3;
        }

        return 0;
    }

}
