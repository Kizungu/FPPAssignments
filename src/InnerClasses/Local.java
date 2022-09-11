package InnerClasses;

public class Local {
    private int x = 8;
    private int y = 7;

    public Local() {
        System.out.println("This is the local method inner class concept.");
    }

    public void inner() {
        System.out.println("This is the local method");
        final int z=12;
        class InnerClass{
            private int checker= 8;
            public void innerMostMethod(int x) {
                int show=200;
                System.out.println(show);
                System.out.println(z);
                System.out.println(checker);
                int y=100;
                System.out.println(x+y);
                System.out.println("This is the inner most class");
            }
        }

        InnerClass in= new InnerClass();
        in.innerMostMethod(100);
        in.innerMostMethod(200);
        in.innerMostMethod(300);
    }

    public static void main(String[] args) {
        Local local= new Local();
        local.inner();
    }
}
