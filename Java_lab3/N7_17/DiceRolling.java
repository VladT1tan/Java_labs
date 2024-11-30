package N7_17;
import java.util.Random;

public class DiceRolling {
    public static void main(String[] args){
        Random random = new Random();
        int[] sums = new int[13];

        int rolls = 36_000_000;

        for (int i = 0; i < rolls; i++){
            int die1 = 1 + random.nextInt(6);
            int die2 = 1 + random.nextInt(6);

            int sum = die1 + die2;
            sums[sum]++;
        }

        System.out.println("Sum\tFrequency\tPercentage");
        for(int sum = 2; sum < 12; sum++){
            double percentage = (double) sums[sum] / rolls * 100;
            System.out.printf("%d\t%d\t\t%.2f%%%n", sum, sums[sum], percentage);
        }
    }
}