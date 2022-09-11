package Lesson2;

public class Question5 {
    public static void main(String[] args) {
        int[] arr1={1,4,9,12,10,14,19};
        int[] arr2={1,4,9,13,10,14};
        System.out.println(areEqual(arr1,arr2));

    }
    public static boolean areEqual(int[] arr1,int[] arr2){
        if(arr1.length!=arr2.length)
            return false;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i; j<=i; j++) {
                if(arr1[i]==arr2[j])
                    return true;
            }
        }return false;


    }
}

