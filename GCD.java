
class GCD
{

    public int generalizedGCD(int num, int[] arr)
    {
        // WRITE YOUR CODE HERE
        num = arr.length;
       java.util.Arrays.sort(arr);
       int index = 0;
       boolean res = false;
       int divisible = arr[index];
       while(!res){
           res = true;
           for(int i =0 ;i < num; i++){
           if (arr[i] % divisible != 0){
               res = false;
               break;
           }
              
       }
       if(!res){
        divisible -= 1;
       }
       }
       
        return divisible;
    }

}

