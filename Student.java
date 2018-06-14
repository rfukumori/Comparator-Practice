//@Riku Fukumori

public class Student {

    //global variables
    long homePhone;
    long campusPhone;
    int suBox;
    String name;
    String address;

    public Student( String name, String address, long campusPhone, int suBox, long homePhone ){
	//initialize variables
	this.name = name;
	this.address = address;
	this.suBox = suBox;
	this.homePhone = homePhone;
	this.campusPhone = campusPhone;
    }

    //returns the Student's name
    public String getName(){
	return this.name;
    }

    //returns the Student's address
    public String getAddress(){
	return this.address;
    }

    //returns the Student's SU Box
    public int getsuBox(){
	return this.suBox;
    }

    //returns the Student's home phone number
    public long getHomePhone(){
	return this.homePhone;
    }

    //returns the Student's campus phone number
    public long getCampusPhone(){
	return this.campusPhone;
    }

    //returns the number of vowels in the Student's name
    public int getNumberOfVowels(String name){
	int count = 0;
	//goes through the string and checks if each letter is a vowel or not
	for ( int i = 0; i < name.length(); i++){
	    char letter = Character.toLowerCase(name.charAt(i));
	    if ( letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' ) {
		count++;
	    }
	}
	//returns the number of vowels
	return count;
    }


    //toString() method which prints students name
    public String toString() {
	return this.name;
    }

}
