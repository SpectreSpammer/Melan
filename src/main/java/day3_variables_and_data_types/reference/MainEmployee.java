package day3_variables_and_data_types.reference;

public class MainEmployee {
    public static void main(String[] args) {


        EmployeeInterface manager = new Manager();
        EmployeeInterface developer = new Developer();
        EmployeeInterface designer = new Designer();

        //putting all of the objects inside of the array
        EmployeeInterface[] employees = { manager,developer,designer};

        //Iterating the whole objects of employees
        for(EmployeeInterface emp : employees){
            emp.work();
            emp.takingBreak();
            emp.attendMeeting();
            System.out.println();
        }

    }
}
