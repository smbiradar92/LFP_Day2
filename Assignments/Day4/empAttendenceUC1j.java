public class EmpAttendenceUC1 {
	public static void main(String[] args) {
		//Constants
		int PRESENT = 1;
		int ABSENT = 0;
			//Computation
		int isPresent=(int)(Math.random());
			System.out.println(isPresent);
			
		if (isPresent==PRESENT) {
			System.out.println("Employee is Present");	
		}
		else {
			System.out.println("Employee is Absent");
		}
	}
}
