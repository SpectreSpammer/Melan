package day3_variables_and_data_types.reference;

public class Designer implements EmployeeInterface {
    @Override
    public void work() {
        System.out.println("Designer is designing the UI Interface. ");
    }

    @Override
    public void takingBreak() {
        System.out.println("Designer is having a short walk. ");
    }

    @Override
    public void attendMeeting() {
        System.out.println("Designer is presenting the UI design. ");

    }
}
