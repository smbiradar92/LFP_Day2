public class empWageUC2 {
	public static void main(String[] args) {
		//constants
		int isFullTime = 1;
		int empRatePerHrs = 20;
		//variables
		int empHrs = 0;
		int empWage = 0;
			//computation
			int empCheck = (int)(Math.random());
				System.out.println(empCheck);
			if(empCheck==isFullTime) {				
				System.out.println("Emp is Fulltime");
				empHrs=8;
			}
			else {				
				empHrs=0;
			}
	
		empWage=empHrs*empRatePerHrs;
		System.out.println("Employee wage is : "+empWage);
	}
			
		}		