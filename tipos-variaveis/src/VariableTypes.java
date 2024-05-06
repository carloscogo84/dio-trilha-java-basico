public class variableTypes {
    public static void main(String[] args) {

        /*
         * Primitive Types
         * int, byte, short, long, float, double, boolean e char 
         */

        /*
         * Variables declaration
         * Every variable is composed of: data type + indentification + assigned value
         */

        int age; //type "int", name "age", with no value assigned. 
        int yearManufacture = 2021; //type "int", name "yearmanufacture", with value 2021.
        double minimumWage = 2.500; //type "double", name "minimumWage", value 2.500.

        // There are some peculiarities when working with some specific types.

        byte age1 = 123;
		short year = 2021;
		int postcode = 21070333; // if it starts with zero, maybe it has to be another type
		long insuranceNumber = 98765432109L; // if it starts with zero, maybe it has to be another type
		float pi = 3.14F;
		double wage = 1275.33;


        /*
         * Variable and Constants
         * A variable is a memory area, associated with a name, that can store values of a certain type.
         * 
         * Constants are values stored in memory that cannot be modified once declared. 
         * In Java, these values are represented by the final reserved word, followed by the type.
         * By convention, Constants are always written in ALL CAPS.
         */

         int number = 5;
         number = 10;
         System.out.println(number);

         final double VALOR_DE_PI = 3.14;
         System.out.println(VALOR_DE_PI);



    }
}
