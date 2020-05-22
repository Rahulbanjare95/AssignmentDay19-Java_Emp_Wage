// use case 1 --- Branch
public class EmpWageBuilder {

	public static void main(String[] args) {
		int is_Present = (int) (Math.floor(Math.random()*10)%2);
		if (is_Present==1) {
			System.out.println("Employee is PRESENT");
				}
		else	{
			System.out.println("Employee is ABSENT");
		}

	//UC2 new Branch--
	int Wage_per_hr=20;
	int Full_Day_hr=8;

	int Daily_Wage=(is_Present * Wage_per_hr * Full_Day_hr);

	System.out.println("Daily Wage = "+Daily_Wage);

	//UC3 new Branch----
	int Part_Time_hr=4;
		Daily_Wage=(is_Present * Wage_per_hr *Part_Time_hr);
	System.out.println("Part-Time Wage = "+Daily_Wage);
	//UC4 new Branch----


	int Work_Hrs_checker = (int) (Math.floor(Math.random()*10)%2+1);

	int salary=0;
	int	empHrs=0;
	if(is_Present==1){

	switch (Work_Hrs_checker) {
		case 1:
		empHrs=8;
		break;
		case 2:
		 empHrs=4;
		break;
		}
	 salary=(empHrs*Wage_per_hr);
		System.out.println("Salary for a Day = "+salary);
	}
	int Total_Working_Days_Month=20;
	int Total_Salary=0;

	if(is_Present==1)
	{
	for (int i =1;i<=Total_Working_Days_Month;i++)
	{
		 switch (Work_Hrs_checker) {
      case 1:
       empHrs=8;

      break;
      case 2:
       empHrs=4;

      break;
      }
	 salary=(empHrs*Wage_per_hr);
		Total_Salary+=salary;
	}
	System.out.println(" Total Salary of A month = "+Total_Salary);
	}
	int Maximum_Days_Allowed=20;
	int	Maximum_Hrs=100;
	int TotalEmpHrs=0;
	int TotalWorkingDays=0;
	while (TotalEmpHrs <Maximum_Hrs && TotalWorkingDays < Maximum_Days_Allowed )
	{
	TotalWorkingDays++;

	switch (Work_Hrs_checker) {
      case 1:
      empHrs=8;
      break;
      case 2:
       empHrs=4;
      break;
      }
	TotalEmpHrs=TotalEmpHrs+empHrs;
	}
	Total_Salary=(TotalEmpHrs*Wage_per_hr);
	System.out.print("Total Salary Till Maximum Hrs in Month is ReACHED = " +Total_Salary);




	}
}



