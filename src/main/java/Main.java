public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        String operation = args[0];
        int firstValue = Integer.parseInt(args[1]);
        int secondValue = 0;
        if (args.length == 3) {
            secondValue = Integer.parseInt(args[2]);
        }

        if (operation.equals("add")) {
            System.out.println(calculator.add(firstValue, secondValue));
        }
        if (operation.equals("sub")) {
            System.out.println(calculator.subtract(firstValue, secondValue));
        }
        if (operation.equals("multiply")) {
            System.out.println(calculator.multiply(firstValue, secondValue));
        }
        if (operation.equals("divide")) {
            System.out.println(calculator.divide(firstValue, secondValue));
        }
        if (operation.equals("fibonacci")) {
            System.out.println(calculator.fibonacciNumberFinder(firstValue));
        }
        if (operation.equals("binary")) {
            System.out.println(calculator.intToBinaryNumber(firstValue));
        }
    }
}
