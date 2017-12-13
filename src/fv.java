import java.util.Scanner;

public class fv {
    static Scanner scanner = new Scanner(System.in);
    //.......................................................................................//
    static void arrayvid(int x) {  // 1. Метод, що рахує числа до значення х
        int a = 0;
        while (a < x){
            a++;
            System.out.println(a + "\n");
        }
    }
    //....................................................................................//
    static void widthM (int xwindth){// метод, що виводить задану ширину квадрата
        int pluswidth = 0;
        while (pluswidth < xwindth) {
            pluswidth++;
            System.out.print("+  ");
        }
    }
    //.....................................................................................//
    static void drawRectangle (int Qwidth, int Qlength) {// Метод, що виводить прямокутник в консоль
        int pluswidth = 0;
        int pluslength = 0;
        while ((pluslength < Qlength)) {
            pluslength++;
            widthM(Qwidth);
            System.out.println();
        }
    }
    //.....................................................................................//
    static void drawRectangle (int z){// Метод, що виводить квадрат в консоль
        int length = 0;
        while (length < z) {
            length++;
            widthM(z);
            System.out.println();
        }
    }
    //.....................................................................................//
    static void getMax (int a, int b){//Метод приймає значення аргументу та виводить більше в типі інт
    if (a > b){
        System.out.println(a + " - більше");
        } else if (a < b){
             System.out.println(b + " - більше");
              } else if (a == b){
                  System.out.println("Елементи рівні!!!");
                     }
    }
    //....................................................................................//
    static void getMax (float a, float b){//Метод приймає значення аргументу та виводить більше в флоаті
            if (a > b){
              System.out.println(a + " - більше");
            } else if (a < b){
                System.out.println(b + " - більше");
                 } else if (a == b){
                    System.out.println("Елементи рівні!!!");
                    }
    }
    //...................................................................................//
     static String task1recursion (int x){// 5. Метод для розвязання 1 задачі шляхом рекурсії
        if (x <= 0) return  "";
         return task1recursion(x - 1) + " " + x;

     }
     //..................................................................................//
     static String task2recursion (int w){// 6. Метод для позначення ширини квадрата шляхом рекурсії
         if (w <= 0)return "";
         return task2recursion (w - 1) + " + ";

     }
    static String task2recursion (int l, String width){// 6. Перезагрузка методу, що малює цілий квадрат в консоль
        if (l <= 0)return "";
        return task2recursion(l - 1, width) + width + "\n";
    }
//..........................................................................
    public static void main(String[] args) {
        System.out.println("Вітаю!!!");
        int function = 1;
        while (function ==1) {
            System.out.println("Яку задачу ви б хотіли вирішити: \n" +
                    "1 - Лічба до заданого числа (за допомогою цикла) \n" +
                    "2 - Зобразити прямокутник за даною вами довжиною та шириною, за допомогою символа + (за допомогою цикла)\n" +
                    "3 - Зобразити квадрат за данним вами розмыром сторони, за допомогою символа + \n" +
                    "4 - Ви задаєте два елементи і програма визначає більший  \n" +
                    "5 - Лічба до заданого числа (за допомогою рекурсії) \n" +
                    "6 - Зобразити прямокутник за даною вами довжиною та шириною, за допомогою символа + (за допомогою рекурсії)\n" +
                    "(Ввести цифру, яка відповідає номеру питання)");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Введіть число. на якому слід закінчити відлік: ");
                    int i = scanner.nextInt(); // Сканер х
                    arrayvid(i); // Виклик методу задачі 1
                    break;
                case 2:
                    System.out.println("Будь ласка, зазначте ширину прямокутника: ");
                    int width = scanner.nextInt();
                    System.out.println("Будь ласка, зазначте довжину прямокутника:");
                    int length = scanner.nextInt();
                    drawRectangle(width, length);// Виклик методу задачі 2
                    break;
                case 3:
                    System.out.println("Будь ласка, зазначте довжину сторони квадрата: ");
                    int widthq = scanner.nextInt();
                    drawRectangle(widthq);//Виклик методу задачі 3
                    break;
                case 4:
                    int max = 1;
                    while (max == 1) {
                        System.out.println("Будь ласка, виберіть тип елементів: \n" +
                                "1 - int \n" +
                                "2 - float\n" +
                                "(Ввести цифру, яка відповідає номеру питання)");
                        int choicetype = scanner.nextInt();
                        switch (choicetype){
                            case 1:
                                System.out.println("Введіть значення першого аргумента:");
                                int ax = scanner.nextInt();
                                System.out.println("Введіть значення другого аргумента: ");
                                int bx = scanner.nextInt();
                                getMax(ax, bx);// Виклик методу задачі 4 за типом int
                                break;
                            case 2:
                                System.out.println("Введіть значення першого аргумента: \n" +
                                        "(дріб писати через кому, приклад - 0,0)");
                                float ay = scanner.nextFloat();
                                System.out.println("Введіть значення другого аргумента: \n" +
                                        "(дріб писати через кому, приклад - 0,0)");
                                float by = scanner.nextFloat();
                                getMax(ay, by); // Виклик методу задачі 4 за типом float
                                break;
                            default:
                                System.out.println("Ви невірно задали номер питання!");
                        }
                        System.out.println("Виконати завдання 4 ще раз? \n" +
                                "1 - Так \n" +
                                "2 - Ні");
                        max = scanner.nextInt();
                    }
                    break;
                case 5:
                    System.out.println("Введіть число. на якому слід закінчити відлік: ");
                    int x = scanner.nextInt();
                    String counting = task1recursion(x);
                    System.out.println(counting);
                    break;
                //......................//
                case 6:
                    System.out.println("Будь ласка, зазначте ширину прямокутника: ");
                    int w = scanner.nextInt();// Сканер ширини квадрата для задачі 2 за допомогою рекурсії
                    String pluswidth = task2recursion(w);
                    System.out.println("Будь ласка, зазначте довжину прямокутника:");
                    int l = scanner.nextInt();// Сканер довжини квадрата для задачі 2 за допомогою рекурсії
                    String plus = task2recursion(l, pluswidth);
                    System.out.println(plus);
                    break;
                default:
                    System.out.println("Ви невірно задали номер питання!");
            }
            System.out.println("Чи бажаєте ви виконати ще якесь завдання? \n" +
                    "1 - Так \n" +
                    "2 - Ні");
            function = scanner.nextInt();
        }
        System.out.println("До зустрічі, гарного дня!");
    }
}
