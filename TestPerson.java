package edu.smg;

public class TestPerson {
	public static void main(String[] args) {
		Person person = new Person("Alexa", "zhk. Lulin", "0876877887", "alexa@abv.bg");
		Student student = new Student(Student.FRESHMAN, "Yana", 
				"zhk. Nadezhda", "0876879999", "yana@abv.bg");
		Employee employee = new Employee("Google", 1899 ,"Siri", 
				"zhk. Lulin 2", "0876876666", "siri@abv.bg");
		Staff staff = new Staff("Principal", "SMG", 1200 ,"Maria", 
				"zhk. Lulin 5", "0876876677", "maria@abv.bg");
		Faculty faculty = new Faculty("7:30 - 19:10" ,"Biology PhD" ,"SMG", 1700 ,
				"Boris", "zhk. Nadezhda 3", "0876876688", "boris@abv.bg");
		System.out.println(person.toString());
		System.out.println("\n"+ student.toString());
		System.out.println("\n"+ employee.toString());
		System.out.println("\n"+ staff.toString());
		System.out.println("\n"+ faculty.toString());
	}
}
