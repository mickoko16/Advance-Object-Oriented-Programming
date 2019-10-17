
public final class Student extends Human{

	private String nim, major, academic_program;
	
	public String getNim() {
		return nim;
	}


	public void setNim(String nim) {
		this.nim = nim;
	}


	public String getMajor() {
		return major;
	}


	public void setMajor(String major) {
		this.major = major;
	}


	public String getAcademic_program() {
		return academic_program;
	}

	public void setAcademic_program(String academic_program) {
		this.academic_program = academic_program;
	}

	public Student(){
		super();
	}
	
	public void eat(String food){
		System.out.println(this.name + "eating " + food);
	}
	
	public void printBio(){
		System.out.println("Name : " + this.name);
		System.out.println("Date of Birth : " + this.dob);
		System.out.println("Gender : " + this.gender);
		System.out.println("NIM : " + this.nim);
		System.out.println("Major : " + this.major);
		System.out.println("Program : " + this.academic_program);
	}
	
	public Student(String name, String dob, String gender, String nim, String major, String academic_program) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.nim = nim;
		this.major = major;
		this.academic_program = academic_program;
	}

}
