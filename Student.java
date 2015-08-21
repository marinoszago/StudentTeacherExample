
public class Student extends Person {
	
	
	private int numCourses = 0;
	private String[] courses;
	private int[] grades;
	private static final int MAX_COURSES = 30;
	
	public Student(String name,String address)
	{
		super(name,address);
		courses = new String[MAX_COURSES];  
	    grades = new int[MAX_COURSES];
	}
	
	
	
	@Override
	public String toString()
	{
		return "Student: " + super.toString();
	}
	public void addCourseGrade(String course,int grade)
	{
		courses[numCourses]=course;
		grades[numCourses]=grade;
		numCourses++;
	}
	public void printGrade()
	{
		int i;
		System.out.println(this);
		for(i=0;i<numCourses;i++)
		{
			System.out.println(" " + courses[i] + ":" + grades[i]);
		}
		System.out.println();
		
	}
	public double getAverageGrade()
	{
		double sum=0;
		int i;
		for(i=0;i<numCourses;i++)
		{
			sum += grades[i];
		}
		return (double)sum/numCourses;
	}

}
