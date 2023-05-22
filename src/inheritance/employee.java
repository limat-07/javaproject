package inheritance;

public class employee extends person{

	private double Annualsalry;
	private int yeraofstart;
	private String NationalinsuranceNo;
	
	employee(String name, double Annualsalary, int yearofstart, String NationalinsuranceNo) {
		super(name);
		this.Annualsalry=Annualsalary;
		this.yeraofstart=yearofstart;
		this.NationalinsuranceNo=NationalinsuranceNo;
			}
public double getAnnualsalry() {
	return Annualsalry;
}
public int getyearofstart() {
	return yeraofstart;
}
public String NationalinsuranceNo() {
	return NationalinsuranceNo;
}
}
