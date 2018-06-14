//@Riku Fukumori

import java.util.Comparator;

//comparator class which compares two suBoxes
public class SUBoxComparator implements Comparator<Student>{

    public int compare( Student a, Student b) {
	if (a.getsuBox()<b.getsuBox()) return -1;
	else if (a.getsuBox()==b.getsuBox()) return 0;
	else return 1;
    }
}
