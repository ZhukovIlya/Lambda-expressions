import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int number;
        int numberTo = 0;
        int choice;
        String input;
        Scanner scanner = new Scanner(System.in);
        Calculator calc = Calculator.instance.get();

        while(true) {
            System.out.println("Выберите операцию" +
                    "\n" + "1.Сложение" +
                    "\n" + "2.Вычитание" +
                    "\n" + "3.Уножение" +
                    "\n" + "4.Деление" +
                    "\n" + "5.Квадрат" +
                    "\n" + "6.Перевод в положительное число" +
                    "\n" + "0.Закрыть програму");
            input = scanner.nextLine();
            try {
                choice = Integer.parseInt(input);
            } catch(NumberFormatException exception) {
                System.out.println("введен не коректный номер  операции");
                continue;
            }
            if (choice == 0){
                break;
            }
            if (choice >= 6 && choice <= 0){
                System.out.println("введен не существующий номер  операции");
                continue;
            }
            System.out.println("Введите первое число");
            input = scanner.nextLine();
            try {
                number = Integer.parseInt(input);
            } catch(NumberFormatException exception) {
                System.out.println("введен не коректный номер  операции");
                continue;
            }
            if (choice <= 4 && choice > 0) {
                System.out.println("Введите второе число");
                input = scanner.nextLine();
                try {
                    numberTo = Integer.parseInt(input);
                } catch (NumberFormatException exception) {
                    System.out.println("введен не коректный номер  операции");
                    continue;
                }
            }

            switch (choice){
                case 1:
                    calc.println.accept(calc.plus.apply(number, numberTo));
                    break;
                case 2:
                    calc.println.accept(calc.minus.apply(number, numberTo));
                    break;
                case 3:
                    calc.println.accept(calc.multiply.apply(number, numberTo));
                    break;
                case 4:
                    calc.println.accept(calc.devide.apply(number, numberTo));
                    break;
                case 5:
                    calc.println.accept(calc.pow.apply(number));
                    break;
                case 6:
                    calc.println.accept(calc.abs.apply(number));
                    break;
            }
        }
    }
}
