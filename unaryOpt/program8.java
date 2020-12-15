public class program8 {

    public static void main(String[] args) {
        int x=0;
        x=++x;
        x=++x;
        x=++x;
        System.out.println("pre-increment x:"+x);
        x=0;
        x=x++;
        x=x++;
        x=x++;
        System.out.println("Post increment x="+x);
    }
}
