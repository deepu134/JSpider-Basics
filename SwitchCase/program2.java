class program2{
    public static void main(String[] args) {
     char grade='A';
     switch(grade)
     {
        case 'A'|'a' :System.out.println("First class with Distintion");
                      break;
        case 'B'|'b':System.out.println("First class");
                      break;
        case 'C'|'c':System.out.println("Second class");
                      break;
        case 'D'|'d':System.out.println("just pass");
                      break;
        case 'E'|'e':System.out.println("Fail...get lost");
                      break;
        default:System.out.println("Invalid");
     }
 }
}