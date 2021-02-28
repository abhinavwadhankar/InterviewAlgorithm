package src.main.java.GeeksForGeeks;
import java.util.Random;

public class RandomNumberWithRange
{


    public void generateRandomNumberWith(int range)
    {
        Random random =new Random();
        System.out.println(random.nextInt(range));

    }

    public static void main(String[] args)
    {
        RandomNumberWithRange randomNumberWithRange =new RandomNumberWithRange();
        randomNumberWithRange.generateRandomNumberWith(100);
        randomNumberWithRange.generateRandomNumberWith(10);

        randomNumberWithRange.generateRandomNumberWith(1000);

    }
}