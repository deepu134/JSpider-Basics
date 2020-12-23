public class Program3 {
    static void circum(int r )
    {
    System.out.println("circumference of circle="+2*3.14*r);
    }
    static void area(int r )
    {
    System.out.println("Area of circle="+3.14*r*r);
    }
    static void diameter(int r )
    {
    System.out.println("diameter of circle="+2*r);
    }
    public static void main(String[] args) {
        System.out.println("Started main  function");
        int r=20;
        circum( r);
        area(r);
        diameter(r);
        System.out.println("Ended main  function");
    }
}
