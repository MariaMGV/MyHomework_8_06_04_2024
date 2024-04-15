package mathRandomMethods;
import static mathRandomMethods.MathClass.findMaxInteger;
import static mathRandomMethods.RandomClass.*;

import java.util.Random;


public class Test {
    public static void main(String[] args) {

        int a = 3;
        int b = 5;
        int c = 7;

        System.out.println("The maximum number is:  " + findMaxInteger(a,b,c));

        double area = MathClass.areaOfEquilateralTriangle(2.6);
        System.out.printf("The area of this equilateral triangle is %.2f.\n", area);
        System.out.println("-------------------------------------------");

       int arrayLength = 5;
       int[] arrayRandomNumbers =  fillRandomArray(arrayLength);

        System.out.println("Random numbers in this array are:");
        for(int num : arrayRandomNumbers ){
            System.out.println(num);
        }
        System.out.println("--------------------------");

        int[] myLuckyNumbers = {9, 3, 24, 30, 2};
        int size = 5;
        int lottoDraw = 35;
        int[] fiveFromThirtyFiveLotteryArray = createNumbersForTheLottery(size,lottoDraw);
        System.out.println("The numbers from the last lotto draw \"5 out of 35\" are:");

        for(int num : fiveFromThirtyFiveLotteryArray){
            System.out.println(num);
        }

        int matches = compareMyArrayWithLottoArray(myLuckyNumbers,fiveFromThirtyFiveLotteryArray);

        if(matches > 0){
            System.out.printf("Congratulations! You have %d known numbers from this draw. " +
                    "You can see your winnings on the lotto site.\n",matches);
        }
        else {
            System.out.println("Try again next lotto draw");
        }






    }

}
