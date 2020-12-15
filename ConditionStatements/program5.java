//LEAP YEAR PROBLEM
public class program5 {
    public static void main(String[] args) {
        int year=2004;
        if((year%100!=0&&year%400==0)||year%4==0)
        {
            System.out.println(year+" is leap year");
        }
        else {
            System.out.println("not an leap year");
        }
    }
    
}
