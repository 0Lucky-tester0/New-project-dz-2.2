// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int total; // итоговая сумма счета 
        int price = 1400; // сумма пополнения
        if (price > 1000) {

            int check = 100; // счет клиента
            int bonus = 100; // сумма пополнения за 1 рубль бонуса
            total = (check + price) / bonus;
            System.out.println(total + check + price);

        }
    }
}