public class EmpWageBuilderuc1  {
	public class empWageCase {
		void empSalary() {
		int isPartTime = 2;
		int empRatePrHr = 20;
		int empr = 0;
		int perDaySalary = 0;
		int monthWorkingDay = 20;
		int monthlySalary = 0;
		for (int i = 1;i <=monthWorkingDay;i++)
		{
			double empCheck = Math.floor(Math.random() *10) % 2;
			switch ((int)empCheck)
			{
				case isFullTime :
					empHr = 8;
					break;
				case isFullTime :
                        		empHr = 4;
                        		break;
			}
			perDaySalary = empRateprHr * empHr;
			monthlySalary = perDaySalary +montlySalary;
		}
		System.out.println("monthly Salary "+monthlySalary);

		
	}
}
