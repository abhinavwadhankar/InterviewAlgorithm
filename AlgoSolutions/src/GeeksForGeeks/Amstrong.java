package src.GeeksForGeeks


public class VerifyAmstrong
{
   // Amstrong is sum of cube of each digit in number is equal to original no.

    public void validateAmstrongNumber(int originalNumber)
    {
        int copyOriginalNumber = originalNumber;
        int sum = 0;
        while(copyOriginalNumber!=0)
        {
            int value = copyOriginalNumber%10;
            sum = sum + value*value*value;
            copyOriginalNumber = copyOriginalNumber/10;
        }
        if(sum == originalNumber)
            System.Out.println("Amstrong");
        else
            System.Out.println("Not Amstrong");

    }


    public static void main(str[] args)
    {
        VerifyAmstrong verifyAmstrong =new VerifyAmstrong();
        verifyAmstrong.validateAmstrongNumber(471);
    }


}




