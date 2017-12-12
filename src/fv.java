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
    //....................................................................................//
    static void widthM (int xwindth){// метод, що виводить задану ширину квадрата
        int pluswidth = 0;
        while (pluswidth < xwindth) {
            pluswidth++;
            System.out.print("+  ");
        }
    }
    //.....................................................................................//
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
    //.....................................................................................//
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
    static void getMax (){//Метод приймає значення аргументу та виводить більше в типі інт
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
    //....................................................................................//
    static void getMax (float ax, float bx){//Метод приймає значення аргументу та виводить більше в флоаті
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
            if (choice == 1) {
                arrayvid(); // Виклик методу задачі 1
            } else if (choice == 2) {
                drawRectangle();// Виклик методу задачі 2
            } else if (choice == 3) {
            /*Я понимаю, что такая запись кода может быть не совсем верна, но если писать сканер в самом методе то код
        более читабельный, чем писать в главном методе все сканеры, а потом передавать, но так как в домашнем задании
        нужно было использовать перезагрузку, я не создал новый метод, а вставил аргумент который не используеться*/
                drawRectangle(0);//Виклик методу задачі 3
            } else if (choice == 4) {
                int max = 1;
                while (max == 1) {
                    System.out.println("Будь ласка, виберіть тип елементів: \n" +
                            "1 - int \n" +
                            "2 - float\n" +
                            "(Ввести цифру, яка відповідає номеру питання)");
                    int choicetype = scanner.nextInt();
                    if (choicetype == 1) {
                        getMax();// Виклик методу задачі 4 за типом int
                    } else if (choicetype == 2) {
                        getMax(0.0f, 0.0f); // Виклик методу задачі 4 за типом float
                    } else {
                        System.out.println("Ви невірно задали номер питання!");
                    }
                    System.out.println("Виконати завдання 4 ще раз? \n" +
                            "1 - Так \n" +
                            "2 - Ні");
                    max = scanner.nextInt();
                }
            } else if (choice == 5) {
                System.out.println("Введіть число. на якому слід закінчити відлік: ");
                int x = scanner.nextInt();
                String counting = task1recursion(x);
                System.out.println(counting);
                //......................//
            } else if (choice == 6) {
                System.out.println("Будь ласка, зазначте ширину прямокутника: ");
                int w = scanner.nextInt();// Сканер ширини квадрата для задачі 2 за допомогою рекурсії
                String pluswidth = task2recursion(w);
                System.out.println("Будь ласка, зазначте довжину прямокутника:");
                int l = scanner.nextInt();// Сканер довжини квадрата для задачі 2 за допомогою рекурсії
                String plus = task2recursion(l, pluswidth);
                System.out.println(plus);
            } else {
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
