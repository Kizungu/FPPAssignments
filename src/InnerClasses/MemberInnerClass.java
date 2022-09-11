package InnerClasses;

public class MemberInnerClass {
    private String s = "Hello";
     static int y=20;
    int z=17;

    public static void main(String[] args) {
    new MemberInnerClass();


    }
    MemberInnerClass(){
        MyInner inner= new MyInner();
        inner.display();
        int a=MemberInnerClass.y;
//        System.out.println(inner.age);
        System.out.println(z);

    }
     class MyInner{
        int age=31;
        public void display(){
            System.out.println(s);
            System.out.println(y);
            System.out.println(z);
            System.out.println(this.age);
        }

     }


}
