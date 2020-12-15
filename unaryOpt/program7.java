public class program7 {
    public static void main(String[] args) {
        int x=0,y=0;
        y=x++ + ++x + x++ + ++x + ++x + x++ + x++ + ++x + x++;
        System.out.println("Value of x:"+x);
        System.out.println("Value of y:"+y);
    }
}
