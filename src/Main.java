import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// 2.5
        int days = 234;
        int weeks = days / 7;
        System.out.println("Ответ: " + weeks);
// 2.6
        Scanner n = new Scanner(System.in);
        System.out.print("Вводи: ");
        int test = n.nextInt();

        int chas = test / 3600;
        int munit = (test % 3600) / 60;
        int sec = test % 60;

        System.out.println("Часы: " + chas);
        System.out.println("Минуты: " + munit);
        System.out.println("Секунды: " + sec);
// 2.13
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите трёхзначное число: ");
        int number = scanner.nextInt();

        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int ones = number % 10;

        int reversedNumber = ones * 100 + tens * 10 + hundreds;

        System.out.println("Число, прочитанное справа налево: " + reversedNumber);
// 2.19
        Scanner ggee = new Scanner(System.in);
        System.out.print("Введите число: ");
        int ioka = ggee.nextInt();
        int jjj = ioka / 1000;
        int fff = (ioka / 100) % 10;
        int ggg = (ioka / 10) % 10;
        int kkk = ioka % 10;

        System.out.println("Тысячи: " + jjj);
        System.out.println("Сотни: " + fff);
        System.out.println("Десятки: " + ggg);
        System.out.println("Единицы: " + kkk);

        int sum = jjj + fff + ggg + kkk;
        int seiii = jjj * fff * ggg * kkk;

        System.out.println("Цифры: " + sum);
        System.out.println("Произведенные цифры: " + seiii);
// 4.9
        System.out.println("Скоровсть км/ч ");
        double speedkmh = scanner.nextDouble();

        System.out.println("Скоровсть км/с ");
        double speedkms = scanner.nextDouble();

        double speedkm = speedkmh * 5 / 10;

        if (speedkm > speedkms) {
            System.out.println("Скорость в км/ч больше");
        } else if (speedkm < speedkms) {
            System.out.println("Скорость в м/с больше");
        } else {
            System.out.println("Обе скорости равны");
        }
// 4.10
        Scanner ttt = new Scanner(System.in);

        // Ввод данных
        System.out.print("Введите радиус круга: ");
        double radius = scanner.nextDouble();

        System.out.print("Введите сторону квадрата: ");
        double side = scanner.nextDouble();

        // Вычисление площадей
        double areaCircle = Math.PI * radius * radius; // Площадь круга: π * r^2
        double areaSquare = side * side; // Площадь квадрата: side^2

        // Сравнение площадей
        if (areaCircle > areaSquare) {
            System.out.println("Площадь круга больше.");
        } else if (areaCircle < areaSquare) {
            System.out.println("Площадь квадрата больше.");
        } else {
            System.out.println("Площади одинаковы.");
        }
// 4.13
        Scanner hhh = new Scanner(System.in);

        // Ввод коэффициентов
        System.out.print("Введите a (a ≠ 0): ");
        double a = scanner.nextDouble();

        System.out.print("Введите b: ");
        double b = scanner.nextDouble();

        System.out.print("Введите c: ");
        double c = scanner.nextDouble();

        // Вычисление дискриминанта
        double discriminant = b * b - 4 * a * c;

        // Проверка дискриминанта для определения наличия вещественных корней
        if (discriminant > 0) {
            System.out.println("У уравнения два вещественных корня.");
        } else if (discriminant == 0) {
            System.out.println("У уравнения один вещественный корень.");
        } else {
            System.out.println("У уравнения нет вещественных корней.");
        }
// 4.36
        Scanner bbb = new Scanner(System.in);

        // Ввод времени t (минуты, прошедшие с начала часа)
        System.out.print("Введите количество минут, прошедших с начала часа: ");
        double t = scanner.nextDouble();

        // Вычисляем остаток времени в текущем цикле (цикл длится 5 минут: 3 минуты зеленый, 2 минуты красный)
        double cycleTime = t % 5;

        // Определяем, какой сигнал горит
        if (cycleTime < 3) {
            System.out.println("Горит зеленый сигнал.");
        } else {
            System.out.println("Горит красный сигнал.");
        }
// 4.96
        Scanner aaa = new Scanner(System.in);

        // Ввод коэффициентов
        System.out.print("Введите p (p ≠ 0): ");
        double p = scanner.nextDouble();

        System.out.print("Введите q: ");
        double q = scanner.nextDouble();

        System.out.print("Введите r: ");
        double r = scanner.nextDouble();

        // Вычисление дельты
        double delta = q * q - 4 * p * r;

        // Проверка наличия вещественных корней
        if (delta > 0) {
            // Два вещественных корня
            double x1 = (-q + Math.sqrt(delta)) / (2 * p);
            double x2 = (-q - Math.sqrt(delta)) / (2 * p);
            System.out.println("У уравнения два вещественных корня: x1 = " + x1 + ", x2 = " + x2);
        } else if (delta == 0) {
            // Один вещественный корень
            double x = -q / (2 * p);
            System.out.println("У уравнения один вещественный корень: x = " + x);
        } else {
            // Вещественных корней нет
            System.out.println("У уравнения нет вещественных корней.");
        }
// 4.97
        Scanner kkl = new Scanner(System.in);

        // Ввод трёх чисел
        System.out.print("Введите первое число: ");
        int x1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int y = scanner.nextInt();

        System.out.print("Введите третье число: ");
        int z = scanner.nextInt();

        // Находим наибольшее число
        int max = x1;
        if (y > max) max = y;
        if (z > max) max = z;

        // Находим наименьшее число
        int min = x1;
        if (y < min) min = y;
        if (z < min) min = z;

        // Находим среднее число
        int middle = x1 + y + z - max - min;

        // Вывод результатов
        System.out.println("Наибольшее число: " + max);
        System.out.println("Наименьшее число: " + min);
        System.out.println("Среднее число: " + middle);

        // Проверка существования треугольника
        System.out.print("Введите сторону x: ");
        double x = scanner.nextDouble();

        System.out.print("Введите сторону y: ");
        double y1 = scanner.nextDouble();

        System.out.print("Введите сторону z: ");
        double z1 = scanner.nextDouble();

        // Проверка условий существования треугольника
        if (x + y1 > z1 && x + z1 > y1 && y1 + z1 > x) {
            System.out.println("Треугольник с такими сторонами существует.");
        } else {
            System.out.println("Треугольник с такими сторонами не существует.");
        }
    }
}