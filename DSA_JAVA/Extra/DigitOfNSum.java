import java.math.BigInteger;
import java.util.Scanner;
public class DigitOfNSum
{
    public static void main(String[] args) 
    {
        //here is a 255 digits numbers N1 and N2 SUM is display on C2

    //  String n1="123456789101234567891012345678910123456789101234567891012345678910123456789101234567891012345678910123456789101234567891012345678910123456789101234567891012345678910123456789101234567891012345678910123456789101234567891012345678910123456789101234567891012";
    //  String n2="101054567891010545678910105456789101054567891010545678910105456789101054567891010545678910105456789101054567891010545678910105456789101054567891010545678910105456789101054567891010545678910105456789101054567891010545678910105456789101054567891010545678910";
        Scanner s=new Scanner(System.in);
        //Get two Number From User and Pass this Two To Big int
        System.out.print("Please Enter a Number : ");
        String n1=s.nextLine();
        System.out.print("Please Enter A Number : ");
        String n2=s.nextLine();
        System.out.println("Please Enter What you want to perform (+,-,*,/,%) : ");
        String op=s.nextLine();
        s.close();
        
        BigInteger Number1 =new BigInteger(n1);
        BigInteger Number2 =new BigInteger(n2);
        BigInteger Operation;
        //use Switch Statemetns for Oprations
        switch (op.charAt(0)) {
            case '+':
            
             Operation =Number1.add(Number2);
            System.out.println("you value is : "+Operation);
            break;
            
            case '-':
            Operation =Number1.subtract(Number2);
            System.out.println("you value is : "+Operation);
            
            break;
            
            case '*':
            
            Operation =Number1.multiply(Number2);
            System.out.println("you value is : "+Operation);
            break;
            
            case '/':

             Operation =Number1.divide(Number2);
            System.out.println("you value is : "+Operation);
            break;
            
            case '%':
            
             Operation =Number1.mod(Number2);
            System.out.println("you value is : "+Operation);
            break;
            
            default:
            System.out.println("Please Enter A valid Operation :(  ..!");
            break;
        }
            
        }
    }
