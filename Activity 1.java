//Julom, Nathalene S.
//BSIT - 3B
//Activity 1: Basic Math with Condition

class BasicMath {
    public static void main(String[] args) {
        //Initialize operands and operator
        int num1 = 5, num2 = 5;
        char op = '*';
        
        System.out.println("First Number: " + num1);
        System.out.println("Second Number: " + num2);
        System.out.println("Operation (+ - * /): " + op);
        
        double answer;
        
        switch (op) {
            case '+':
                answer = num1 + num2;
                System.out.println("The sum of " + num1 + " and " + num2 + " is " + answer);
                break;
            case '-':
                answer = num1 - num2;
                System.out.println("The difference of " + num1 + " and " + num2 + " is " + answer);
                break;
            case '*':
                answer = num1 * num2;
                System.out.println("The product of " + num1 + " and " + num2 + " is " + answer);
                break;
            case '/':
                if (num2 != 0) {
                    answer = num1 / num2;
                    System.out.println("The quotient of " + num1 + " and " + num2 + " is " + answer);
                }
                else {
                    System.out.println("Error: Can't divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid operation.");
                break;
        }
    }
}
