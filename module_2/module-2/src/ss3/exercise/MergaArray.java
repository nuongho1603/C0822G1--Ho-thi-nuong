package ss3.exercise;

import com.sun.scenario.animation.shared.ClipEnvelope;

import java.util.Arrays;
import java.util.Enumeration;

public class MergaArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int index=0;
        int[] addArr = new int[arr1.length + arr2.length];
        for (int i=0;i< arr1.length; i++) {
            addArr[i]=arr1[i];
        }
        for (int i = arr1.length; i<addArr.length;i++) {
            addArr[i] = arr2[index];
            index++;
        }
        System.out.println(Arrays.toString(addArr));


    }
}
