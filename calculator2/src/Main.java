import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        char repeat=0, choice=0;
        do {
            String input1 = JOptionPane.showInputDialog("Write first number: ");
            double firstNumber = Integer.parseInt(input1);

            String input2 = JOptionPane.showInputDialog("Write second number: ");
            double secondNumber = Integer.parseInt(input2);

            //calling constructor
            CalculatorMethods calculatorMethods = new CalculatorMethods(firstNumber, secondNumber);

            String choiceQ = JOptionPane.showInputDialog("Choose an operation:"
                    + '\n'  + " For addition               ( + )"
                    + '\n' + "  For subtraction        ( - )"
                    + '\n' + "  For multiplication    ( * )"
                    + '\n' + "  For division               ( / )"
                    + '\n' + "  For percentage        ( % )"
                    + '\n' + "  For sum of field       ( s )"
                    + '\n' + "  For average              ( a )", choice);

            // will read the character
            choice = choiceQ.charAt(0);

            switch (choice) {
                case '+':
                    calculatorMethods.addition();
                    break;
                case '-':
                    calculatorMethods.subtraction();
                    break;
                case '*':
                    calculatorMethods.multiplication();
                    break;
                case '/':
                    calculatorMethods.division();
                    break;
                case 's':
                    calculatorMethods.sum_of_field();
                    break;
                case 'a':
                    calculatorMethods.average();
                    break;
                case '%':
                    calculatorMethods.percentage();
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"invalid operation");
            }
            // Asks user whether the user wants to run  the program again
            String repeatQ = JOptionPane.showInputDialog("Start over? (type yes)",repeat);
            repeat=repeatQ.charAt(0);
        }
        //if the input doesn't start with the letter Y/y, the program will terminate
         while (repeat == 'Y'|| repeat == 'y');
    }
}
