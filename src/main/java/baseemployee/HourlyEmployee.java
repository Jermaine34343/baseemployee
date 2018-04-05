package baseemployee;

public class HourlyEmployee extends Employee{

    private double wage;
    private double hours;

    public HourlyEmployee(String firstname, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstname, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage(){
        return this.wage;
    }

    public void setWage(double wage){
        this.wage = wage;
        }

    public double getHours(){
        return this.hours;
    }

    public void setHours(double hours){
        this.hours = hours;
    }

    @Override
    public double earnings(){
        return wage * hours;
    }

    @Override
    public String toString(){
        return super.toString();
    }









}
