class program3{
    public static void main(String[] args) {
        char grade='A';
     switch(grade)
     {
        case 'a' :
        case 'A':System.out.println("First class with Distintion");
                      break;
        case 'b':
        case 'B':System.out.println("First class");
                      break;
        case 'c':
        case 'C':System.out.println("Second class");
                      break;
        case 'D':
        case 'd':System.out.println("just pass");
                      break;
        case 'E':
        case 'e':System.out.println("Fail...get lost");
                      break;
        default:System.out.println("Invalid");
     }
    }
}