public class nqueens {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board=new boolean[n][n];
        System.out.println(queens(board, 0));
    }
    static int queens(boolean[][]board, int row){
        if(row == board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count=0;
        for (int col = 0; col < board.length; col++){
            if(issafe(board, row, col)==true){
                board[row][col]=true;
                count+=queens(board, row+1);
                board[row][col]=false;
            }
        }
        return count;   
    }
    static void display(boolean[][] board) {
        for (int i= 0; i< board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j]==true){
                    System.out.print("Q");
                }
                else{
                    System.out.print("x");
                }
            }
            System.out.println();
        }
    }
    static boolean issafe(boolean[][] board,int row, int col){
        for (int i = 0; i <row ; i++) {
            if(board[i][col]==true){
                return false;
            }
        }
        int minleft=Math.min(row, col);
        for (int i = 1; i <=minleft; i++) {
            if(board[row-i][col-i]==true){
                return false;
            }
        }
        int minright=Math.min(row, board.length-1-col);
        for (int i = 1; i <= minright; i++) {
            if(board[row-i][col+i]==true){
                return false;
            }
        }
        return true;
    }
}
