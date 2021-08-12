package ro.fasttrackit.course3.calculator_class;

public class Calculator {
    public static void main(String[] args) {
        calculate(145, 29, CalculatorEnum.MULTIPLY);


    }

    public static void calculate(int op1, int op2, CalculatorEnum opType) {
        switch (opType){
            case ADD:
                System.out.println(" The result is " + op1 + op2 );
                break;
            case SUBTRACT:
                System.out.println(" The result is " + (op1 - op2));
                break;
            case MULTIPLY:
                System.out.println(" The result is " + op1 * op2);
                break;
            case DIVIDE:
                System.out.println(" The result is " + op1 / op2);
                break;
        }
    }
}



