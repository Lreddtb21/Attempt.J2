package Input.grade;
import java.util.*;

public class GradesInput {
	public static double calcAverage(double score1,double score2, double score3, double score4, double score5) {
		double average;
		average = (score1 + score2 + score3 + score4 + score5) / 5;
		return average;
			
	}
	
	public static String determineGrade(double testScore) { 
		
		String letterGrade = "";
		if(testScore < 60) {
			letterGrade = "F";
		}else if( testScore < 70 ){
			letterGrade = "D";
		}else if ( testScore < 80) {
			letterGrade = "C";
		}else if( testScore < 90) {
			letterGrade = "B";
		}else if( testScore < 101) {
			letterGrade = "A";
		}
	    return letterGrade;
	}
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOfScores = 5;
		double userScore;
		double Score1 = 0;
		double Score2 = 0;
		double Score3 = 0;
		double Score4 = 0;
		double Score5 = 0;
		String outputString = "Score \b \b \b Letter Grade\n";
				
			  
		
		for( int currentScore = 1; currentScore<= numberOfScores; currentScore++) {
			     System.out.println("Hello " + "Please enter a grade: " +  "Yes");
			     System.out.println("Please enter another grade:");
			  
			     userScore = scanner.nextDouble();
			     
			     if(currentScore == 1) {
			    	 Score1 = userScore;
			    	 outputString += Score1 + "\t\t\t" + determineGrade( Score1) + "\n";
			     }else if(currentScore == 2) {
			    	 Score2 = userScore; 
			    	 outputString += Score2 + "\t\t\t" + determineGrade( Score2) + "\n";
			     }else if(currentScore == 3) {
			    	 Score3 = userScore;
			    	 outputString += Score3 + "\t\t\t" + determineGrade( Score3) + "\n";
			     }else if(currentScore == 4) {
			    	 Score4 = userScore;
			    	 outputString += Score4 + "\t\t\t" + determineGrade( Score4) + "\n";
			     }else if(currentScore == 5) {
			    	 Score5 = userScore;
			    	 outputString += Score5 + "\t\t\t" + determineGrade( Score5) + "\n";
			    	 
			     }
		}
        System.out.println( outputString + "Average: " + calcAverage( Score1, Score2, Score3, Score4, Score5));
        System.out.println("0 Student(s) failed");
        System.out.println("Thank You!");
        
	}

}
