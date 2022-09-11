package Lesson4;

public class MinimumChar {
    public static void main(String[] args) {
        String fruit ="banana";
        System.out.println(getTheSmallest(fruit,0));
    }

    public static char getTheSmallest(String str, int first){
        if(first==str.length()-1)
            return str.charAt(first);
        else{
            char min= getTheSmallest(str, first+1);
            if(str.charAt(first)<=min)
                return str.charAt(first);
            else
                return min;
        }
    }
}
