//@Riku Fukumori

import java.util.Comparator;
import structure5.*;

//Comparator class which compares two associations of area codes of the Student's home phone numbers
public class AreaCodeComparator implements Comparator<Association>{

    public int compare( Association a, Association b){
	int aValue = (int) a.getValue();
	int bValue = (int) b.getValue();
	if (aValue<bValue) return -1;
	else if (aValue==bValue) return 0;
	else return 1;
    }
}
