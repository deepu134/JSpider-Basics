import javax.lang.model.util.ElementScanner6;

//GREATEST AMONG THREE NUMBERS
public class program1 {
    public static void main(String[] args) {
        int x=100,y=20,z=50;
        if(x>y && x>z){
            System.out.println("X is greater");
        }
        else if(y>x&&y>z){
            System.out.println("y is greater");
        }
        else{
            System.out.println("Z is greater");
        }
    }
}
