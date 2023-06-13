// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int total; // итоговая сумма счета 
        int price = 1200; // сумма пополнения
        if (price > 1000) {

            int check = 300; // счет клиента
            int coefficient = 100; // сумма пополнения за 1 рубль бонуса
            total = (check + price) / coefficient;
            System.out.println(total + check + price);

        }
    }
}