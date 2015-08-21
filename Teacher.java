
public class Teacher extends Person {
	
	private int numCourses = 0;
	private String[] courses;
	private static final int MAX_COURSES = 5;
	
	public Teacher(String name,String address)
	{
		super(name,address);
		courses = new String[MAX_COURSES];
	}
	
	public boolean addCourse(String course)
	{
		int i;
		for(i=0;i<numCourses;i++)
		{
			if(courses[i].equals(course))
				return false;
		}
		courses[numCourses] = course;
		numCourses++;
		return true;
	}
	public boolean removeCourse(String course) {
	  
	      int courseIndex = numCourses;
	      for (int i = 0; i < numCourses; i++) {
	         if (courses[i].equals(course)) {
	            courseIndex = i;
	            break;
	         }
	      }
	      if (courseIndex == numCourses) { 
	         return false;   
	      } else {  
	         for (int i = courseIndex; i < numCourses-1; i++) {
	            courses[i] = courses[i+1];
	         }
	         numCourses--;
	         return true;
	      }
	   }
	@Override
	public String toString()
	{
		return "Teacher" + super.toString();
	}
}
