public class RecursiveFunction {
        //print from 1 to 5 in recursive function
    static void recursiveFunction(int num){
        //base case
        if (num == 1)
            System.out.print(num + " ");
        else {
            //recursive case
            recursiveFunction(num - 1);
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {


        recursiveFunction(5);
    }
}
