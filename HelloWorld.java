public class HelloWorld
{

    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;
    
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("i is " + i + " but is less than 10");
            i++;
        }
            System.out.println(" ");
        while (i < 15) {
            System.out.println("i is " + i + " but is less than 15");
            i++;
        }
            System.out.println(" ");
        int k = 10;
        while (k > 5) {
            System.out.println("k is " + k + " but is greater than 5");
            k -= 1;
        }
            System.out.println(" ");
        while (a < 10 && b <= 20) {
            System.out.println("a is " + a + " and b is " + b);
            a++;
            b++;
        }
    }
    
    public static void main(String[] args)
    {        
        HelloWorld hw = new HelloWorld();
        hw.run();
    }
    
}
