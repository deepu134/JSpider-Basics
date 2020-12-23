import java.util.Scanner;
public class Program5 {
    static int AlgbricExp1(int a,int b,boolean use )
    {
         int res=(a*a+2*a*b+b*b);
         if(use==false)
         {
            System.out.println("EXP 1:\t\t(a+b)2= a2 + 2ab + b2 \n RESULT="+res);
         }
            return res;        
    }
    static void AlgbricExp2(int a,int b )
    {
        int res=(a*a-2*a*b+b*b);
    System.out.println("EXP 2:\t(a-b)2 = a2 - 2ab + b2 \n Result="+res);
    }
    static void AlgbricExp3(int a,int b )
    {
        int res=AlgbricExp1(a, b,true)-2*a*b;
    System.out.println("EXP 3:\ta2 + b2 = (a + b)2 - 2ab\n Result="+res);
    }
    static void AlgbricExp4(int a,int b )
    {
        int res=(a+b)*(a-b);
    System.out.println("EXP 4:\ta2 - b2 = (a - b)(a + b)\n Result="+res);
    }
    static void AlgbricExp5(int a,int b,int c )
    {
        int res=a*a+b*b+c*c+2*a*b+2*b*c+2*c*a;
    System.out.println("EXP 5:\t(a + b + c)2 = a2 + b2 + c2 + 2ab + 2bc + 2ca\n Result="+res);
    }
    static void AlgbricExp6(int a,int b,int c )
    {
        int res=a*a+b*b+c*c-2*a*b+2*b*c-2*c*a;
    System.out.println("EXP 6:\t(a - b - c)2 = a2 + b2 + c2 - 2ab + 2bc - 2ca\n Result="+res);
    }
    static void AlgbricExp7(int a,int b )
    {
        int res=(a-b)*(a*a+a*b+b*b);
    System.out.println("EXP 7:\ta3 - b3 = (a - b)(a2 + ab + b2)\n Result="+res);
    }
    static void AlgbricExp8(int a,int b )
    {
        int res=(a-b)*(a*a-a*b+b*b);
    System.out.println("EXP 8:\ta3 + b3 = (a + b)(a2 - ab + b2)\n Result="+res);
    }
    static void AlgbricExp9(int a,int b )
    {
        int res=a*a*a+b*b*b+3*a*b*(a+b);
    System.out.println("EXP 9:\t(a + b)3 = a3 + b3 + 3ab(a + b)\n Result="+res);
    }
    static void AlgbricExp10(int a,int b )
    {
        int res=a*a*a-b*b*b-3*a*b*(a-b);
    System.out.println("EXP 10:\t(a - b)3 = a3 - b3 - 3ab(a - b)\n Result="+res);
    }
    
    public static void main(String[] args) {
        System.out.println("Started main  function");
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("----------------------------------------------");
            System.out.println("Option\t\tExpresions");
            System.out.println("----------------------------------------------");
            System.out.println("100\t\tAll\n1\t\t(a + b)2 = a2 + 2ab + b2\n2\t\t(a-b)2 = a2-2ab + b2\n3\t\ta2 + b2 = (a + b)2 - 2ab\n4\t\ta2 - b2 = (a - b)(a + b)\n5\t\t(a + b + c)2 = a2 + b2 + c2 + 2ab + 2bc + 2ca\n6\t\t(a - b - c)2 = a2 + b2 + c2 - 2ab + 2bc - 2ca\n7\t\ta3 - b3 = (a - b)(a2 + ab + b2)\n8\t\ta3 + b3 = (a + b)(a2 - ab + b2)\n9\t\t(a + b)3 = a3 + b3 + 3ab(a + b)\n10\t\t(a - b)3 = a3 - b3 - 3ab(a - b)\n0\t\tExit");
        System.out.println("Enter your choice");
        int choice=sc.nextInt();
        switch (choice){
                case 100:AlgbricExp1(6,5,false);
                AlgbricExp2(6,5);
                AlgbricExp3(6,5);
                AlgbricExp4(6,5);
                AlgbricExp5(6,5,4);
                AlgbricExp6(6,5,4);
                AlgbricExp7(6,5);
                AlgbricExp8(6,5);
                AlgbricExp9(6,5);
                AlgbricExp10(6,5);
                break;

                case 1:AlgbricExp1(6,5,false);
                break;
                case 2:AlgbricExp2(6,5);
                break;
                case 3:AlgbricExp3(6,5);
                break;
                case 4:AlgbricExp4(6,5);
                break;
                case 5:AlgbricExp5(6,5,4);
                break;
                case 6:AlgbricExp6(6,5,4);
                break;
                case 7:AlgbricExp7(6,5);
                break;
                case 8:AlgbricExp8(6,5);
                break;
                case 9:AlgbricExp9(6,5);
                break;
                case 10:AlgbricExp10(6,5);
                break;
                case 0:System.exit(1);
                default:System.out.println("Invalid option ");
        }
    }
       // System.out.println("Ended main  function");
    }
}
