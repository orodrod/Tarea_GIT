public class Kata {

    public static int sum(int[] numbers)
    {
        if(numbers !=null && numbers.length!=0){
            int numMin = numbers[0], numMax = numbers[0], sum = 0;
            if (numbers.length == 1){
                return 0;
            }else{
                for(int i = 0; i < numbers.length; i++){
                    if (numbers[i] >= numMax ){
                        numMax = numbers[i];
                    }else if (numbers[i] <= numMin){
                        numMin = numbers[i];
                    }
                    sum += numbers[i];
                }
            }
            return (sum - numMin) - numMax;
        }
        return 0;
    }
}