import java.text.NumberFormat;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Money: ");
    int money = scanner.nextInt();
    System.out.print("Interest Rate: ");
    float interestRate = scanner.nextFloat();
    double r = interestRate/100/12;
    System.out.print("duration:");
    byte months = scanner.nextByte();

    double mortgage = money *(r*Math.pow((1+r), months)/(Math.pow((1+r), months)-1));
    String mortgageFormated = NumberFormat.getCurrencyInstance().format(mortgage);

    System.out.println("mortgage :" + mortgageFormated);
    }
}