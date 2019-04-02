package charAt_scanners_optionDialogs;

import java.util.Random;

import javax.swing.JOptionPane;

public class HappyPet {

	// 2. Add the following variable to the next line: static int happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	static Random rand = new Random();
	static int a = rand.nextInt(2);

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable

		String x = JOptionPane.showInputDialog("What kind of pet do you want to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int y = 0; y < 6; y++) {
			a = rand.nextInt(2);
			// 3. Use showOptionDialog to ask the user what they want to do to make their
			// pet happy
			// (eg: cuddle, food, water, take a walk, groom, clean up poop).
			// Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What Do you want to do to make your pet happy?", "Activities", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Cuddle", "Take on walk", "Feed" }, null);
System.out.println(task);
			// 5. Use user input to call the appropriate method created in step 4.
			JOptionPane.showMessageDialog(null, nextString(task));
			// 6. If you determine the happiness level is large enough, tell the
			// user that he loves his pet and use break; to exit for loop.
		}
	}

	// 4. Create methods to handle each of your user selections.
	public static String nextString(int task) {
		// Each method should create a pop-up with the pet's response (eg. cat might
		// purr when pet),
		// and INCREMENT the pet's happiness Level.
		if (task == 0) {
			return "Your pet is happy";
		} else if (task == 1) { 
			return "Your pet is having fun";
		} else 
			return "Your pet is well fed";
	}
}