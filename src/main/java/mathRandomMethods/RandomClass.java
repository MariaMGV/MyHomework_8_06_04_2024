package mathRandomMethods;
import java.util.Random;

public class RandomClass {
    public static int[] fillRandomArray(int length) {

        int[] array = new int[length];
        Random random = new Random();

            for (int i = 0; i < length; i++) {
                array[i] = random.nextInt(35);
            }

        return array;
    }
    public static int[] createNumbersForTheLottery(int size, int lottoDraw){
        int[] lottoArray = new int[size];
        Random randomLottery = new Random();
        int counterOfUniqueNums = 0;

        while(counterOfUniqueNums < size) {

            int lottoNum  = randomLottery.nextInt(1,lottoDraw);
            boolean isUnique = true;

            for (int i = 0; i < counterOfUniqueNums; i++) {
            if(lottoArray[i] == lottoNum){
                isUnique = false;
                break;
            }
           }
            if(isUnique){
                lottoArray[counterOfUniqueNums] = lottoNum;
                counterOfUniqueNums++;
            }
        }
        return lottoArray;
    }
    public static int compareMyArrayWithLottoArray(int[] array1, int[] array2){
        int counter = 0;
        for(int i = 0; i < array1.length ; i++){
            for(int j = 0; j < array2.length ; j++){
                if( array1[i] == array2[j]){
                    counter ++;
                    break;
                }
            }
        }
        return counter;
    }
}
