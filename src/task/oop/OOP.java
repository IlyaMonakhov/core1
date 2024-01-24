package task.oop;

public class OOP {
    public static void main(String[] args) {
        int nambers = 1;
        String str = "50";

    }

// Реализуйте функциональность согласно описанию

    // TODO: Создайте класс Parent(Родитель) и создайте для него 5 методов.
    //  1. Метод, принимающий 2 числа и возвращающий их сумму.
    //  2. Метод, принимающий строку, в которой передано число, и число, а возвращающий сумму в виде числа.
    //  3. Метод, принимающий строку и возвращающий ее.
    //  4. Метод, не принимающий и не возвращающий ничего, лишь выводящий на экран "I am Parent".
    //  5. Метод, возвращающий конкатенацию (сумму двух строк), принимающий 2 строки.

    public class Parent {
        public static int sum(int a, int b) {
            return a + b;
        }

        public static int summa(String str, int nambers) {
            int tonambers = Integer.parseInt(str);
            return nambers + tonambers;

        }

        public static String strok(String str) {
            return strok(str);
        }

        public static void Massage() {
            System.out.println("I am Parent");
        }

        public static String summaStrok(String str1, String str2) {
            return str1 + str2;
        }
    }


    // TODO: Создайте класс Child1 и переопределите все 5 методов.
    //  1. Первый метод переопределите так, что вместо суммы первый метод перемножает числа, а не складывает.
    //  2. Второй метод переопределите, чтобы получившееся число после суммирования умножалось на 2.
    //  3. Третий метод переопределите, чтобы возвращал только первую букву из строки.
    //  4. Четвертый метод выводит на экран "I am Child1".
    //  5. Пятый метод после слияния двух строк должен обрезать строку и вернуть только ее половину.

    public class Child1 extends Parent {

        public static int sum(int a, int b) {
            return a * b;
        }

        public static int summa(String str, int nambers) {
            int tonambers = Integer.parseInt(str);
            return (nambers + tonambers) * 2;
        }

        public static String strok(String str) {
            return String.valueOf(str.charAt(0));
        }

        public static void Massage() {
            System.out.println("I am Child1");
        }

        public static String summaStrok(String str1, String str2) {
            String sumStr = str1 + str2;
            int polovina = sumStr.length() / 2;
            return sumStr.substring(0, polovina);
        }
    }


    // TODO: Создайте класс Child2 и перегрузите методы.
    //  1. Первый метод примет 3 числа и сложит их.
    //  2. Второй метод примет 3 строки, внутри которых лежат числа, и вернет их сумму.
    //  3. Третий метод примет две строки и вернет их конкатенацию.
    //  4. Четвертый метод примет аргумент строку и выведет на экран "I am Child2" + переданная строка.
    //  5. Пятый метод принимает 3 строки и возвращает их конкатенацию.
    public class Child2 extends Parent {
        public static int sum(int a, int b, int с) {
            return a + b + с;
        }

        public static int summa(String str, String str1, String str2) {
            int tonambers = Integer.parseInt(str);
            int tonambers2 = Integer.parseInt(str1);
            int tonambers3 = Integer.parseInt(str2);
            return tonambers + tonambers2 + tonambers3;

        }

        public static String summaStrok(String stroka1, String stroka2) {
            return stroka1 + stroka2;
        }

        public static void MassageStr(String stroka) {
            System.out.println("I am Child2 " + stroka);
        }

        public static String summaStrok(String stroka1, String stroka2, String stroka3) {
            return stroka1 + stroka2 + stroka3;


        }


        // TODO: Создайте абстрактный класс "Фигура", в котором определены общие свойства и методы для всех геометрических фигур
        //  (например, метод для расчета площади).
        //  От него унаследуйте классы "Круг", "Прямоугольник" и "Треугольник", переопределив специфичные методы для каждой фигуры.
        public abstract class Figura {
            public abstract double calculateFigur();
        }

        public abstract class Krug extends Figura {
            double radius;

            public Krug(double radius) {
                this.radius = radius;
            }

            public double calculateKrug() {
                return Math.PI * radius * radius;
            }
        }

        public abstract class Rectangle extends Figura {
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

        public abstract class Triangle extends Figura {
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
    public static abstract class Employee {
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
    class Manager extends Employee {
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
    class WarehouseWorker extends Employee{
        int Experience;

        public WarehouseWorker(String name, int age) {
            super(name, age);
            this.Experience = Experience;
        }

        public int getExperience() {
            return Experience;
        }
        public void Considers(){
            System.out.println(name + age + Experience);
        }
    }




        }

