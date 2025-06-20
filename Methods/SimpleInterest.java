package Methods;

import java.util.Scanner;
public class SimpleInterest {

    public static int  simpleInterest( int Principal, int Rate, int Time){
        int simpleInterest = (Principal * Rate * Time) / 100;
        return simpleInterest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Principal: ");
        int Principal = sc.nextInt();
        System.out.print("Enter Rate: ");
        int Rate = sc.nextInt();
        System.out.print("Enter Time: ");
        int Time = sc.nextInt();

        int SimpleInterest = simpleInterest(Principal, Rate, Time);

        System.out.println("The Simple Interest is " + SimpleInterest + " for Principal " + Principal +", Rate of Interest "+ Rate + " and Time " + Time);
        sc.close();
    }
}
