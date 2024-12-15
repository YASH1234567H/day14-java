//creating thread using lamda 
class main
{
    public static void main(String args[])
    {
        System.out.println("Thread Started...");
        try
        {
            Thread.sleep(10000);
        }
        catch(InterruptedException e)
        {
            System.out.println("Interupted");
        }
        System.out.println("Thread resumed");
    }
}