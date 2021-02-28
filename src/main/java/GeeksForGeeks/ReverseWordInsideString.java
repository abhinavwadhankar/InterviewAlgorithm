package src.main.java.GeeksForGeeks;

public class ReverseWordInsideString
{

    public void reverseWordInsideStringMethod(String originalString)
    {
        System.out.println("Before :"+originalString);
        String[] arrayString = originalString.split(" ");
        StringBuffer reverseString = new StringBuffer("");

        for(int i = 0; i < (arrayString.length);i++)
        {
              StringBuffer temp = new StringBuffer(arrayString[i]);
              temp.reverse();
              reverseString.append(temp).append(" ");
        }

        System.out.println("After :"+reverseString.toString().trim());
    }

  public static void main(String[] args)
  {
    ReverseWordInsideString reverseWordInsideString = new ReverseWordInsideString();
    reverseWordInsideString.reverseWordInsideStringMethod("This is coding");
  }

}
