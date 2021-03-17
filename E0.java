  
public class E0
{
    public static void main(String[] args)
    {
        int[] numbers = {0,1,2,3,4,5};

        for(int i = 0; i < numbers.length ; i++)
        {
            System.out.println(numbers[i]);
        }

        E0 test = new E0();
        test.printMessage("You fix the errors!");
    }

    public void printMessage(String mssg)
    {
        System.out.println(mssg);
    }
}