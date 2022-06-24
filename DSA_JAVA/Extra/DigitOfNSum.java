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
        s.close();

        BigInteger Number1 =new BigInteger(n1);
        BigInteger Number2 =new BigInteger(n2);
        //use add method to add this to number given by user
        BigInteger Operation =Number1.add(Number2);
        System.out.println("you value is : "+Operation);

    }
}