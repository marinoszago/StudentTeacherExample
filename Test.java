
public class Test {
	
	public static void main(String[] args) {
		Student it1364 = new Student("Marinos","Mavromixali");
		Student it1365 = new Student("Zago","Pao Ave");
		
		
		
		it1364.addCourseGrade("IT101", 95);
		it1364.addCourseGrade("AD101", 68);
		it1364.addCourseGrade("ESP", 48);
		it1364.printGrade();
		
		it1365.addCourseGrade("IT101", 95);
		it1365.addCourseGrade("AD101", 100);
		it1365.addCourseGrade("ESP", 99);
		it1365.printGrade();
		
		
		System.out.printf("the average grade is %.2f",it1364.getAverageGrade());
		System.out.println();
		System.out.printf("the average grade is %.2f"+" for student: "+it1365,it1365.getAverageGrade());
		
		Teacher t1 = new Teacher("Paul Tan", "8 sunset way");
	      System.out.println(t1);
	      String[] courses = {"IM101", "IM102", "IM101"};
	      for (String course: courses) {
	         if (t1.addCourse(course)) {
	            System.out.println(course + " added.");
	         } else {
	            System.out.println(course + " cannot be added.");
	         }
	      }
	      for (String course: courses) {
	         if (t1.removeCourse(course)) {
	            System.out.println(course + " removed.");
	         } else {
	            System.out.println(course + " cannot be removed.");
	         }
	      }
	}

}
