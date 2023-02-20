package test141;
/**
 * 
 * @author rbca21141
 * @version (2.0)
 * class creates a class Grader 
 * <p>
 * this class stimulates the grade, total_marks and roll number of the Grader
 * <br>
 * 
 */

public class Grader 
{


	String grade;
	int total_marks;
	String roll_num;
	
	
	Grader(int total_marks,String roll_num)
	/**
	 * this constructor initializes the attributes 
	 * <br>
	 * Total marks and Roll number
	 * <br>
	 */
	{
		this.total_marks = total_marks;
		this.roll_num = roll_num;
	}
	/**
	 * this method computes the grades of the Grader
	 */
 void Compute_Grade()
 {
	 if (total_marks>=60)
	 {
		 grade ="A";
		 
	 }
	 else
	     grade ="P";
 }
 /**
  * 
  * @return - returns back to the grade
  */
 String get_grade()
 {
	 return grade;
 }
 
 String get_roll_num()
 {
	 return roll_num;
 }
 /**
  * 
  * @param args
  */
 
public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	/**
	 * This is the main method to display the grade and roll number
	 * <br>
	 */
	Grader g = new Grader(70,"R/BCA-777");
	}
}

