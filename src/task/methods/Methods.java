package task.methods;

public class Methods {
    public static void main(String[] args) {
        // Пример вызова метода
        String string = getString("HELLO");
        // Ожидаемый результат hello System.out.println(string);
        // Вызовы ваших методов
        String name1 = "Илья";
        String name2 = "илья";
        int[] arr = {1, 6, 10};
        String stroka = "ааааА";
        int NascalnieSredstva = 1000;
        int Trati = 1001;
        boolean B1 = true;
        boolean B2 = true;
        int number = 5;
        System.out.println();




        //test

    }

    // Метод принимающий строку и преобразующий ее в нижний регистр
    public static String getString(String example) {
        return example.toLowerCase();
    }

// Реализуйте функциональность согласно описанию

    // TODO: Создайте метод который вернет сумму двух чисел
    public static int sum(int a, int b) {
        return a + b;
    }


    // TODO: Создайте метод который вернет сумму двух переданных строк
    public static String sumString(String a, String b) {
        return a + b;
    }


    // TODO: создайте метод который примет строку внутри которой передается число , а также принимает число . Метод должен суммировать числа
    //  обернуть их в строку и вернуть результат строкой
    public static String sumStringAndInt(String str, int num) {
        int sum = Integer.parseInt(str) + num;
        return String.valueOf(sum);

    }

    // TODO: Создайте метод который принимает строку , число . Внутри строки передается число . Проверить , что если число внутри строки больше чем
    //  число которое передается как int , то пусть метод вернет false , а если меньше , то true
    public static boolean stringNumber(String str, int num) {
        boolean more = Integer.parseInt(str) > num;
        return more;
    }

    // TODO: Создайте метод который принимает 2 булевые переменные . Если обе true , верни true , если хоть одна из них true верни true ,
   //    если обе false верни false
    public static boolean toBoolean(boolean B1, boolean B2) {
        return B1 || B2;
    }

    // TODO: Создайте метод который принимает число и вернет true если оно четное , и false если оно не четное
    public static boolean integerNumbers(int number) {
            return number % 2 == 0;

    }

    // TODO: Создайте метод который проверят числа в массиве , если все они четные верни "Массив четных чисел" , если есть и четные и не
    //  четные верни "Массив четных и не четных чисел" и если в массиве только нечетные числа верни "Массив не четных чисел"
    public static String arrayOddAndEven(int[] arr) {
        boolean odd = true;
        boolean even = true;

        for (int num : arr) {
            if (num % 2 != 0) {
                odd = false;
            } else {
                even = false;
            }
        }

        if (odd) {
            return "Массив четных чисел";
        } else if (even) {
            return "Массив нечетных чисел";
        } else {
            return "Массив четных и нечетных чисел";
        }
    }

    // TODO: Создайте метод который принимает массив чисел и возвращает новый массив чисел . Внутри метода пройдитесь по элементам
    //  массива который подается в аргументы  и сложите все элементы в новый массив и верните его
    public static int[] newArray(int[] arr) {
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        return newArray;
    }

    // TODO: Создайте метод который принимает массив чисел и возвращает число . Внутри метода пройдитесь по элементам массива который подается в
    //  аргументы сложите все числа который переданы в массиве и верните сумму всех чисел
    public static int arraySum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // TODO: Создайте методы в которые можно будет передавать свой возраст , а возвращаться сколько полных месяцев в этом возрасте ,
    //  тоесть если человек прожил 10 лет , это 120 месяцевтак же сделайте перевод возраста в минуты и метод который расчетает возраст в часах
    public static int ageMonth(int age) {
        return age * 12;
    }

    public static int ageHour(int age) {
        return age * 365 * 24;
    }

    public static int AgeMinutes(int age) {
        return age * 365 * 24 * 60;
    }


    // TODO: Создайте метод которому передаю имена , а он проверяет одинаковые ли они , причем не зависимо от регистра
    public static boolean EqualityOfNames(String name1, String name2) {
        return name1.equalsIgnoreCase(name2);
    }


    // TODO: Создайте метод которому можно передать массив элементов , а он вернет последний элемент
    public static int getLastElementOfArray(int[] elements) {
        return elements[elements.length - 1];

    }


    // TODO: Создайте метод счетчик букв А . Подается строка и метод посчитает сколько букв А в строке
    public static int numberOfLettersA(String stroka) {
        int count = 0;
        for (int i = 0; i < stroka.length(); i++) {
            if (stroka.charAt(i) == 'А' || stroka.charAt(i) == 'а') {
                count++;
            }
        }
        return count;
    }



    // TODO: Создайте метод кошелек , у него есть началная сумма и можно вычитать пока деньги не кончатся или сумма не будет слишком велика
    public static String Wallet(int initialАmount, int Wastes) {
        if (Wastes > initialАmount) {
            return "недостаточно средств";
        } else if (initialАmount <= 0) {
            return "сумма на кошельке = 0 или меньше";
        } else {
            int ostatok = initialАmount - Wastes;
            return "остаток" + ostatok;

        }
    }
}
