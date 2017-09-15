import java.util.Date;
import java.util.*;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */

public class StudentGroup implements StudentArrayOperation {
	private int length;
	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
		this.length=length;

	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
			return this.students;
		}
		

		/**
	 * Sets the array of students
	 * if students == null method should throw IllegalArgumentException
	 *
	 * @param students
	 * 
	 * @throws IllegalArgumentException
	 */

	//}
	ArrayList<Student> al=new ArrayList<Student>();
	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		/*for(Student stu:students){
			//System.out.println("id=="+stu.getId()+"\tname=="+stu.getFullName()+"\tdob=="+stu.getBirthDate()+"\tmarks=="+stu.getAvgMark());
		}*/
		if(students==null){
			throw new IllegalArgumentException();
		}
		else{
			for(int i=0;i<length;i++){
				this.students[i]=students[i];
			}
			for(int i=0;i<length;i++){
				this.al.add(this.students[i]);
			}
			//System.out.println("in the ArrayList");
			/*for(int i=0;i<length;i++)
					System.out.println("al="+al.get(i).getFullName());*/
			/*System.out.println("Data setted success");
			System.out.println("in the datasetting ArrayList");
			for(Student i:al)
			System.out.println(i.getFullName());*/	
		}
		



		/**
	 * if index lower than 0 or index higher/equal students.length method should
	 * throw IllegalArgumentException
	 *
	 * @param index
	 */
	}

	@Override
	public Student getStudent(int index) {
		//System.out.println("index=="+index);
		//System.out.println("obje=="+students[index]);
		// Add your implementation here
		//System.out.println("result=="+students[index].getId()+"\t"+students[index].getFullName()+"\t"+students[index].getBirthDate()+"\t"+students[index].getAvgMark());
		if(index<0 || index>=length){
			throw new IllegalArgumentException();
		}
		else{
			return students[index];
		}

		/**
	 * if index lower than 0 or index higher/equal students.length method should
	 * throw IllegalArgumentException
	 *
	 * @param index
	 */
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		if(student==null || index<0 || index>=length){
			throw new IllegalArgumentException();
		}
		else{
			this.al.set(index,student);
			/*System.out.println("setting at "+index+"\tval=="+al.get(index).getFullName());
			System.out.println("In setting student");
			for(Student i:al)
			System.out.println(i.getFullName());*/	
		}
		

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

	}

	@Override
	public void addFirst(Student student) {
		if(student==null){
			throw new IllegalArgumentException();
		}
		else{
			this.al.add(0,student);
			length++;
			/*System.out.println("addFirst "+al.get(0).getFullName());
			for(Student i:al)
			System.out.println(i.getFullName());*/

			this.students = new Student[length];
			this.length=length;
			for(int i=0;i<length;i++){
				students[i]=al.get(i);
			}
		}
		// Add your implementation here
		


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
	}

	@Override
	public void addLast(Student student) {
		if(student==null){
			throw new IllegalArgumentException();
		}
		else{
			this.al.add(student);
			//System.out.println("setting at last "+al.get(al.size()-1).getFullName());
			length++;
			//System.out.println("addLast hari");
			/*for(Student i:al)
			System.out.println(i.getFullName());
*/
			this.students = new Student[length];
			this.length=length;
			for(int i=0;i<length;i++){
				students[i]=al.get(i);
			}
		}
		// Add your implementation here
		
	}

	@Override
	public void add(Student student, int index) {
		if(student==null || index<0 || index>=length){
			throw new IllegalArgumentException();
		}
		else{
			this.al.add(index,student);
			//System.out.println("setting at "+index+"\tval=="+al.get(index).getFullName());
			/*for(Student i:al)
			System.out.println(i.getFullName());*/
			length++;

			this.students = new Student[length];
			this.length=length;
			for(int i=0;i<length;i++){
				students[i]=al.get(i);
			}
		}
		// Add your implementation here
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		if(index>=0 && index<length){
			length--;
			this.al.remove(index);
			/*System.out.println("in  the removing using index");
			for(Student i:al)
			System.out.println(i.getFullName());*/

			this.students = new Student[length];
			this.length=length;
			for(int i=0;i<length;i++){
				students[i]=al.get(i);
			}
		}
		else{
			throw new IllegalArgumentException();
		}
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		if(student==null){
			throw new IllegalArgumentException();
		}
		else{
			if(al.contains(student)){
				int index=al.indexOf(student);
				//System.out.println("indexof element=="+index);
					al.remove(index);
					length--;
				/*	System.out.println("in  the removing using element");
					for(Student i:al)
					System.out.println(i.getFullName());
*/
					this.students = new Student[length];
					this.length=length;
					for(int i=0;i<length;i++){
						students[i]=al.get(i);
					}	
			}
			else{
				throw new IllegalArgumentException("Student not exists");
			}
		}
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		if(index<0 || index>=length){
			throw new IllegalArgumentException();
		}
		else{
			index=index+1;
			for(int i=index;i<al.size();i++){
				al.remove(index);
				length--;
			}
			/*System.out.println("in  the removing from index");
				for(Student i:al)
				System.out.println(i.getFullName());*/

				this.students = new Student[length];
				this.length=length;
				for(int i=0;i<length;i++){
					students[i]=al.get(i);
				}	
		}
		
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		int index=al.indexOf(student);
		if(index==-1 || student==null){
			throw new IllegalArgumentException();
		}
		else{
			//System.out.println("indexof element=="+index);	
			index=index+1;
			for(int i=index;i<al.size();i++){
				al.remove(index);
				length--;
			}
	/*		System.out.println("in  the removing from Element");
				for(Student i:al)
				System.out.println(i.getFullName());
*/
				this.students = new Student[length];
				this.length=length;
				for(int i=0;i<length;i++){
					students[i]=al.get(i);
				}
		}
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		if(index>=0 && index<length){
			for(int i=0;i<index;i++){
				al.remove(0);
				length--;
			}
			/*System.out.println("in  the removing to Index");
				for(Student i:al)
				System.out.println(i.getFullName());
*/
				this.students = new Student[length];
				this.length=length;
				for(int i=0;i<length;i++){
					students[i]=al.get(i);
				}
		}
		else{
			throw new IllegalArgumentException();
		}
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		int index=al.indexOf(student);
		if(index>=0 && index<length){
			for(int i=0;i<index;i++){
				al.remove(0);
				length--;
			}
			/*System.out.println("in  the removing to Element");
				for(Student i:al)
				System.out.println(i.getFullName());*/

				this.students = new Student[length];
				this.length=length;
				for(int i=0;i<length;i++){
					students[i]=al.get(i);
				}
		}
		else{
			throw new IllegalArgumentException();
		}
	}

	@Override
	public void bubbleSort() {
		//Collection.Sort(al);
		//Collections.sort(al);

		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		if(date==null){
			throw new IllegalArgumentException();
		}
		else{
			// Add your implementation here
			ArrayList<Student> al1=new ArrayList<Student>();
			for(Student ii:al){
				int val=ii.getBirthDate().compareTo(date);
				if(val==0){
					al1.add(ii);
				}
			}
			Student[] students1=new Student[al1.size()];
			for(int i=0;i<al1.size();i++){
					students1[i]=al1.get(i);
				}
			return students1;	
		}
		
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here

		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
			// Add your implementation here
			return null;	
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		int index=al.indexOf(student);
		if(index==-1 || student==null){
			throw new IllegalArgumentException();
		}
		else{
			return students[index+1];
		}
	}
}
