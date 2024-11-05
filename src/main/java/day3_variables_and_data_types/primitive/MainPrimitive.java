package day3_variables_and_data_types.primitive;

public class MainPrimitive {
    public static void main(String[] args) {

        /*
            *if numbers -> byte,short, int , double, float, long
            * if single character -> char
            * if nouns,adjective, pronouns -> String
            * if true or false -> boolean
            *
         */
        //declaration -> variable name = value / initialized;
        //8 bit
        byte age = 29;
        System.out.println("Byte: " + age);

        //16 bit
        short departmentCode = 101;
        System.out.println("Short: " + departmentCode);

        char performanceGrade = 'B';
        System.out.println("Char: " + performanceGrade);

        //32
        float hourlyRate = 500.756f;
        String name = "Float: 2";
        System.out.println("Float 1: " + hourlyRate);
        System.out.printf("%s ,%.2f, %n", name,hourlyRate);
        String.format("%s ,%.2f, %n", name,hourlyRate);

        int empId = 1234567890;
        System.out.println("Integer: " + empId);

        //64
        long assetId = 1234567890987654321L;
        System.out.println("Long: " + assetId);

        double annualSalary = 1500000.756;
        System.out.println("Double: " + annualSalary);


        // boolean
        boolean isFullTime = true;
        System.out.println("Boolean: " + isFullTime);
    }
}
