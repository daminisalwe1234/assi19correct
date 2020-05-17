public class EmpWageBuilderuc1 {
	public static final int IS_PART_TIME = 1;
        public static final int IS_FULL_TIME = 2;
	private final String company;
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private final int maxHoursPerMonth;
	private int totalEmpWage;
        public EmpWageBuilderuc1(String company, int empRatePerHour,int numOfWorkingDays,int maxHourPerMonth) {
                this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numofWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}

	public void  computeEmpWage() {
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
                while (totalEmpHrs <= maxHoursPerMonth &&
                        totalWorkingDays < numOfWorkingDays) {
                        totalWorkingDays++;
                        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
                        switch (empCheck) {
                                case IS_FULL_TIME:
                                        empHrs = 8;
                                        break;
                                case IS_PART_TIME:
                                        empHrs = 4;
                                        break;
                                default:
                                        empHrs = 0;
                        }
                        totalEmpHrs += empHrs;
                        System.out.println("Day#: " +totalWorkingDays + " Emp Hr: " +empHrs);
                }
                totalEmpWage = totalEmpHrs * empRatePerHour;
                
                
        }
	@Override
	public String toString() {
		return *Total Emp Wage for Company: " +company+ " is: " + totalEmpWage;
	}
      
        public static void main(String[] args) {
                EmpWageBuilderuc1 dMart = new EmpWageBuilderuc1("dmart", 20, 2, 10);
		EmpWageBuilderuc1 reliance = new EmpWageBuilderuc1("Reliance", 10, 4, 20);
		dMart.computeEmpWage();
		System.out.println(dMart);
		reliance.computeEmpWage();
		System.out.println(reliance);
        }
}


