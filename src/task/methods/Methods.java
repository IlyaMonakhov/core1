package task.methods;

public class Methods {
    public static void main(String[] args) {
        // Пример вызова метода
        String string = getString("HELLO");
        // Ожидаемый результат hello System.out.println(string);
        // Вызовы ваших методов
        String name1 = "Илья";
        String name2 = "илья";
        int [] arr = {1,6,10};
        String vv = "Привет Абракадабра";
        int NascalnieSredstva = 1000;
        int Trati = 1001;
        System.out.println(Money(NascalnieSredstva,Trati));

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
    public static String sumStrok(String a, String b) {
        return a + b;
    }


    // TODO: создайте метод который примет строку внутри которой передается число , а также принимает число . Метод должен суммировать числа
//  обернуть их в строку и вернуть результат строкой
    public static String sumString(String str, int num) {
        int sum = Integer.parseInt(str) + num;
        String sumStr = String.valueOf(sum);
        return sumStr;
    }

    // TODO: Создайте метод который принимает строку , число . Внутри строки передается число . Проверить , что если число внутри строки больше чем
    //  число которое передается как int , то пусть метод вернет false , а если меньше , то true
    public static boolean StringNumber(String str, int num) {
        int nambers = Integer.parseInt(str);
        boolean bool = nambers < num;
        return bool;
    }

    // TODO: Создайте метод который принимает 2 булевые переменные . Если обе true , верни true , если хоть одна из них true верни true ,
//  если обе false верни false
    public static boolean toBoolean(boolean B1, boolean B2) {
        if (B1 || B2 != false) {
            return true;
        } else {
            return false;
        }
    }

    // TODO: Создайте метод который принимает число и вернет true если оно четное , и false если оно не четное
    public static boolean integerNambers(int booleans) {
        if (booleans % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // TODO: Создайте метод который проверят числа в массиве , если все они четные верни "Массив четных чисел" , если есть и четные и не
    //  четные верни "Массив четных и не четных чисел" и если в массиве только нечетные числа верни "Массив не четных чисел"
    public static String massivNambers(int[] arr) {
        boolean neshet = true;
        boolean shet = true;

        for (int num : arr) {
            if (num % 2 != 0) {
                neshet = false;
            } else {
                shet = false;
            }
        }

        if (neshet) {
            return "Массив четных чисел";
        } else if (shet) {
            return "Массив нечетных чисел";
        } else {
            return "Массив четных и нечетных чисел";
        }
    }

    // TODO: Создайте метод который принимает массив чисел и возвращает новый массив чисел . Внутри метода пройдитесь по элементам
    //  массива который подается в аргументы  и сложите все элементы в новый массив и верните его
    public static int[] sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int[] result = new int[1];
        result[0] = sum;
        return result;
    }

// TODO: Создайте метод который принимает массив чисел и возвращает число . Внутри метода пройдитесь по элементам массива который подается в
//  аргументы сложите все числа который переданы в массиве и верните сумму всех чисел
    public static int ArraysSumma(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
        sum += arr[i];
    }
    return sum;
}

// TODO: Создайте методы в которые можно будет передавать свой возраст , а возвращаться сколько полных месяцев в этом возрасте ,
//  тоесть если человек прожил 10 лет , это 120 месяцевтак же сделайте перевод возраста в минуты и метод который расчетает возраст в часах
    public static int AgeMonths(int age){
        int mounts = age * 12;
        return mounts;
    }
    public static int AgeHour(int age){
        int hour = age * 365 * 24;
        return hour;
    }
    public static int AgeMinutes(int age){
        int minutes = age * 365 * 24 * 60;
        return minutes;
    }


// TODO: Создайте метод которому передаю имена , а он проверяет одинаковые ли они , причем не зависимо от регистра
    public static boolean names(String name1 , String name2){

        return name1.equalsIgnoreCase(name2);

    }


// TODO: Создайте метод которому можно передать массив элементов , а он вернет последний элемент
    public static int MassivElevtnrs(int[] elements){
        int a = elements[elements.length - 1];
        return a;

    }


// TODO: Создайте метод счетчик букв А . Подается строка и метод посчитает сколько букв А в строке
    public static int scetcikA(String stroka){
        int count = 0;
        for (int i = 0; i <stroka.length(); i++){
            if ( stroka.charAt(i) == 'А' || stroka.charAt(i) == 'а') {
                count++;
            }
        }
        return count;

    }


// TODO: Создайте метод кошелек , у него есть началная сумма и можно вычитать пока деньги не кончатся или сумма не будет слишком велика
    public static String Money(int NascalnieSredstva , int Trati){
        if (Trati > NascalnieSredstva){
            return "недостаточно средств";
        } else if (NascalnieSredstva <= 0){
            return "сумма на кошельке = 0 или меньше";
        } else {
            int ostatok = NascalnieSredstva - Trati;
            return "остаток" + ostatok;

        }
    }
