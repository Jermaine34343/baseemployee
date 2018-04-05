package baseemployee;

public class SalariedEmployee extends HourlyEmployee{

    private double weeklySalary;

    public SalariedEmployee(String firstname, String lastName, String socialSecurityNumber, double wage, double hours, double weeklySalary) {
        super(firstname, lastName, socialSecurityNumber, wage, hours);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary(){
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary){
        this.weeklySalary = weeklySalary;
    }


    @Override
    public double earnings(){
        return weeklySalary;
    }

    @Override
    public String toString(){
        return super.toString();
    }







}



