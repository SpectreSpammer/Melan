package day3_variables_and_data_types.reference;

public class Manager implements EmployeeInterface {


    @Override
    public void work() {
        System.out.println("Manager is planning the Sprint. ");
    }

    @Override
    public void takingBreak() {
        System.out.println("Manager is taking his lunch. ");
    }

    @Override
    public void attendMeeting() {
        System.out.println("Manager is leading the meeting. ");
    }
}
