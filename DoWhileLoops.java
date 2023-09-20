public class DoWhileLoops
{
    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;
    public void run() {
        int i = 0;
        do {
            System.out.println("This loop will run as long as i < 10");
            i++;
        } while (i < 10);
        System.out.println(" ");
        do {
            System.out.println("This loop will run as long as i<15");
            i++;
        } while (i < 15);
        System.out.println(" ");
        int k = 10;
        do  {
            System.out.println("This loop will run as long as k > 5");
            k -= 1;
        } while (k > 5);
        System.out.println(" ");
        do  {
            System.out.println("This loop will run as long as a < 10");
            System.out.println("This loop will run as long as b <= 20");
            a++;
            b++;
        } while (a < 10 && b <= 20);
    }

    public static void main(String[] args)
    {        
        DoWhileLoops hw = new DoWhileLoops();
        hw.run();
    }

}
