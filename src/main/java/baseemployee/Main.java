package baseemployee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Employee employeeOne = new HourlyEmployee("John", "Whacky", "378678735", 34, 8);
        System.out.print(employeeOne);
        Employee employeeTwo = new SalariedEmployee("Blaude", "Bear", "394798542", 50, 8, 2);
        System.out.print(employeeTwo);
        Employee employeeThree = new CommissionedEmployee("Jackle", "Willa", "589028749", 45, 20);
        System.out.print(employeeThree);
        Employee employeeFour = new BasedPlusComissionEmplotee("Tired", "sillymanjackson", "485930972", 777, 10, 78);
        System.out.print(employeeFour);
        Employee[] wages = new Employee[]{employeeOne, employeeTwo, employeeThree, employeeFour};
        for(Employee cost : wages){
        System.out.println(cost.earnings());
        }


    }
}
