package inheritance;

public class testemployee {

	public static void main(String[] args) {
		employee e= new employee("Tamil",25000,2016,"1234efrunfc");
				System.out.println("Employee details");
				System.out.println("Name ;"+e.getname());
				System.out.println("salary :"+e.getAnnualsalry());
				System.out.println("Yearofstart"+e.getyearofstart());
				System.out.println("NationalInsuranceno:"+e.NationalinsuranceNo());
	}
	}
