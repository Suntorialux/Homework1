import java.util.Scanner;

/**
 * Created by Андрей on 22.06.2015.
 */
public class Task00 {
    public static void main(String[] args) {
        int exit=1;
        do {

            int number;
            int flag=0;

            while (flag==0) {
                System.out.print("Введите целое число:");
                Scanner scanner = new Scanner(System.in);
                if (scanner.hasNextInt()) {
                    number = scanner.nextInt();
                    if (number % 3 == 0)
                        System.out.println("!!! Число делится на 3 !!!");
                    System.out.print("Для выхода нажмите 0 ");
                    exit = scanner.nextInt();
                    flag=1;
                } else {
                    System.out.println("!!! Ошибка ввода !!!");
                    System.out.println("Повторите ввод");
                }
            }
        }
        while (exit!=0);
    }
}
