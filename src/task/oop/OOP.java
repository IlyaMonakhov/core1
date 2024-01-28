package task.oop;


public class OOP {
    public static void main(String[] args) {
        int a = 6;
        int b = 1;

        String str = "50";

        // fixme: почему я не могу создать? понятно ли тебе это?
        //        классы так не пишут, это какой-то оч экстраординарный подход)
        Parent();

// Реализуйте функциональность согласно описанию

        // TODO: Создайте класс Parent(Родитель) и создайте для него 5 методов.
        //  1. Метод, принимающий 2 числа и возвращающий их сумму.
        //  2. Метод, принимающий строку, в которой передано число, и число, а возвращающий сумму в виде числа.
        //  3. Метод, принимающий строку и возвращающий ее.
        //  4. Метод, не принимающий и не возвращающий ничего, лишь выводящий на экран "I am Parent".
        //  5. Метод, возвращающий конкатенацию (сумму двух строк), принимающий 2 строки.

        class Parent {
            public static int sumInt(int numbers1, int numbers2) {
                return numbers1 + numbers2;
            }

            public static int sumString(String str, int nambers) {
                return nambers + Integer.parseInt(str);

            }

            // fixme: strok??
            public static String strok(String str) {
                return str;
            }

            public void message() {
                System.out.println("I am Parent");
            }

            // TODO: название - класс, но аргументы пиши через слова first и second
            public static String concat(String str1, String str2) {
                return str1 + str2;
            }
        }


        // TODO: Создайте класс Child1 и переопределите все 5 методов.
        //  1. Первый метод переопределите так, что вместо суммы первый метод перемножает числа, а не складывает.
        //  2. Второй метод переопределите, чтобы получившееся число после суммирования умножалось на 2.
        //  3. Третий метод переопределите, чтобы возвращал только первую букву из строки.
        //  4. Четвертый метод выводит на экран "I am Child1".
        //  5. Пятый метод после слияния двух строк должен обрезать строку и вернуть только ее половину.

        class Child1 extends Parent {

            public static int sumInt(int length, int Height) {
                return length * Height;
            }

            // fixme: что же тут не так? аж две штуки
            //        запомни, что если добавляешь s, то это множество вещей. а это в java применимо для коллекций и массивов
            public static int Doublenumber(String str, int nambers1) {
                int thonambers = Integer.parseInt(str);
                return (nambers1 + thonambers) * 2;
            }

            public static String firstLetter(String str) {
                return String.valueOf(str.charAt(0));
            }

            public static void Massage() {
                System.out.println("I am Child1");
            }

            public static String lineGender(String string1, String string2) {
                String sumStr = string1 + string2;
                int half = sumStr.length() / 2;
                return sumStr.substring(0, half);
            }
        }


        // TODO: Создайте класс Child2 и перегрузите методы.
        //  1. Первый метод примет 3 числа и сложит их.
        //  2. Второй метод примет 3 строки, внутри которых лежат числа, и вернет их сумму.
        //  3. Третий метод примет две строки и вернет их конкатенацию.
        //  4. Четвертый метод примет аргумент строку и выведет на экран "I am Child2" + переданная строка.
        //  5. Пятый метод принимает 3 строки и возвращает их конкатенацию.
        class Child2 extends Parent {
            public int sum(int a, int b, int с) {
                return a + b + с;
            }

            public static int sumString(String str, String str1, String str2) {
                return Integer.parseInt(str) + Integer.parseInt(str1) + Integer.parseInt(str2);

            }

            public static String sumString(String stroka1, String stroka2) {
                return stroka1 + stroka2;
            }

            // fixme: что же тут не так?
            public void MassageStr(String string) {
                System.out.println("I am Child2 " + string);
            }

            public static String sumStr(String hello, String dear, String user) {
                return hello + dear + user;


            }

        }

        // TODO: Создайте абстрактный класс "Фигура", в котором определены общие свойства и методы для всех геометрических фигур
        //  (например, метод для расчета площади).
        //  От него унаследуйте классы "Круг", "Прямоугольник" и "Треугольник", переопределив специфичные методы для каждой фигуры.

        // fixme: а как же английский?) поправь грамматическую ошибку)
        abstract class Figura {
            // fixme: а как же английский?) поправь грамматическую ошибку)
            public abstract double calculateFigur();
        }

        // fixme: а почему они абстрактные?
        abstract class Circle extends Figura {
            double radius;

            public Circle(double radius) {
                this.radius = radius;
            }

            public double calculateKrug() {
                return Math.PI * radius * radius;
            }
        }

        // fixme: а почему они абстрактные?
        abstract class Rectangle extends Figura {
            double length;
            double width;

            public Rectangle(double length, double width) {
                this.length = length;
                this.width = width;
            }

            public double calculateFigur() {
                return length * width;
            }
        }

        // fixme: а почему они абстрактные?
        abstract class Triangle extends Figura {
            private double base;
            private double height;

            public Triangle(double base, double height) {
                this.base = base;
                this.height = height;
            }

            public double calculateFigur() {
                return 0.5 * base * height;
            }
        }

    }

    // TODO: Создайте абстрактный класс "Сотрудник", в котором определены общие характеристики для всех сотрудников (например, имя, возраст).
    //  Создайте подклассы для различных типов сотрудников (например, "Менеджер", "Работник склада"),
    //  в которых можно описать специфичные методы и свойства.
    abstract class Employee {
        String name;
        int age;

        public Employee(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    // тут правильно, а там нет
    class Manager extends Employee {
        // fixme: что же тут не так?
        int Profit;


        public Manager(String name, int age, int Profit) {
            super(name, age);
            this.Profit = Profit;
        }

        public int getProfit() {
            return Profit;
        }

        public void receiving() {

            System.out.println(name + age + Profit);
        }
    }

    class WarehouseWorker extends Employee {
        // fixme: что же тут не так?
        int Experience;

        public WarehouseWorker(String name, int age) {
            super(name, age);
            this.Experience = Experience;
        }

        public int getExperience() {
            return Experience;
        }

        public void Considers() {
            System.out.println(name + age + Experience);
        }
    }
}





