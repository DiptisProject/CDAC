package Assignment5;
//question 4
public class Student {

	private String sname;
	private int sid;
	private int age;
	private String course;
	
	public Student(String sname, int sid, int age, String course) {
		super();
		this.sname = sname;
		this.sid = sid;
		this.age = age;
		this.course = course;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public void displayDetails() {
		System.out.println("");
		System.out.println("Student Details");
		System.out.println("Name: " +this.sname);
		System.out.println("Student ID: "+this.sid);
		System.out.println("Age: "+this.age);
		System.out.println("Course: "+this.course);
	}	

}
