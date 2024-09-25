import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// Задача 1: Нахождение максимума из двух чисел
        System.out.println("Введите два числа для нахождения максимума:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        try {
            System.out.println("Максимальное число: " + max(a, b));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

// Задача 2: Деление двух чисел
        System.out.println("Введите два числа для деления:");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        try {
            System.out.println("Результат деления: " + divide(x, y));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

// Задача 3: Конвертация строки в число
        System.out.println("Введите строку для конвертации в число:");
        String str = scanner.next();
        try {
            System.out.println("Преобразованное число: " + convertStringToInt(str));
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

// Задача 4: Проверка возраста
        System.out.println("Введите возраст:");
        int age = scanner.nextInt();
        try {
            checkAge(age);
            System.out.println("Возраст корректный.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

// Задача 5: Нахождение корня из числа
        System.out.println("Введите число для нахождения корня:");
        double number = scanner.nextDouble();
        try {
            System.out.println("Корень из числа: " + sqrt(number));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

// Задача 6: Факториал
        System.out.println("Введите число для вычисления факториала:");
        int n = scanner.nextInt();
        try {
            System.out.println("Факториал числа: " + factorial(n));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

// Задача 7: Проверка массива на нули
        System.out.println("Введите длину массива:");
        int len = scanner.nextInt();
        int[] array = new int[len];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }
        try {
            checkArrayForZero(array);
            System.out.println("В массиве нет нулей.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

// Задача 8: Возведение в степень
        System.out.println("Введите число и степень для возведения:");
        int base = scanner.nextInt();
        int exp = scanner.nextInt();
        try {
            System.out.println("Результат возведения: " + power(base, exp));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

// Задача 9: Обрезка строки
        System.out.println("Введите строку и количество символов для обрезки:");
        String inputString = scanner.next();
        int chars = scanner.nextInt();
        try {
            System.out.println("Обрезанная строка: " + trimString(inputString, chars));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

// Задача 10: Поиск элемента в массиве
        System.out.println("Введите элемент для поиска в массиве:");
        int target = scanner.nextInt();
        try {
            System.out.println("Индекс элемента: " + findElement(array, target));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

// Задача 11: Конвертация в двоичную систему
        System.out.println("Введите целое число для конвертации в двоичную систему:");
        int numberToConvert = scanner.nextInt();
        try {
            System.out.println("Двоичная строка: " + convertToBinary(numberToConvert));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

// Задача 12: Проверка делимости
        System.out.println("Введите два числа для проверки делимости:");
        int dividend = scanner.nextInt();
        int divisor = scanner.nextInt();
        try {
            checkDivisibility(dividend, divisor);
            System.out.println(dividend + " делится на " + divisor);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

// Задача 13: Чтение элемента списка по индексу
        System.out.println("Введите индекс для получения элемента массива:");
        int index = scanner.nextInt();
        try {
            System.out.println("Элемент: " + getElement(array, index));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

// Задача 14: Проверка пароля
        System.out.println("Введите пароль:");
        String password = scanner.next();
        try {
            checkPasswordStrength(password);
            System.out.println("Пароль достаточно сложный.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

// Задача 15: Проверка даты
        System.out.println("Введите дату в формате dd.MM.yyyy:");
        String date = scanner.next();
        try {
            checkDateFormat(date);
            System.out.println("Формат даты корректный.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
// Задача 16: Конкатенация строк
        System.out.println("Введите две строки для объединения:");
        String firstString = scanner.next();
        String secondString = scanner.next();
        try {
            System.out.println("Объединенная строка: " + concatenateStrings(firstString, secondString));
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

// Задача 17: Остаток от деления
        System.out.println("Введите два числа для нахождения остатка:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        try {
            System.out.println("Остаток: " + remainder(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

// Задача 18: Квадратный корень
        System.out.println("Введите число для нахождения квадратного корня:");
        double squareRootNum = scanner.nextDouble();
        try {
            System.out.println("Квадратный корень: " + sqrt(squareRootNum));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

// Задача 19: Конвертер температуры
        System.out.println("Введите температуру в градусах Цельсия для конвертации в Фаренгейты:");
        double celsius = scanner.nextDouble();
        try {
            System.out.println("Температура в Фаренгейтах: " + celsiusToFahrenheit(celsius));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

// Задача 20: Проверка строки на пустоту
        System.out.println("Введите строку для проверки на пустоту:");
        String emptyCheckString = scanner.next();
        try {
            checkStringIsEmpty(emptyCheckString);
            System.out.println("Строка не пустая.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

// Реализация всех методов для каждой задачи

    public static int max(int a, int b) throws Exception {
        if (a == b) {
            throw new Exception("Числа равны");
        }
        return Math.max(a, b);
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо");
        }
        return a / b;
    }

    public static int convertStringToInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Неверный формат строки");
        }
    }

    public static void checkAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Возраст должен быть в пределах от 0 до 150");
        }
    }

    public static double sqrt(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Корень из отрицательного числа недопустим");
        }
        return Math.sqrt(number);
    }

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал отрицательного числа недопустим");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void checkArrayForZero(int[] array) throws Exception {
        for (int num : array) {
            if (num == 0) {
                throw new Exception("В массиве найден ноль");
            }
        }
    }

    public static double power(int base, int exp) {
        if (exp < 0) {
            throw new IllegalArgumentException("Степень не может быть отрицательной");
        }
        return Math.pow(base, exp);
    }

    public static String trimString(String str, int chars) {
        if (chars > str.length()) {
            throw new IllegalArgumentException("Число символов больше длины строки");
        }
        return str.substring(0, chars);
    }

    public static int findElement(int[] array, int target) throws Exception {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        throw new Exception("Элемент не найден");
    }

    public static String convertToBinary(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Число должно быть положительным");
        }
        return Integer.toBinaryString(number);
    }

    public static void checkDivisibility(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Делитель не может быть нулем");
        }
        if (dividend % divisor != 0) {
            throw new ArithmeticException("Число не делится нацело");
        }
    }

    public static int getElement(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Индекс вне диапазона массива");
        }
        return array[index];
    }

    public static void checkPasswordStrength(String password) {
        if (password.length() < 8) {
            throw new IllegalArgumentException("Пароль слишком короткий");
        }
    }

    public static void checkDateFormat(String date) {
        if (!date.matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
            throw new IllegalArgumentException("Неверный формат даты");
        }
    }

    public static String concatenateStrings(String str1, String str2) {
        if (str1 == null || str2 == null) {
            throw new NullPointerException("Одна из строк является null");
        }
        return str1 + str2;
    }

    public static int remainder(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Деление на ноль");
        }
        return num1 % num2;
    }

    public static double celsiusToFahrenheit(double celsius) {
        if (celsius < -273.15) {
            throw new IllegalArgumentException("Температура ниже абсолютного нуля");
        }
        return celsius * 9 / 5 + 32;
    }

    public static void checkStringIsEmpty(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Строка пустая или null");
        }
    }
}