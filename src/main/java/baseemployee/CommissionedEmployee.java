package baseemployee;

public class CommissionedEmployee extends Employee {

private double grossSales;
private double commissionRate;

    public CommissionedEmployee(String firstname, String lastName, String socialSecurityNumber, double grossSales, double comiisionRate) {
        super(firstname, lastName, socialSecurityNumber);
        this.grossSales = grossSales;
        this.commissionRate = comiisionRate;
    }

    public double getGrossSales(){
        return grossSales;
 }

    public void setGrossSales(double grossSales){
        this.grossSales = grossSales;
    }


    public double getComiisionRate(){
        return commissionRate;
    }

    public void setComiisionRate(double comiisionRate){
        this.commissionRate = comiisionRate;
    }

    @Override
    public double earnings(){
        return grossSales * commissionRate;
    }

    @Override
    public String toString(){
        return super.toString();
    }



}
