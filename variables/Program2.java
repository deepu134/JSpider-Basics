public class Program2 {
    public static void main(String[] args) {
        double prize=1500.00,dis=0.10,costprize;
        costprize=prize-(prize*dis);
        dis=dis*100;
        System.out.println("Prize="+prize);
        System.out.println("After "+dis+"% discount="+costprize);
    }
}
