package InnerClasses;

public class UpperAndInnerClass {
    public static void main(String[] args) {
        UpperAndInnerClass up = new UpperAndInnerClass();
        // We can access the private members of the upper class using the
        // Upper class
        up.age = 9;
        up.name = "Selam";

        System.out.println(up);
        // Invoking the method in upper class
        up.m2();
        // CASE ONE(1)
        UpperAndInnerClass.InnerClass down = up.new InnerClass();
        down.m1();
        // CASE TWO()
        new UpperAndInnerClass().new InnerClass().m1();
        // CASE THREE(3)
        InnerClass in = new UpperAndInnerClass().new InnerClass();
        in.m1();
    }

    public String toString() {
        return "NAME:" + this.name + " AGE: " + this.age;
    }

    private String name;
    private int age;

    int x = 9;
    static int y = 8;

    public UpperAndInnerClass() {
        System.out.println("This is a regular or normal class.");
    }

    public UpperAndInnerClass(String name) {
        System.out.println("This is a regular or normal class." + name);
    }

    public void m2() {
        System.out.println("This is a method in upper class");
    }

    class InnerClass {
        private double sum = 0;

        public void m1() {
            int avg = 10;
            System.out.println("This is the method in inner class");
            // We can access the members of the outer class inside
            // inner class but we not the inner members with the outside
            System.out.println(x);
            System.out.println(y);
            System.out.println(sum);
            System.out.println(avg);
        }
    }

}
