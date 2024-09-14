import java.util.Scanner;

public class PairFunction {
    static boolean isPair(int num){
        return num % 2 == 0;
    }
    public static void main(String[] args) {

        System.out.println("Give a number to check if it is pair: ");
        var num = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println("Pair number? " + isPair(num));
    }
}
