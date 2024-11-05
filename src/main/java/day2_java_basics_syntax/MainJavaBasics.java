package day2_java_basics_syntax;

/*
    *this
    * is
    * a
    * multi line
    * comment
*/



public class MainJavaBasics {
    public static void main(String[] args) {

        // this is a one line comment
        /*
            access modifier keyword -> public, private, default, protected
            types of classes -> class, abstract class, interface ( the most common )
            static -> it belong to its class and can instantiate an object without creating an object.
            void -> no return value
            return -> return value
         */

        sayHello();

        Message message = new Message();
        message.sayHelloWithoutStatic();
        Message.sayHello();
        /*
        System.out.println("Hello Melan");
        System.out.println("Hi Sir!");
        System.out.println("Welcome to Java Course!");
        */
    }

    private static void sayHello() {
        System.out.println("Hello Melan");
    }
}


