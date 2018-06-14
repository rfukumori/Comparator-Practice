//@Riku Fukumori

import java.util.Comparator;

//comparator class which compares names of students alphabetically
public class NameComparator implements Comparator<Student> {

    public int compare(Student a, Student b){
	return a.getName().compareTo(b.getName());
    }
}
