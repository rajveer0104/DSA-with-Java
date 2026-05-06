public class nknights {
    public static void main(String[] args) {
        int n=3;
        boolean[][] board=new boolean[n][n];
        System.out.println(knights(board, 0));
    }
    static int knights(boolean[][] board, int row){
        if(row==board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count=0;
        for (int col = 0; col < board.length; col++) {
            if(issafe(board,row,col)==true){
                board[row][col]=true;
                count+=knights(board, row+1);
                board[row][col]=false;
            }
        }
        return count;
    }
    static void display(boolean[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]==true){
                    System.out.print("K");
                }
                else{
                    System.out.print("x");
                }
            }
            System.out.println();
        }
    }
    static boolean issafe(boolean[][] board, int row, int col){
            if(row>=2 && col>=1 && board[row-2][col-1]==true){
                return false;
            }
            if(row>=2 && col<=board.length-2 && board[row-2][col+1]==true){
                return false;
            }
            if(row>=1 && col>=2 && board[row-1][col-2]==true){
                return false;
            }
            if(row>=1 && col<=board.length-3 && board[row-1][col+2]==true){
                return false;
            }
            return true;

        }
    }
