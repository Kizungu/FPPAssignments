package Lesson4;

public class Exponential {
    public static void main(String[] args) {
        double x=2;
        int y=5;
        System.out.println(power(x,y));
    }
    public static double power (double x, double n){
        if(n<=0)
            return 1;
        else return x*power(x,n-1);

    }

}

