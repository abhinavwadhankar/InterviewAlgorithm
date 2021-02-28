package src.main.java.GeeksForGeeks;

public class PrimeNumberRange_2
{
    public void printPrimeNumberInRange(int lowerRange, int higherRange)
    {
        if(lowerRange<=0)
            System.out.println("Lower Range Cannot be less than or equal to zero");
        else
        {
            for(int i= lowerRange ; i<=higherRange;i++)
            {
                int checkPrimeNumber = i;
                int counter=0;
                for(int j =2;j<checkPrimeNumber;j++)
                {
                    counter=0;
                    if(checkPrimeNumber%j==0)
                      {counter++; break;}

                }
                if(counter==0 && i!=1)
                  System.out.print(i + " ");
            }
        }

    }

    public static void main(String[] args)
    {
        PrimeNumberRange_2 primeNumberRange =new PrimeNumberRange_2();
       // primeNumberRange.printPrimeNumberInRange(1,100);
        primeNumberRange.printPrimeNumberInRange(2,1000);
    }


}