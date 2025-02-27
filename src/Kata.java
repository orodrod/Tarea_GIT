public class Kata {

    public static int sum(int[] numbers)
    {
        int numMin = numbers[0], numMax = numbers[0], sum = 0;
        if (numbers.length == 1){
            return 0;
        }else{
            for(int i = 0; i < numbers.length; i++){
                if (numbers[i] >= numMax ){
                    numMax = numbers[i];
                    sum += numbers[i];
                }else if (numbers[i] <= numMin){
                    numMin = numbers[i];
                    sum += numbers[i];
                }else if(numbers[i] > numMin && numbers[i] < numMax){
                    sum += numbers[i];
                }
            }
        }
        return (sum - numMin) - numMax;
    }
}
/*En la kata del codewars hay un error que no se solucionar, los test
de los arrays nulos y los vacios, el resto de tets salen correctos
 */

