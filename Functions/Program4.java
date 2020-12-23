public class Program4 {
    static void SimpleIntrest(double p,int t,double r)
    {
        System.out.println("Principal="+p);
        System.out.println("time="+t);
        System.out.println("rate="+r+"%");
    System.out.println("Simple Intrest="+p*t*r/100);
    }
    public static void main(String[] args) {
        System.out.println("Started main  function");
        SimpleIntrest(2500,12,65.5);
        System.out.println("Ended main  function");
    }
}
