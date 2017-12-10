import java.util.Scanner;

public class fv {
    static Scanner scanner = new Scanner(System.in);
    //.......................................................................................//
    int x = scanner.nextInt();int i = x; // Сканер х
    static void arrayvid() {  // 1. Метод, що рахує числа до значення х
        int x = scanner.nextInt();int i = x; // Сканер х
        int a = 0;
        while (a < x){
            a++;
            System.out.println(a + "\n");
        }
    }
    /*Задание 2
    Написать функцию drawRectangle которая рисует в консоли прямоугольник из символов '+'
    Аргументы функции: ширина прямоугольника в символах, высота прямоугольника в символах

    Например 3 на 2
    Вывод программы:
            + + +
            + + +
*/
    static void widthM (int xwindth){
        int pluswidth = 0;
        while (pluswidth < xwindth) {
            pluswidth++;
            System.out.print("+  ");
        }
    }
    static void drawRectangle () {
        int width = scanner.nextInt();
        int length = scanner.nextInt();
        int pluswidth = 0;
        int pluslength = 0;
        while ((pluslength < length)) {
            pluslength++;
            widthM(width);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        arrayvid(); // Виклик методу задачі 1
        drawRectangle();


    }
}
