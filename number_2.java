import java.util.Scanner;

public class number_2 {
    public static void main(String[] args){
        String[] names = new String[] {"Катя", "Даша", "Дима"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = sc.next();
        for (int i = 0; i < names.length; i++){
            if (name.equals(names[i])){
                System.out.println("Имя есть в массиве");
                break;
            } else if (!name.equals(names[i]) & i == names.length - 1){
                System.out.println("Такого имени нет в массиве");
            }
        }

    }
}
