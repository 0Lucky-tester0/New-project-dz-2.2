// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int price = 1200; // сумма пополнения
        int check = 300; // счет клиента
        int ratio = 100; // сумма пополнения за 1 рубль бонуса
        int bonus= price / ratio;
        if (price > 1000) {
            System.out.println(bonus + price + check);


        }
    }
}