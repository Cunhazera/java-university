import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GreatestFromThree {

	public static void main(String args[]) {
		String first = args[0];
		String second = args[1];
		String third = args[2];

		double numberOne = Double.parseDouble(first);
		double numberTwo = Double.parseDouble(second);
		double numberThree = Double.parseDouble(third);

		List<Double> list = Arrays.asList(numberOne, numberTwo, numberThree);
		System.out.println("The greatest value from the three is " + Collections.max(list));
	}

}
