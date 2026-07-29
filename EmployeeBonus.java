import java.util.Scanner;


class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Id");
        int employeeId = sc.nextInt();
        System.out.println("Enter Years of Experience");
        int experience = sc.nextInt();
        System.out.println("Enter Rating");
        float Rating = sc.nextFloat();

        if(experience >= 5){
           if(Rating >= 4){
                    System.out.println("Eligible for 20% Bonus");
           }
           else{
            System.out.println("Eligible for 10% Bonus");
           }
        }
        else{
            System.out.println("Not Eligible for Bonus");
        }
            sc.close();
    }
}