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










	}
}



