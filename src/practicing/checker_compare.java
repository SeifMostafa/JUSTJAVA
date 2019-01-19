package practicing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Player {
	String name;
	int score;

	Player(String name, int score) {
		this.name = name;
		this.score = score;
	}
}
class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}
class Checker implements Comparator {

    public int compare(Object o1, Object o2) {
        if(((Player) o1).score == ((Player) o2).score){
              return ((Player) o1).name.compareTo(((Player) o2).name);

        }
        return (((Player) o1).score > ((Player) o2).score) ? -1 : 1;
    }
}
public class checker_compare {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
		Collections.sort(studentList,new Comparator<Student>() {
			public int compare(Student o1, Student o2) {
				if(o1.getCgpa()==o2.getCgpa()){
					if(!((Student) o2).getFname().equals(((Student) o1).getFname())){
			              return ((Student) o1).getFname().compareTo(((Student) o2).getFname());
					}else{
						return new Integer(((Student)o2).getId()).compareTo(new Integer(((Student)o1).getId()));
					}
				}
				return new Double(((Student)o2).getCgpa()).compareTo(new Double(((Student)o1).getCgpa()));

			}
		});
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}

}
