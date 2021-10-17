public class AddMultiply{

    public void sum(int a,int b)
    {
        System.out.println("Addition of two numbers."+(a+b));
    }
    public void sum(int a,int b, int c)
    {
        System.out.println("Addition of three numbers:"+(a+b+c));
    }
    public void multiply(int a,int b)
    {
        System.out.println("Multiplication of two numbers:"+(a*b));
    }
    public void multiply(int a,int b, int c)
    {
        System.out.println("Multiplication of three numbers:"+(a*b*c));
    }

    public static void main(String args[]) {
        Main function = new Main();
        function.sum(5,7);
        function.sum(859,146,234);
        function.multiply(8,16);
        function.multiply(80,5,82);
    }
}