public class SumFunction {

    static int sumFunction(int a, int b){
        var result = a + b;
        return result;
    }

    public static void main(String[] args) {

        int arg1 = 397, arg2 =455;
        var function_result =sumFunction(arg1, arg2);

        System.out.println("function_result = " + function_result);

        var otherResult = sumFunction(33,43);
        System.out.println("otherResult = " + otherResult);
    }
}
