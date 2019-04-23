package extra;

import javax.swing.JOptionPane;
import javax.xml.bind.ParseConversionEvent;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
		for (int z = 1; z > 0; z++) {
			String x = JOptionPane.showInputDialog("Give me a number");
			double a = Integer.parseInt(x);
			String y = JOptionPane.showInputDialog("Give me another number");
			double b = Integer.parseInt(y);
			// 2. Customize pop-up to support add/subtract/multiply/divide operations.
			int String;
			int operation = JOptionPane.showOptionDialog(null, "With mathematical operation do you want to perform",
					"Operation", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Division", "Multiplication", "Subtraction", "Addition" }, null);

			// 5. Call the methods created in steps 3 and 4 to perform the appropriate
			// operation.
			if (operation == 3) {
				add(a, b);
			} else if (operation == 2) {
				subtract(a, b);
			} else if (operation == 1) {
				multiply(a, b);
			} else {
				divide(a, b);
			}
			// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations

		}
	}

	static void add(double a, double b) {
		double c = (a + b);
		JOptionPane.showMessageDialog(null, "" + c);
	}

	static void subtract(double a, double b) {
		double c = (a - b);
		JOptionPane.showMessageDialog(null, "" + c);
	}

	static void multiply(double a, double b) {
		double c = (a * b);
		JOptionPane.showMessageDialog(null, "" + c);
	}

	static void divide(double a, double b) {
		double c = (a / b);
		JOptionPane.showMessageDialog(null, "" + c);
	}
}
// 3. Create method for addition operation.
// Method should create pop-up that shows equation and solution, eg. 45 + 25 =
// 70.
// HINT: use 'static void add(int num1, num2) { ... }

// 4. Create similar methods for subtraction, multiplication and division.
