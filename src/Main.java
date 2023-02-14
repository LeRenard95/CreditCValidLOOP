import java.util.Scanner;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter credit card number");
        int credit_card_number = scan.nextInt();
        System.out.println(credit_card_number);


        LinkedList<Integer> stack = new LinkedList<Integer>();
        while (credit_card_number > 0) {
            stack.push(credit_card_number % 10);
            credit_card_number = credit_card_number / 10;
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop()*2);
        }
    }
}