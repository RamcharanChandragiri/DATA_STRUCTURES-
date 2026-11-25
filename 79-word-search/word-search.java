class Solution {
    boolean ans;
    void fun(int i,int j,int idx,String word,char mat[][])
    {
        if(idx>=word.length())
        {
            ans=true;
            return;
        }
        if(i<0||j<0||i>=mat.length||j>=mat[0].length) return;
        if(ans==true) return;
        if(mat[i][j]!=word.charAt(idx)) return;
        char temp=mat[i][j];
        mat[i][j]='@';
        fun(i+1,j,idx+1,word,mat);
        fun(i-1,j,idx+1,word,mat);
        fun(i,j+1,idx+1,word,mat);
        fun(i,j-1,idx+1,word,mat);
        mat[i][j]=temp;
    }
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]==word.charAt(0))
                {
                    fun(i,j,0,word,board);
                }
                if(ans==true) return true;
            }
        }
        return false;
    }
}