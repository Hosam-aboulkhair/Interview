
import java.util.*;

public class Solution
{        
    public List<Integer> cellCompete(int[] states, int days)
    {

    int leftNeighbour = 0 ;
    int rightNeighbour = 0;
    int previousState[] = new int[states.length];
    List<Integer> result = new ArrayList<>();
    for(int i = 0 ; i < days; i++){
        previousState = Arrays.copyOf(states,states.length);
        for(int j = 0; j < states.length; j++){
            if(j == 0){
                leftNeighbour = 0;
                rightNeighbour = previousState[j +1];
            } else if(j == states.length - 1){
                leftNeighbour = previousState[j - 1];
                rightNeighbour = 0;
            }else{
                leftNeighbour = previousState[j - 1];
                rightNeighbour = previousState[j + 1];
            }
            states[j] = 1;
            if(leftNeighbour == rightNeighbour){
                states[j] =0;
            }
        }
    }
    for(int i: states){
        result.add(i);
    }
     return result;
    }
   

}