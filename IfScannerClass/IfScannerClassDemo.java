import java.util.Scanner;

public class IfScannerClassDemo
{
    public static void main(String[]args){
        Scanner obj = new Scanner(System.in);
        
        System.out.print("Please enter your note: ");
        double note = obj.nextDouble();
        
        if(note>=70){
            System.out.print("You passed the exam.");
        }
        else{
            System.out.print("You failed the exam.");
        }
    }
}
