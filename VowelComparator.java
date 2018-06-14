//@Riku Fukumori

import java.util.Comparator;

//class which compares the number of vowels in a student's name by
//calling the getNumberOfVowels() method from the Student class
public class VowelComparator implements Comparator<Student>{

    public int compare( Student a, Student b ){
	if (a.getNumberOfVowels(a.getName())<b.getNumberOfVowels(b.getName())) return -1;
	else if (a.getNumberOfVowels(a.getName())==b.getNumberOfVowels(b.getName())) return 0;
	else return 1;
    }

}
