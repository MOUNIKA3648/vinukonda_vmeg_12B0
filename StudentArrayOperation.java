import java.util.Date;
import java.io.*;
/**
 * An interface that provide a number of operations for any array of students
 *
 */
public interface StudentArrayOperation {

	/**
	 * Returns the array of students
	 * 
	 * @return the array of students
	 * 
	 */
	Student[] getStudents();
	

	/**
	 * Sets the array of students
	 * if students == null method should throw IllegalArgumentException
	 *
	 * @param students
	 * 
	 * @throws IllegalArgumentException
	 */
	void setStudents(Student[] students)
	{
	student[0]=
;
	

	/**
	 * if index lower than 0 or index higher/equal students.length method should
	 * throw IllegalArgumentException
	 *
	 * @param index
	 */
	Student getStudent(int index);

	
	/**
	 * Replaces the element at the specified position in this array with the
	 * specified element. if student == null method should throw
	 * IllegalArgumentException if index lower than 0 or index higher/equal
	 * students.length method should throw IllegalArgumentException
	 *
	 * @param student
	 *            the student to be stored at the specified position
	 * @param index
	 *            the index of the element to replace
	 * 
	 * 
	 * @throws IllegalArgumentException
	 */
	void setStudent(Student student, int index);

	
	/**
	 * Appends the specified element to the specified position of this array if
	 * student == null method should throw IllegalArgumentException if index
	 * lower than 0 or index higher/equal students.length method should throw
	 * IllegalArgumentException
	 *
	 * @param student
	 *            the element to be appended to this array at the specified
	 *            position
	 * @param index
	 *            the specified position
	 * 
	 * @throws IllegalArgumentException
	 */
	void add(Student student, int index){
;

	
	/**
	 * Inserts the specified element at the beginning of this array if student
	 * == null method should throw IllegalArgumentException
	 *
	 * @param student
	 *            the element to add
	 * 
	 * @throws IllegalArgumentException
	 */
	void addFirst(Student student);
	

	/**
	 * Appends the specified element to the end of this array. if student ==
	 * null method should throw IllegalArgumentException
	 *
	 * @param student
	 *            the element to add
	 * 
	 * @throws IllegalArgumentException
	 */
	void addLast(Student student);
	

	/**
	 * Removes the element at the specified position in this array if index
	 * lower than 0 or index higher/equal students.length method should throw
	 * IllegalArgumentException
	 *
	 * @param index
	 *            the index of the element to be removed
	 * 
	 * @throws IllegalArgumentException
	 */
	void remove(int index);
	

	/**
	 * Removes the first occurrence of the specified element from this array, if
	 * it is present. If this array does not contain the element, it is
	 * unchanged and should throw IllegalArgumentException with "Student not
	 * exist" message if student == null method should throw
	 * IllegalArgumentException
	 *
	 * @param student
	 *            the element to remove
	 * 
	 * @throws IllegalArgumentException
	 */
	void remove(Student student);

	
	/**
	 * Removes all elements from the specified index (except the element with
	 * specified index) from this array if index lower than 0 or index
	 * higher/equal students.length method should throw IllegalArgumentException
	 *
	 * @param index
	 *            the index elements from should be removed
	 * 
	 * @throws IllegalArgumentException
	 */
	void removeFromIndex(int index);

	
	/**
	 * Removes all elements from the specified element (except the specified
	 * element) from this array if student == null method should throw
	 * IllegalArgumentException
	 *
	 * @param student
	 *            the element from elements should be removed
	 * 
	 * @throws IllegalArgumentException
	 */
	void removeFromElement(Student student);

	
	/**
	 * Removes all elements to the specified index (except the element with the
	 * specified index) from this array if index lower than 0 or index
	 * higher/equal students.length method should throw IllegalArgumentException
	 *
	 * @param index
	 *            the index elements to should be removed
	 * 
	 * @throws IllegalArgumentException
	 */
	void removeToIndex(int index);

	
	/**
	 * Removes all elements to the specified element (except the specified
	 * element) from this array if student == null method should throw
	 * IllegalArgumentException
	 *
	 * @param student
	 *            the element to elements should be removed
	 * 
	 * @throws IllegalArgumentException
	 */
	void removeToElement(Student student);
	

	/**
	 * Performs Bubble Sort to this array
	 *
	 */
	void bubbleSort();

	
	/**
	 * Returns all students with birthday to the specified date if date == null,
	 * method should throw IllegalArgumentException
	 * 
	 * @param date
	 *            the date that specify birthday to find students who was born
	 *            before that date and in that date
	 * 
	 * @return the array of students who was born before/in specified date
	 * 
	 * @throws IllegalArgumentException
	 */
	Student[] getByBirthDate(Date date){
{
String d=new String();
Scanner sn=new Scanner(System.in);
d=sn.next();
for(int i=0;i<temp;i++)
{

//if(d.compareTo(dob[i])==0)
if(d.equals(dob[i]))
{
System.out.print("\n\n");
System.out.println("student name = "+name[i]);
System.out.println("student date of birth = "+dob[i]);
System.out.println("student marks = "+marks[i]);
System.out.print("\n\n");
}

}

}

	
	/**
	 * Returns all students with birthday to the specified range of dates
	 * including specified dates if firstDate == null or lastDate == null,
	 * method should throw IllegalArgumentException
	 * 
	 * @param firstDate
	 *            the date that specify birthday to find students from
	 * @param lastDate
	 *            the date that specify birthday to find students to
	 * 
	 * @return the array of students who was born in specified range of dates
	 * 
	 * @throws IllegalArgumentException
	 */
	Student[] getBetweenBirthDates(Date firstDate, Date lastDate);

	
	/**
	 * Returns all students with birthday to the specified date and in several
	 * days after the specified date if date == null, method should throw
	 * IllegalArgumentException
	 * 
	 * @param date
	 *            the date that specify birthday to find students from
	 * @param days
	 *            the number of days that specify the end date
	 * 
	 * @return the array of students who has birthday in specified date and
	 *         several days after
	 * 
	 * @throws IllegalArgumentException
	 */
	Student[] getNearBirthDate(Date date, int days)
{
{
Scanner sn=new Scanner(System.in);
int i=sn.nextInt();
String abc=sn.next();
Date date = new Date();
		System.out.println("Todays date: "+date.toString());
		//test addDays method
		int k=i;
		//while(i<=k){
			Date newDate = addDays(date, i);
			System.out.println("Java Date after adding "+i+" days: "+newDate.toString());
			//i+=10;
		//}
		System.out.println("\n\n");
		//test subtractDays method
	
	//	while(i<=k){
	//		Date newDate = subtractDays(date, 10);
	//		System.out.println("Java Date after subtracting "+i+" days: "+newDate.toString());
	//		i+=10;
	//	}

	
}
	

	/**
	 * Find student at the specified position and calculate his age (total
	 * years) if indexOfStudent == 0, method should throw
	 * IllegalArgumentException
	 * 
	 * @param indexOfStudent
	 *            the index to find student and calculate age
	 * 
	 * @return student full years
	 * 
	 * @throws IllegalArgumentException
	 */
	int getCurrentAgeByDate(int indexOfStudent);

	
	/**
	 * Returns all students with age equal the specified age
	 * 
	 * @param age the age to find students
	 * 
	 * @return the array of students of the specified age
	 */
	Student[] getStudentsByAge(int age)
{
{
for(int i=0;i<temp;i++)
{
String datetext = dob[i]; // Date in text


try {
      Calendar birth = new GregorianCalendar();
      Calendar today = new GregorianCalendar();
      int age = 0;
      int factor = 0; //to correctly calculate age when birthday has not been yet celebrated
      Date birthDate = new SimpleDateFormat("MM-dd-yyyy").parse(datetext);
      Date currentDate = new Date(); //current date
      
      birth.setTime(birthDate);
      today.setTime(currentDate);
      
      // check if birthday has been celebrated this year
      if(today.get(Calendar.DAY_OF_YEAR) < birth.get(Calendar.DAY_OF_YEAR)) {
            factor = -1; //birthday not celebrated
      }
      age = today.get(Calendar.YEAR) - birth.get(Calendar.YEAR) + factor;
System.out.print("\n\n");
System.out.println("student name = "+name[i]);
System.out.println("student date of birth = "+dob[i]);
System.out.println("student marks = "+marks[i]);
System.out.println("AGE (years): "+age);

System.out.print("\n\n");

} catch (Exception e) {
      System.out.println("Given date: "+datetext+ " not in expected format (Please enter a MM-DD-YYYY date)");
}
}
}

	

	/**
	 * Finds the maximum average mark for all students in this array
	 * and returns all students who has the maximum average mark
	 * 
	 * @return the array of students who has maximum average mark
	 * 
	 */
	Student[] getStudentsWithMaxAvgMark();

	
	/**
	 * Finds element which is the next to the specified element
	 * if student == null, method should throw IllegalArgumentException
	 * 
	 * @param student the element to which take the next element
	 * 
	 * @throws IllegalArgumentException
	 */
	Student getNextStudent(Student student);

}
