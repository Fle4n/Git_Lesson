import java.util.Scanner;

public class number_1 {
    public static void main(String[] args){
        char choise = 'y';
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите первое число: ");
            float first_num = sc.nextFloat();
            System.out.println("Введите операцию(+, -, *, /): ");
            char operation = sc.next().charAt(0);
            System.out.println("Введите второе число: ");
            float second_num = sc.nextFloat();

            if (operation == '+'){
                float result = first_num + second_num;
                System.out.println(first_num + " + " + second_num + " = " + result);
            } else if (operation == '-'){
                float result = first_num - second_num;
                System.out.println(first_num + " - " + second_num + " = " + result);
            } else if (operation == '*'){
                float result = first_num * second_num;
                System.out.println(first_num + " * " + second_num + " = " + result);
            } else if (operation =='/'){
                float result = first_num / second_num;
                System.out.println(first_num + " / " + second_num + " = " + result);
            } else {
                System.out.println("Такой операции не существует");
            }
            System.out.println("Хотите ли продолжить вычисления (y/n)");
            choise = sc.next().charAt(0);
        } while (choise == 'y');

    }
}