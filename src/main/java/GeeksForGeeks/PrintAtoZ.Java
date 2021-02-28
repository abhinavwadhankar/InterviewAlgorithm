package src.main.java.GeeksForGeeks;

public class PrintAtoZ
{

    public void printAtoZLettersinSmalls()
    {

        for(char ch='a'; ch<='z'; ch++)
        {
            System.out.print(ch);
        }
        System.out.println();
    }

    public void printAtoZLettersinCapital()
    {

        for(char ch='A'; ch<='Z'; ch++)
        {
            System.out.print(ch);
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        PrintAtoZ printAtoZ =new PrintAtoZ();
        printAtoZ.printAtoZLettersinSmalls();
        printAtoZ.printAtoZLettersinCapital();
    }


}