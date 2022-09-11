public class BinaryToDecimal {
    public static int binary(int n){
        if (n == 0) return 0;
        else return n % 2 + 10 * binary (n / 2);

    }

    public static void main(String[] args) {
        System.out.println(BinaryToDecimal.binary(100));

    }

}
