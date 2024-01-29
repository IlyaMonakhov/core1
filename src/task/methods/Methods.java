package task.methods;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        // todo: пожалуйста, делай в следующий раз так
        System.out.println("Метод принимающий строку и преобразующий ее в нижний регистр");
        System.out.println("args: TEST");
        System.out.println(getString("TEST"));
        System.out.println();
        System.out.println("Создайте метод который вернет сумму двух чисел");
        System.out.println("args: 1 (int), 2 (int)");
        System.out.println(sum(1, 2));
        System.out.println();
        System.out.println("Создайте метод который вернет сумму двух переданных строк");
        System.out.println("args: a, b");
        System.out.println(sumString("a", "b"));
        System.out.println();
        System.out.println("создайте метод который примет строку внутри которой передается число , а также принимает число . Метод должен суммировать числа\n обернуть их в строку и вернуть результат строкой");
        System.out.println("args: 1 (str), 2 (int)");
        System.out.println(sumStringAndInt("1", 2));
        System.out.println();
        System.out.println("Создайте метод который принимает строку, число. Внутри строки передается число . Проверить , что если число внутри строки больше чем\n число которое передается как int , то пусть метод вернет false , а если меньше , то true");
        System.out.println("args: 23 (str), 43 (int)");
        System.out.println(compare("23", 43));
        System.out.println();
        System.out.println("Создайте метод который принимает 2 булевые переменные . Если обе true , верни true , если хоть одна из них true верни true ,\n если обе false верни false");
        System.out.println("args: true (bool), false (bool)");
        System.out.println(logicSum(true, false));
        System.out.println();
        System.out.println("Создайте метод который принимает число и вернет true если оно четное , и false если оно не четное");
        System.out.println("args: 2 (int)");
        System.out.println(isItEven(2));
        System.out.println();
        System.out.println("Создайте метод который проверят числа в массиве , если все они четные верни \"Массив четных чисел\" , если есть и четные и не\n четные верни \"Массив четных и не четных чисел\" и если в массиве только нечетные числа верни \"Массив не четных чисел\"");
        System.out.println("args: " + Arrays.toString(new int[]{2, 4, 6}));
        System.out.println(arrayOddAndEven(new int[]{2, 4, 6}));
        System.out.println("args: " + Arrays.toString(new int[]{1, 3, 5}));
        System.out.println(arrayOddAndEven(new int[]{1, 3, 5}));
        System.out.println("args: " + Arrays.toString(new int[]{2, 1, 6, 7}));
        System.out.println(arrayOddAndEven(new int[]{2, 1, 6, 7}));
        System.out.println();
        System.out.println("Создайте метод который принимает массив чисел и возвращает новый массив чисел . Внутри метода пройдитесь по элементам\n массива который подается в аргументы  и сложите все элементы в новый массив и верните его");
        System.out.println("args: "+ Arrays.toString(new int[]{3, 2, 1}));
        System.out.println(Arrays.toString(newArray(new int[]{3, 2, 1})));
        System.out.println();
        System.out.println("Создайте метод который принимает массив чисел и возвращает число . Внутри метода пройдитесь по элементам массива который подается в\n аргументы сложите все числа который переданы в массиве и верните сумму всех чисел");
        System.out.println("args: " + Arrays.toString(new int[]{1, 2, 3, 4, 5}));
        System.out.println(arraySum(new int[]{1, 2, 3, 4, 5}));
        System.out.println();
        System.out.println("Создайте методы в которые можно будет передавать свой возраст , а возвращаться сколько полных месяцев в этом возрасте ,\nто есть если человек прожил 10 лет , это 120 месяцев так же сделайте перевод возраста в минуты и метод который расчетает возраст в часах");
        System.out.println("args: 10 (int)");
        System.out.println(ageMonth(10));
        System.out.println();
        System.out.println("age in hours");
        System.out.println("args: 10 (int)");
        System.out.println(ageHour(10));
        System.out.println();
        System.out.println("age in minutes");
        System.out.println("args: 10 (int)");
        System.out.println(AgeMinutes(10));
        System.out.println();
        System.out.println("Создайте метод которому передаю имена , а он проверяет одинаковые ли они , причем не зависимо от регистра");
        System.out.println("args: TesT, test");
        System.out.println(equalityOfNames("TesT", "test"));
        System.out.println();
        System.out.println("Создайте метод которому можно передать массив элементов, а он вернет последний элемент");
        System.out.println("args: " + Arrays.toString(new int[]{1, 2, 3, 4}));
        System.out.println(getLastElementOfArray(new int[]{1, 2, 3, 4}));
        System.out.println();
        System.out.println("Создайте метод счетчик букв А . Подается строка и метод посчитает сколько букв А в строке");
        System.out.println("args: testA");
        System.out.println(numberOfLettersA("testA"));
        System.out.println("args: testa");
        System.out.println(numberOfLettersA("testa"));
        System.out.println();
        System.out.println("Создайте метод кошелек , у него есть начальная сумма и можно вычитать пока деньги не кончатся или сумма не будет слишком велика");
        System.out.println("args: 25, 13");
        System.out.println(wallet(25, 13));
        System.out.println("args: 5, 13");
        System.out.println(wallet(5, 13));
        System.out.println("args: 13, 13");
        System.out.println(wallet(13, 13));
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
    //  число которое передается как int , то пусть метод вернет false, а если меньше , то true

    // fixme: что такое stringNumber, может это что-то типа compare?
    public static boolean compare(String str, int num) {
        boolean more = Integer.parseInt(str) > num;
        return more;
    }

    // TODO: Создайте метод который принимает 2 булевые переменные . Если обе true , верни true , если хоть одна из них true верни true ,
   //    если обе false верни false

    // fixme: как и в комменте ниже, можно назвать logicSum, например
    public static boolean logicSum(boolean B1, boolean B2) {
        return B1 || B2;
    }

    // TODO: Создайте метод который принимает число и вернет true если оно четное , и false если оно не четное
    // fixme: что значит integerNumbers? Может isItEven(...)?
    public static boolean isItEven(int number) {
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

    // TODO: не обязательно это фиксить, но в будущем - если у тебя функция копирования, то и назови её copy
    public static int[] newArray(int[] arr) {
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        return newArray;
    }

    // TODO: потому что можешь сделать так
    //       номинально функция соответствует названию
    //
    //    public static int[] newArray(int[] arr) {
    //        return new int[]{1};
    //    }

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
    //  то есть если человек прожил 10 лет , это 120 месяцев так же сделайте перевод возраста в минуты и метод который расчетает возраст в часах
    public static int ageMonth(int age) {
        return age * 12;
    }

    public static int ageHour(int age) {
        return age * 365 * 24;
    }

    // fixme: что же тут не так?
    public static int AgeMinutes(int age) {
        return age * 365 * 24 * 60;
    }


    // TODO: Создайте метод которому передаю имена , а он проверяет одинаковые ли они , причем не зависимо от регистра
    // fixme: что же тут не так? и посмотри название, мб можно написать словами типа first
    //        не ленись
    public static boolean equalityOfNames(String first, String second) {
        return first.equalsIgnoreCase(second);
    }


    // TODO: Создайте метод которому можно передать массив элементов , а он вернет последний элемент
    public static int getLastElementOfArray(int[] elements) {
        return elements[elements.length - 1];

    }


    // TODO: Создайте метод счетчик букв А . Подается строка и метод посчитает сколько букв А в строке
    // fixme: тест на внимательность - почему на слове testa он выдаёт 0?
    public static int numberOfLettersA(String letters) {
        int count = 0;
        for (int i = 0; i < letters.length(); i++) {
            if (letters.charAt(i) == 'A' || letters.charAt(i) == 'а') {
                count++;
            }
        }
        return count;
    }



    // TODO: Создайте метод кошелек , у него есть начальная сумма и можно вычитать пока деньги не кончатся или сумма не будет слишком велика
    // fixme: тест на внимательность - почему идея подсвечивает слово initialAmount?
    // fixme: что же тут не так?
    // Думаю , что подсвечивает , так как нету такого слова.
    public static String wallet(int amount, int wastes) {
        if (wastes > amount) {
            return "недостаточно средств";
        } else if (amount <= 0) {
            return "сумма на кошельке = 0 или меньше";
        } else {
            int remains = amount - wastes;
            return "остаток" + remains;

        }
    }
}
