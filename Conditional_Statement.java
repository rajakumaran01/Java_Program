package firstproject;

public class Conditional_Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Maths = 83;
		int science = 72;
		int English = 87;
		double averageMark = (Maths + science + English) / 3; // Calculates the average

		System.out.println("Average = " + averageMark);

		if (Maths < 35 || science < 35 || English < 35) {
			System.out.println("Failed due to low score in at least one subject."); // Check if any subject mark is
																					// below 35.

		} else if (averageMark >= 90 && averageMark <= 100) {

			System.out.println("Grade: A+ - Excellent performance!"); // 90-100 : A+
		} else if (averageMark >= 75 && averageMark <= 89) {

			System.out.println("Grade: A - Excellent performance!"); // 75-89 : A

		} else if (averageMark >= 60 && averageMark <= 74) {

			System.out.println("Grade: B - Keep improving."); // 60-74 : B

		} else if (averageMark >= 40 && averageMark <= 59) {

			System.out.println("Grade: C - Keep improving."); // 40-59 : C

		} else {
			System.out.println("Please work harder next time."); // <40 : Fail

		}
	}
}
