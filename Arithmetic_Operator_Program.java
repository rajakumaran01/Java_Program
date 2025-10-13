package firstproject;

public class Arithmetic_Operator_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Math = 197;
		int Science = 189;
		int English = 168;

		int totalMarks = Math + Science + English;
		System.out.println("The TotalMarks of the three Subjects are " + totalMarks);
		int averageMarks = totalMarks/3;
		System.out.println("The AverageMarks of the three Subjects are " + averageMarks);
		double totalMark = totalMarks;
		System.out.println("Value converted from int to double is "+totalMark);
		double averageMarks1 = totalMark / 3;
		System.out.println("The Marks converted form 'int' data type into 'double' is " +averageMarks1);
		float avgMrks = (float)averageMarks1;
		System.out.println("The Marks converted form 'double' data type into 'float' is " +avgMrks);

	}

}
