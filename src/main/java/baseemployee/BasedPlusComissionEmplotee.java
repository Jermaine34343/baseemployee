package baseemployee;

public class BasedPlusComissionEmplotee extends CommissionedEmployee {

    private double baseSalary;


    public BasedPlusComissionEmplotee(String firstname, String lastName, String socialSecurityNumber, double baseSalary, double grossSales, double commissionRate) {
        super(firstname, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;

    }

    public double getBaseSalary(){
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings(){
        return baseSalary + super.earnings();
    }

    @Override
    public String toString(){
        return super.toString();
    }

}
