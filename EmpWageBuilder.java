public class EmpWageBuilder {

	public static void main(String[] args) {
		int is_Present = (int) (Math.floor(Math.random()*10)%2);
		if (is_Present==1) {
			System.out.println("Employee is PRESENT");
				}
		else	{
			System.out.println("Employee is ABSENT");
		}
	}
}



