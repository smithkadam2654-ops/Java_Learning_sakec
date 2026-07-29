public class EmployeeDetails {
    public static void main(String[] args) {

        int employeeId = 273;
        byte employeeAge = 25;
        short experience = 3;
        long mobileNumber = 9967566404L;
        double monthlySalary = 50000.75;
        float performanceRating = 4.5f;
        char employeeGrade = 'A';
        boolean isPermanent = true;

        System.out.println("===== Employee Details =====");
        System.out.println("Employee ID        : " + employeeId);
        System.out.println("Employee Age       : " + employeeAge);
        System.out.println("Years of Experience: " + experience);
        System.out.println("Mobile Number      : " + mobileNumber);
        System.out.println("Monthly Salary     : " + monthlySalary);
        System.out.println("Performance Rating : " + performanceRating);
        System.out.println("Employee Grade     : " + employeeGrade);
        System.out.println("Permanent Employee : " + isPermanent);
    }
}