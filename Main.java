import structure5.*;
import java.io.*;

//class which prints out the answers to all the questions
public class Main{

    public static void main(String[] args) throws IOException{
	//creates students vector from the file read in using createStudentVector() method
    	   MyVector students = MyVector.createStudentVector("newphonebook.txt");
	   
	   //question 4A)
	   MyVector namesOfStudents = students;
	   namesOfStudents.sort(new NameComparator());
	   System.out.println("The student that appears first in a phone book by first name is: " + namesOfStudents.get(0).toString() );

	   //question 4B)
	   MyVector suboxes = students;
	   suboxes.sort(new SUBoxComparator());
	   System.out.println("The student with the smallest SUbox is: " + suboxes.get(0).toString());
	   System.out.println("The student with	the largest SUbox is: "	+ suboxes.get(suboxes.size()-1).toString());

	   //question 4C)
	   MyVector nameVowels = students;
	   nameVowels.sort(new VowelComparator());
	   System.out.println("The student with the most vowels in their name is: " + nameVowels.get(nameVowels.size()-1).toString());

	   //question 4E)
	   MyVector areaCodes = students.createCodeVector();
	   areaCodes.sort(new AreaCodeComparator());
	   System.out.println("The ten most common area codes are: ");
	   //starts at the end of the vector because area codes sorted in increasing order
	   for(int i = areaCodes.size()-1; i>areaCodes.size()-11; i--){
	       Association codeInfo = (Association) areaCodes.get(i);
	       System.out.print( codeInfo.getKey() + ", " );
	   }


      }
}
