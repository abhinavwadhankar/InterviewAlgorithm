package src.main.java.GeeksForGeeks;

public class CreateMathTableOfAnyNumber
{

    public  void createMathTable(int number)
    {
        for(int i=1; i<=10;i++)
           System.out.println(i + "*"+number + "=" + (i*number));


    }


    public static void main(String[] args)
    {

        CreateMathTableOfAnyNumber createMathTableOfAnyNumber=new CreateMathTableOfAnyNumber();
        createMathTableOfAnyNumber.createMathTable(17);
        createMathTableOfAnyNumber.createMathTable(30);
        createMathTableOfAnyNumber.createMathTable(31);
    }

}