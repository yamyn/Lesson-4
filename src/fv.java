import java.util.Scanner;

public class fv {
    static Scanner scanner = new Scanner(System.in);
    //.......................................................................................//
    static void arrayvid() {  // 1. Метод, що рахує числа до значення х
        System.out.println("Введіть число. на якому слід закінчити відлік: ");
        int x = scanner.nextInt();int i = x; // Сканер х
        System.out.println();
        int a = 0;
        while (a < x){
            a++;
            System.out.println(a + "\n");
        }
    }
    //......................................................................................//
    static void widthM (int xwindth){// метод, що виводить задану ширину квадрата
        int pluswidth = 0;
        while (pluswidth < xwindth) {
            pluswidth++;
            System.out.print("+  ");
        }
    }
    static void drawRectangle () {// Метод, що виводить прямокутник в консоль
        System.out.println("Будь ласка, зазначте ширину прямокутника: ");
        int width = scanner.nextInt();
        System.out.println("Будь ласка, зазначте довжину прямокутника:");
        int length = scanner.nextInt();
        int pluswidth = 0;
        int pluslength = 0;
        while ((pluslength < length)) {
            pluslength++;
            widthM(width);
            System.out.println();
        }
    }
    static void drawRectangle (int z){// Метод, що виводить квадрат в консоль
        System.out.println("Будь ласка, зазначте довжину сторони квадрата: ");
        int width = scanner.nextInt();
        int length = 0;
        while (length < width) {
            length++;
            widthM(width);
            System.out.println();
        }
    }
    //.....................................................................................//
    static void getMax (){
        System.out.println("Введіть значення першого аргумента:");
    int a = scanner.nextInt();
        System.out.println("Введіть значення другого аргумента: ");
    int b = scanner.nextInt();
    if (a > b){
        System.out.println(a + " - більше");
        } else if (a < b){
             System.out.println(b + " - більше");
              } else if (a == b){
                  System.out.println("Елементи рівні!!!");
                     }
    }
    static void getMax (float ax, float bx){
        System.out.println("Введіть значення першого аргумента:");
        float a = scanner.nextFloat();
        System.out.println("Введіть значення другого аргумента: ");
        float b = scanner.nextFloat();
            if (a > b){
              System.out.println(a + " - більше");
            } else if (a < b){
                System.out.println(b + " - більше");
                 } else if (a == b){
                    System.out.println("Елементи рівні!!!");
                    }
    }

    public static void main(String[] args) {
        System.out.println("Вітаю!!!");
        //arrayvid(); // Виклик методу задачі 1
        //drawRectangle();// Виклик методу задачі 2
        /*Я понимаю, что такая запись кода может быть не совсем верна, но если писать сканер в самом методе то код
        более читабельный, чем писать в главном методе все сканеры, а потом передавать, но так как в домашнем задании
        нужно было использовать перезагрузку, я не создал новый метод, а вставил аргумент который не используеться*/
        //drawRectangle(0);//Виклик задачі3
        //getMax();
        getMax(0.0f ,0.0f);


    }
}
