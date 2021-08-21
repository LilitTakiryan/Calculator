import javax.swing.JOptionPane;
public class CalculatorMethods {
    double firstNumber, secondNumber;

    CalculatorMethods(double firstNumber, double secondNumber) //constructor
    {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    void addition()
    {
        JOptionPane.showMessageDialog(null, "Addition: "+firstNumber+" + "+secondNumber +" = "+ (firstNumber + secondNumber));
    }

    void subtraction()
    {
        JOptionPane.showMessageDialog(null, "Subtraction: "+firstNumber+" - "+secondNumber +" = " + (firstNumber - secondNumber));
    }

    void multiplication()
    {
        JOptionPane.showMessageDialog(null, "Multiplication: " + firstNumber+" * "+secondNumber +" = "+firstNumber * secondNumber);
    }

    void division()
    {
        if (secondNumber == 0)
        {
            JOptionPane.showMessageDialog(null,"cannot be divided by 0");
        }
        JOptionPane.showMessageDialog(null, "Division: " +firstNumber+" / "+secondNumber +" = "+ firstNumber / secondNumber);
    }
    void sum_of_field()
    { // sum of the all numbers in the field
        JOptionPane.showMessageDialog(null, "Sum " +(secondNumber*(secondNumber+firstNumber))/2);
    }
    void average()
    {
        JOptionPane.showMessageDialog(null, "Average: " + (firstNumber + secondNumber)/2);
    }
    void percentage()
    {
        JOptionPane.showMessageDialog(null, "Percentage: " + (firstNumber/secondNumber)*100);
    }

}
//to delete tab  click in the beginning of the line and then click alt and select space then del