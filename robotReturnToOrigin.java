class Solution {
    public boolean judgeCircle(String moves) {
        int UD = 0;
        int LR = 0;
        for(int i = 0; i < moves.length(); i++){
            char move = moves.charAt(i);
            if(move == 'U'){
                UD++;
            }else if(move == 'D'){
                UD--;
            }else if(move == 'L'){
                LR++;
            }else if(move == 'R'){
                LR--;
            }
        }
        return UD == 0 && LR == 0;
    }
}
