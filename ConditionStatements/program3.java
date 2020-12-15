//Bank balance problem
public class program3 {
    public static void main(String[] args) {
        double balance_amount=5000.00,Debit_amount=3500.56;
        if(Debit_amount<=balance_amount){
            balance_amount=balance_amount-Debit_amount;
            System.out.println(Debit_amount+" debited Sucessfully...");
        }
        else{
            System.out.println("Insufficient Balance..Please try again later.....!");
        }
        System.out.println("Current balance is "+balance_amount);
    }
}
