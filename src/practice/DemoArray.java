package practice;

public class DemoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] salaries = {6.25, 6.55, 10.25, 16.85};
		double total = 0;

		System.out.println("Salaries one by one are: ");

		for(int i = 0; i < salaries.length; i = i + 1) {
			System.out.println(salaries[i]);
			total = total + salaries[i];
		}
		System.out.println("Total: " + total);

	}

}
