package DayNineEmployeeWage;

public class EmployeeWageUcEight {
    public static final int partTime = 1;
    public static final int fullTime = 2;

    public static int computeEWage(String company,int empRatePerHour,int noOfWday,int maxHrsMon) {
        int empHour = 0;
        int totalEhour = 0;
        int totalWday = 0;
        while (totalEhour <= maxHrsMon && totalWday < noOfWday){
            int employeeCheck = (int) Math.floor(Math.random() * 10) % 3;
            totalWday++;
            switch (employeeCheck) {
                case partTime:
                    System.out.println(empHour = 4);
                    break;
                case fullTime:
                    System.out.println(empHour = 8);
                    break;
                default:
                    System.out.println(empHour = 0);
            }
            totalEhour += empHour;
            System.out.println("day: " + totalWday + "emphour" +empHour);
        }
        int totalEmployeeWage = totalEhour * empHour;
        System.out.println("totalEmpWage" + company+" is: "+ totalEmployeeWage);
        return totalEmployeeWage;
    }
    public static void main (String[] args){
        computeEWage("DMart",30,2,20);
        computeEWage("Reliance",20,2,10);
        computeEWage("Aditya",10,4,20);
    }
}
