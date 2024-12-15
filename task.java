import java.util.*;
class Main1{
    public static void main(String args[])
    {
        while(true)
        {
            System.out.println("Good Morning");
            try{
                Thread.sleep(5000);
            }catch(InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println("Good Afternoon");
            try{
                Thread.sleep(7000);
            }catch(InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println("Good Evening");
            try{
                Thread.sleep(9000);
            }catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}