public class EmployeeAttendence {
	
	public static void main(String[] args) {
		int PRESENT=1;
		int ABSENT=0;
		
		int isPresent=(int)(Math.random()*2);
		System.out.println(isPresent);
	
		if(isPresent==PRESENT)
			System.out.println("Emp Present" );
		} else {
			System.out.println("EMP absent");
		}

}

