//@Riku Fukumori

import structure5.*;
import java.util.Comparator;
import java.util.Scanner;
import java.io.*;

public class MyVector<E> extends Vector<E> {

    //constructor which inherits Vector constructor
    public  MyVector(){
	super();
    }

    // pre: c is a valid comparator
    // post: sort this vector in order determined by c
    //selection sort here
    public void sort(Comparator<E> c){

	for( int i = this.size() - 1; i > 0; i-- ) {
	    int big = findPosOfMax(this, i, c);
	    swap(this, i, big);
	}
    }

    //swap method which swaps two values in the vector
    private void swap(Vector v, int i, int j) {

	E temp = (E)v.get(i);
	v.set(i, v.get(j));
	v.set(j, temp);
    }

    //max finding method
    public <E> int findPosOfMax(Vector v, int last, Comparator<E> c){
	int maxPos = 0;
	//iterates through vector comparing values to find which is bigger
	for(int i = 1; i<=last; i++){
	    if (c.compare((E)v.get(maxPos), (E)v.get(i)) < 0) maxPos = i;
	}
	return maxPos;
    }

    //method which adds an association of area codes to vector if not already in vector
    public void addAreaCode( Student student ) {
        int i;
        MyVector areaCodeList = this;
        int codeNum;
        if( student.getHomePhone() == -1 ) codeNum = -1;
        else codeNum  = (int) Long.parseLong((""+student.getHomePhone()).substring(0,3));

        //if the area code is already in the list,
        //increases the association's value by one
        for ( i = 0 ; i < areaCodeList.size() ; i++ ) {
            Association phoneInfo = (Association) areaCodeList.get(i);
            int areaCode = (int) phoneInfo.getKey();
            if (areaCode==codeNum) {
                int f = (int) phoneInfo.getValue();
                phoneInfo.setValue(f + 1);
                break;
            }
        }
        //if area code not already in the vector, creates a new association
        //with that area code and a frequency of one
	if ( i == areaCodeList.size()) {
            if ( codeNum != -1 ) {
		areaCodeList.add(new Association(codeNum, 1));
	    }
	}
    }

    //creates a MyVector of associations
    public MyVector createCodeVector(){
        MyVector list = new MyVector();
	for ( int i = 0; i<this.size(); i++ ){
            list.addAreaCode((Student) this.get(i));
        }
        return list;
    }

    //creates a new vector of Students and adds a Student to the vector when it finds ---
    public static MyVector createStudentVector(String path) throws IOException{

	//reads in text
	MyVector vector = new MyVector();
	File text = new File(path);
	Scanner scanner = new Scanner(text);

	//sets each line in scanner equal to property of Student
	while(scanner.hasNextLine()){
	    if (scanner.nextLine().startsWith("---")) {
		//if reaches last line
		if(! scanner.hasNextLine()) break;
                String name = scanner.nextLine();
		String address = scanner.nextLine();
		long campusPhone = scanner.nextLong();
		int suBox = scanner.nextInt();
		long homePhone = scanner.nextLong();
                Student student = new Student(name, address, campusPhone, suBox, homePhone);
		vector.add(student);
            }
        }
	return vector;
    }

    //uses Vector toString method
    public String toString(){
	return super.toString();
    }
}
