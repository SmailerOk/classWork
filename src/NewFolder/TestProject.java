package NewFolder;

import java.util.Arrays;
import java.util.Scanner;

public class TestProject {
    public static void main(String[] args) {
        getSquare();
        int[] array = {1,5,4,6,8,6,4,3,2,2};
        reverseArray(array);
    }

    public static void getSquare(){
        int x1 = 5, y1 = 3, x2 = 0, y2 = 0, x3 = 2, y3 = 4;
        int square = ((x1 - x3)*(y2 - y3) - (x2 - x3)*(y1 - y3))/2;
        System.out.println(Math.abs(square));
    }
    public static void reverseArray(int[] array){
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++){
            newArray[i] = array[array.length - i - 1];
        }
        System.out.println(Arrays.toString(newArray));
    }
}
