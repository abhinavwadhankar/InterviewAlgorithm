package src.main.java.GeeksForGeeks;

public class FindEvenOddNumber
{
    public void validateNumberIsEvenOrOdd(int number)
    {
        if(number%2==0)
            System.out.println("Number is Even: "+number);
        else
            System.out.println("Number is Odd: "+number);
    }

    public static void main(String[] args)
    {
        FindEvenOddNumber findEvenOddNumber =new FindEvenOddNumber();
        findEvenOddNumber.validateNumberIsEvenOrOdd(400);
        findEvenOddNumber.validateNumberIsEvenOrOdd(401);

    }
}