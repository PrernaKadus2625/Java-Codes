package Backtracking;

public class totalwaysinNQueens {
    

    public static boolean issafe(char board[][],int row,int col){
        //upward
        for(int i=row-1;i>=0;i--){
            if (board[i][col]== 'Q'){
                return false;
            }

        }
        
        //diagonally left
        for(int i = row-1, j = col-1;i>=0 && j>=0;i--,j--){
            if (board[i][j]== 'Q'){
                return false;
            }   
        }

        // diagonally right
        for (int i=row-1,j= col +1;i>=0 &&j<board.length;i--,j++){
            if (board[i][j]== 'Q'){
                return false;
            }

        }
        return true;

    }

    public static int ways(char board[][],int row){

        if(row == board.length){
            count++;
            return 0;
        }
        for(int j=0;j<board.length;j++){
          if(issafe(board,row,j)){
            board[row][j] = 'Q';
            ways(board,row+1);
            board[row][j]='x';
          }

        } 
        return 0;
    }

    public static void printBoard(char board[][]){
        System.out.println("   board     ");
        for (int i =0;i<board.length;i++){
            for (int j =0;j<board.length;j++){
                System.out.print(board[i][j] + "  ");

        }
        System.out.println(" ");
    }
    
}
static int count = 0;
  public static void main(String main[]){
    int n=4;
    char board[][] = new char[n][n];
    for (int i =0;i<board.length;i++){
            for (int j =0;j<board.length;j++){
                board[i][j]='x';

        }
    }
    ways(board,0);
    System.out.println("total no. of ways : " + count);

  }


}

   
