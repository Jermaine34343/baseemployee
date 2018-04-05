package baseemployee;

public class Employee {
        private static int count = 0;
        private String firstName;
        private String lastName;
        private final String socialSecurityNumber;

        public Employee(String firstname, String lastName, String socialSecurityNumber) {
            this.firstName = firstname;
            this.lastName = lastName;
            this.socialSecurityNumber = socialSecurityNumber;
            count++;

            System.out.printf("Constructor employee %s %s | count=%d%n", firstName, lastName, count);


        }

        public static int getCount() {
            return count;
        }

        public static void setCount(int count) {
            Employee.count = count;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getSocialSecurityNumber() {
            return socialSecurityNumber;
        }
       public double earnings(){
            return 0.0;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';
        }
    }
