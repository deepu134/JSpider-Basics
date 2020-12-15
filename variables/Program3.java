class Program3 {
    public static void main(String[] args) {
        double salary=500000.000,tax=0.30,totalearn;
        totalearn=salary-(salary*tax);
        tax=tax*100;
        System.out.println("total Earning after "+tax+"% of tax is "+totalearn);
    }    
}
