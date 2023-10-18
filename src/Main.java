
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите наименование товара: ");
        String name = scanner.nextLine();
        System.out.print("Введите количество: ");
        long quantity = scanner.nextLong();
        System.out.print("Введите телефон: ");
        float phone = scanner.nextFloat();
        scanner.nextLine();
        System.out.print("Введите адрес: ");
        String address = scanner.nextLine();
        System.out.println("Ваш заказ принят.");
        System.out.printf("Ваш заказ принят. Товар < %s > в количестве < %d > прибудет к Вам в ближайшее время. Товар доставим по адресу < %s >. Ваш контактный номер < %.0f > ", name, quantity, address, phone);
        scanner.close();
    }


}