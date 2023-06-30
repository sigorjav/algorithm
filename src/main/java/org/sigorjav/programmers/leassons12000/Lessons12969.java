package org.sigorjav.programmers.leassons12000;

import java.util.Arrays;
import java.util.Scanner;

public class Lessons12969 {
    public static void main(String[] args) {
        int[] arr1 = {9,20,28,18,11};
        int[] arr2 = {30,1,21,17,28};

        int n = 5;

        String space = " ";
        String well = "#";
        String one = "1";

        String[] answer = new String[n];
        for(int i=0;i<arr1.length;i++){
            String[] binaryArr1 = transferBinaryStrArr(arr1[i],n);
            String[] binaryArr2 = transferBinaryStrArr(arr2[i],n);

            for(int j=0;j<binaryArr1.length;j++){
                boolean isEqualToOne = binaryArr1[j].equals(one) || binaryArr2[j].equals(one);

                if(j == 0){
                    answer[i] = isEqualToOne ? well : space;
                } else {
                    answer[i] += isEqualToOne ? well : space;
                }
            }
        }

        System.out.println(Arrays.deepToString(answer));
    }

    static String[] transferBinaryStrArr(int a,int n){
        String binaryStr = Integer.toBinaryString(a);
        String formatStr = String.format("%"+n+"s",binaryStr);

        return formatStr.replaceAll("\\s","0").split("");
    }
}
