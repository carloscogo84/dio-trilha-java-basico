public class Operators {
    public static void main(String[] args) {
        
        //The Assignment Operator (=) assigns a value to a variable:
        String nome = "GLEYSON";
        int idade = 22;
        double peso = 68.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        //Date dataNascimento = new Date();

        //Arithmetic Operators
        double addition = 10.5 + 15.7;
        int subtraction = 113 - 25;
        int multiplication = 20 * 7;
        int division = 15 / 3;
        int modulus = 18 % 3;
        double result = (10 * 7) + (20/4);

        //The addition operation (+) when used on variables of the text type, will perform the “concatenation of texts”.

        String completeName = "JAVA" + "LANGUAGE";
                
        //qual o resultado das expressoes abaixo?
        String concatenation ="?"; 

        concatenation = 1+1+1+"1";
        System.out.println(concatenation);

        concatenation = 1+"1"+1+1;
        System.out.println(concatenation);

        concatenation = 1+"1"+1+"1";
        System.out.println(concatenation);

        concatenation = "1"+1+1+1;
        System.out.println(concatenation);

        concatenation = "1"+(1+1+1);
        System.out.println(concatenation);
         

        int number = 5;
        System.out.println(- number);

        number = - number;
        System.out.println(number);

        number = + number;
        System.out.println(number);

        //Para tranformar o número em par
        number = number * -1;
        System.out.println(number);


        System.out.println("-------");

        System.out.println("Increment");

        int number1 = 5;
        number1 = number + 2;
        System.out.println(number1);

        number1++; // number +1
        System.out.println(number1);

        System.out.println(++ number1);

        //Negating the value of a Boolean variable

        boolean variable = true;
        System.out.println(variable);
        System.out.println(!variable);

        //Invertin a boolean variable
        variable = !variable;
        System.out.println(variable);

        //TERNARIO - O operador de condição ternária é uma forma resumida para definir uma condição e 
        //escolher por um dentre dois valores.

        System.out.println("------");
        System.out.println("Ternário");
        int a, b;
        a = 6;
        b = 6;
        String result1 = "";
        if (a == b)
            result1 = "Is true";
        else
            result1 = "It is not true";
        System.out.println(result1);

        //Operação ternária
        //Se a expressão boolean a==b ? "verdadeiro" :(se não) "falso"
        String result2 = a==b ? "True" : "False";
        System.out.println(result2);

        //Comparison Operators
        System.out.println("-----");
        System.out.println("Comparison Operators");

        /*
         * ==	Equal to	x == y	
        !=	Not equal	x != y	
        >	Greater than	x > y	
        <	Less than	x < y	
        >=	Greater than or equal to	x >= y	
        <=	Less than or equal to	x <= y
                */
        
        int number2 = 1;
        int number3 = 2;

        boolean yesNo = number2 == number3;
        System.out.println("number2 is the same as number3? " + yesNo);

        yesNo = number2 != number3;
        System.out.println("number2 is different from number3? " + yesNo);

        yesNo = number2 > number3;
        System.out.println("number2 is greater than number3? " + yesNo);

        System.out.println("-----");
        System.out.println("Comparando Strings");

        String name1 = "Carlos";
        String name2 = "Carlos";
        String name3 = new String("Carlos");
        System.out.println(name1 == name2);
        System.out.println(name2.equals(name3)); //Utiliza equals para objetos

        System.out.println("----");
        System.out.println("Logical Operators");

        boolean condicao1 = true;
        boolean condicao2 = true;

        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }

        if(condicao1 && (7 > 4)){
            System.out.println("As duas condições são verdadeiras");
        }

        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeiras");
        }


        





    }
}
